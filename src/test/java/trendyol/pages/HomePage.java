package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

import java.util.List;

public class HomePage {

    /*
     PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki elementleri
     webdriver ile eslestirir, Bu sayede classtaki webelementlere erismek icin @FindBy gibi
     pagefactory e yardimci notasyonlar kullanilabilir hale gelir
     */
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }














    @FindBy(xpath = "//div[@class='modal-close']")
    public WebElement popupClose;

    @FindBy(id="onetrust-accept-btn-handler")
    public WebElement cookiesAccept;


    @FindBy(xpath = "//span[@class='i-cancel']")
    public WebElement allCategoryHere;

    @FindBy(className = "V8wbcUhU")
    public WebElement searchBox;





}
