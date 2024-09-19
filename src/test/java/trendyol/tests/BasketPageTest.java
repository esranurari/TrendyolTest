package trendyol.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import trendyol.pages.BasketPage;
import trendyol.pages.HomePage;
import trendyol.pages.LoginPage;
import trendyol.utilities.*;

public class BasketPageTest {



    BasketPage basketPage = new BasketPage();
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void beforeClass() {
        Driver.getDriver().get(ConfigReader.getProperty("trendyolUrl"));


        if (loginPage.cookieAccept.isDisplayed()){
            loginPage.cookieAccept.click();
        }

        loginPage.countryDropdown.click();
        ReusableMethods.waitForSecond(2);
        ActionsUtils.hoverOver(loginPage.countryDropdown);
        ReusableMethods.waitForSecond(2);
        loginPage.optionsMenu.click();

        ReusableMethods.visibleWait(loginPage.turkeyButton,10);
        loginPage.turkeyButton.click();
        loginPage.saveButton.click();



    }

    @BeforeMethod
    public void setUp() {


        HomePage homePage=new HomePage();
        homePage.searchBox.sendKeys(ConfigReader.getProperty("searchWord"), Keys.ENTER);



    }

    @AfterMethod
    public void tearDown() {

        // Driver.closeDriver();
    }
// 1. https://www.trendyol.com/ adresine gidin
    //2. Ana sayfanın açıldığını kontrol edin.
    //3. Yanlış bilgilerle siteye giriş yapılmaya çalışılıyor.
    //4. Arama kutusuna “dizüstü bilgisayar” kelimesi girilir.
    // 5. Çıkan sonuca göre ürünler arasından rastgele bir ürün seçilir.
    //6. Seçilen ürün sepete eklenir.
    //7. Ürünün sepete eklenmeden önceki fiyatı ile sepete eklendikten sonraki fiyatı aynı mı?
    //8. Sepetteki ürün sayısını ikiye çıkarın ve doğruluğunu kontrol edin.
    // 9. Sepetteki tüm ürünleri silin ve sepetin dolu olup olmadığını kontrol edin.

    @Test
    public void test01() {

        int productIndex = (int) (Math.random()*basketPage.productList.size());
        basketPage.productList.get(productIndex).click();
        BrowserUtils.windowSwitchTo(1);
        basketPage.selectLocation.click();
        String priceBeforeAddition= basketPage.priceBeforeAddToBasket.getText();
        basketPage.addToBasket.click();
        WaitUtils.waitForVisibility(basketPage.numberOfItemsInBasket,3);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(basketPage.numberOfItemsInBasket.getText(), "1");

        basketPage.myBasket.click();
        basketPage.additionalService.click();

        softAssert.assertEquals(basketPage.priceAfterAddBasket.getText(),priceBeforeAddition);

        System.out.println(basketPage.productQuantityIncrease.isEnabled());
        if (basketPage.productQuantityIncrease.isEnabled()){

            basketPage.productQuantityIncrease.click();
            WaitUtils.waitFor(5);
            System.out.println(basketPage.productQuantity.getAttribute("value"));
            softAssert.assertEquals(basketPage.productQuantity.getAttribute("value"),"2");
        }else{
            System.out.println("en fazla bir urun var urun sayisi artirilamadi");
        }
        basketPage.productDelete.click();

        WaitUtils.waitFor(6);
        basketPage.myBasket.click();
        softAssert.assertTrue(basketPage.emptyBasket.isDisplayed());

        softAssert.assertAll();
    }
}