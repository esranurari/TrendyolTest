package trendyol.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import trendyol.pages.HomePage;
import trendyol.pages.LoginPage;
import trendyol.utilities.ActionsUtils;
import trendyol.utilities.ConfigReader;
import trendyol.utilities.Driver;
import trendyol.utilities.ReusableMethods;

public class C01 {
    public String hasan;
    //aşırı yaratıcı bir ekleme yaptım bravo
    //esra bunu ekledi selamlar
    // 1. https://www.trendyol.com/ adresine gidin
    // 2. Ana sayfanın açıldığını kontrol edin.
    // 3. Yanlış bilgilerle siteye giriş yapılmaya çalışılıyor.
    // 4. Arama kutusuna "dizüstü bilgisayar" kelimesi girilir.
    // 5. Çıkan sonuca göre ürünler arasından rastgele bir ürün seçilir.
    // 6. Seçilen ürün sepete eklenir.
    // 7. Ürünün sepete eklenmeden önceki fiyatı ile sepete eklendikten sonraki fiyatı aynı mı?
    // 8. Sepetteki ürün sayısını ikiye çıkarın ve doğruluğunu kontrol edin.
    // 9. Sepetteki tüm ürünleri silin ve sepetin dolu olup olmadığını kontrol edin.



    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("trendyolUrl"));
        LoginPage loginPage = new LoginPage();

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


    @Test
    public void test02() {


        HomePage homePage =new HomePage();
        homePage.searchBox.sendKeys(ConfigReader.getProperty("searchWord"), Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty("searchWord")));
    }

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("trendyolUrl"));
        LoginPage loginPage = new LoginPage();

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

        //buradan itibaren normal devam tr sitesi
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("trendyolUrl"));














        /*



        WebElement signInButton = driver.findElement(By.xpath("//div[@class='link account-user']"));
        signInButton.click();
         */

    }
}
