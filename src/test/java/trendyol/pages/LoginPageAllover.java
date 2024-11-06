package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class LoginPageAllover {
    public LoginPageAllover() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //LoginPage Locators

    //SignInPage Locators

    @FindBy(id = "username")
    public WebElement usernameTextBox;
    @FindBy(id = "password")
    public WebElement passwordTextBox;
    @FindBy(id = "rememberme")
    public WebElement rememberMeCheckBox;
    @FindBy(xpath = "//button[@value='Sign In']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[contains(text(),'Wrong username or password.')]")
    public WebElement wrongTextMessage;

    //SignUpPage Locators

    @FindBy(xpath = "(//*[.='Sign Up'])[1]")
    public WebElement signUp;
    @FindBy(id = "reg_username")
    public WebElement usernameTextBoxForSignUp;
    @FindBy(id = "reg_email")
    public WebElement emailTextBoxForSignUp;
    @FindBy(id = "reg_password")
    public WebElement passwordTextBoxForSignUp;
    @FindBy(xpath = "//*[@class='woocommerce-password-strength short']")
    public WebElement passwordStrengthLevelForSignUpVeryWeak;
    @FindBy(xpath = "//*[@class='woocommerce-password-strength bad']")
    public WebElement passwordStrengthLevelForSignUpWeak;
    @FindBy(xpath = "//*[@class='woocommerce-password-strength good']")
    public WebElement passwordStrengthLevelForSignUpMedium;
    @FindBy(xpath = "//*[@class='woocommerce-password-strength strong']")
    public WebElement passwordStrengthLevelForSignUpStrong;
    @FindBy(xpath = "//*[@class='woocommerce-password-hint']")
    public WebElement passwordContainsTextForSignUp;
    @FindBy(xpath = "//*[@class='register_as_vendor']")
    public WebElement signUpAsAVendorOption;
    @FindBy(id = "register-policy")
    public WebElement approveToThePrivacyPolicy;
    @FindBy(xpath = "(//*[.='Sign Up'])[2]")
    public WebElement signUpButton;
    @FindBy(xpath = "//a[.='Become a Vendor']")
    public WebElement becomeVendorOption;
    @FindBy(xpath = "//*[contains(text(),'An account is already registered')]")
    public WebElement errorMessage;







    //    Taha Aslan(143-163)





















//    Nihat Kurt(165-185)






















//    Hasan Ali(188-208)





















//    Esra Yazar(210-230)





















//    Nermin Mercan Okuyucu(232-252)





















//    Ülker Huseynova(254-274)





















//    Nesibe Zehra Atay(276-296)























//    Seval Aslan(300-360)





























































//    Sefa Küçük(362-382)





















//    Emre Kılınç(384-420)





































//    Ayşe Bozgeyik(422-444)



























//    Naciye Macit Sezikli(450-)




































































































}
