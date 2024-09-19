package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cookieAccept;

    @FindBy(className = "selected-country-flag-wrapper")
    public WebElement countryDropdown;
    @FindBy(xpath = "//*[@id='header']/header/section[1]/div/div/div[2]/section/li")
    public WebElement optionsMenu;
    @FindBy(xpath = "//*[@id='header']/header/section[1]/div/div/div[2]/section/ul/li[1]/p")
    public WebElement turkeyButton;
    @FindBy(xpath = "//*[@id='header']/header/section[1]/div/div/div[2]/button")
    public WebElement saveButton;

    @FindBy(xpath = "//p[text()='Giriş Yap']")
    public WebElement loginText;

    @FindBy(xpath = "//div[@class='login-button']")
    public WebElement loginButton;

    @FindBy(id = "login-email")
    public WebElement emailBox;

    @FindBy(id = "login-password-input")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[@class='message']")
    public WebElement errorMessage;

    @FindBy(id = "error-box-wrapper")
    public WebElement errorBox;






}
