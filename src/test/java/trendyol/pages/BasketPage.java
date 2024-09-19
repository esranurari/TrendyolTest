package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

import java.util.List;

public class BasketPage {


    /*
     PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki elementleri
     webdriver ile eslestirir, Bu sayede classtaki webelementlere erismek icin @FindBy gibi
     pagefactory e yardimci notasyonlar kullanilabilir hale gelir
     */
    public BasketPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='p-card-chldrn-cntnr card-border']/a")
    public List<WebElement> productList;



    @FindBy(xpath = "//button[text()='Anladım']")
    public WebElement selectLocation;

    @FindBy(xpath = "//div[@class='product-price-container']//span")
    public WebElement priceBeforeAddToBasket;

    @FindBy(xpath = "//div[@class='product-button-container']/button")
    public WebElement addToBasket;

    @FindBy(xpath = "//div[@class='basket-item-count-container visible']")
    public WebElement numberOfItemsInBasket;

    @FindBy(xpath = "//a[@class='link account-basket']")
    public WebElement myBasket;

    @FindBy(xpath = "//button[text()='Anladım']")
    public WebElement additionalService;

    @FindBy(xpath = "//div[@class='pb-basket-item-price']")
    public WebElement priceAfterAddBasket;

    @FindBy(xpath = "//button[@aria-label='Ürün adedi arttırma']")
    public WebElement productQuantityIncrease;

    @FindBy(xpath = "//input[@class='counter-content']")
    public WebElement productQuantity;

    @FindBy(xpath = "//div[@class='toastrElement success']")
    public WebElement successfullyUpdatedMessage;

    //@FindBy(xpath = "//div[@class='toastrElement error']/span")

    @FindBy(xpath = "//button[@aria-label='Ürünü sepetten çıkartma']")
    public WebElement productDelete;

    @FindBy(xpath = "//span[text()='Sepetinde ürün bulunmamaktadır.']")
    public WebElement emptyBasket;











    //esra 76-200 arası






    //Naciye 210-250 arası




    //Nesibe 260-400 arası



}