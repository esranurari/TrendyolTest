package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //MyAccountPage Locators
    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement myAccountText;
    @FindBy(xpath = "//a[.='Dashboard']")
    public WebElement dashboard;
    @FindBy(xpath = "//a[.='Orders']")
    public WebElement orders;
    @FindBy(xpath = "//a[.='Downloads']")
    public WebElement downloads;
    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement addresses;
    @FindBy(xpath = "//a[.='Account details']")
    public WebElement accountDetails;
    @FindBy(xpath = "(//a[.='Wishlist'])[1]")
    public WebElement wishlist1;
    @FindBy(xpath = "//a[.='Chat Box']")
    public WebElement chatBox;
    @FindBy(xpath = "//a[.='Support Tickets']")
    public WebElement supportTickets;
    @FindBy(xpath = "//a[.='Followings']")
    public WebElement followings;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButtonOnTheLeftSide;
    @FindBy(xpath = "//*[.='Log out']")
    public WebElement logoutButtonUnderMyAccountText;   //aslında buna gerek yok yapmalı mıyım?
    @FindBy(xpath = "//*[@class='icon-box-icon icon-orders']")
    public WebElement ordersButtonFromSmallPicture;
    @FindBy(xpath = "//*[@class='icon-box-icon icon-downloads']")
    public WebElement downloadsButtonFromSmallPicture;
    @FindBy(xpath = "//*[@class='icon-box-icon icon-addresses']")
    public WebElement addressesButtonFromSmallPicture;
    @FindBy(xpath = "//*[@class='icon-box-icon icon-account']")
    public WebElement accountDetailsButtonFromSmallPicture;
    @FindBy(xpath = "//*[@class='icon-box-icon icon-wishlist']")
    public WebElement wishlistButtonFromSmallPicture;
    @FindBy(xpath = "//*[@class='icon-box-icon icon-logout']")
    public WebElement logoutButtonFromSmallPicture;
    @FindBy(xpath = "//*[a='Become a Vendor']")
    public WebElement becomeVendorButtonUnderSmallPictures;

    //MyAccount -> Addresses Locators
    //BillingAddress
    @FindBy(xpath = "(//a[.='Add'])[1]")
    public WebElement addBillingAddress;
    @FindBy(id = "billing_first_name")
    public WebElement billingFirstName;
    @FindBy(id = "billing_last_name")
    public WebElement billingLastName;
    @FindBy(id = "billing_company")
    public WebElement billingCompanyName;
    @FindBy(id = "select2-billing_country-container")
    public WebElement billingCountryRegion;
    @FindBy(id = "billing_address_1")
    public WebElement billingStreetAddress;
    @FindBy(id = "billing_city")
    public WebElement billingTownCity;
    @FindBy(id = "select2-billing_state-container")
    public WebElement billingState;
    @FindBy(id = "billing_postcode")
    public WebElement billingZipCode;
    @FindBy(id = "billing_phone")
    public WebElement billingPhone;
    @FindBy(id = "billing_email")
    public WebElement billingEmail;
    @FindBy(xpath = "//*[@value='Save address']")
    public WebElement billingSaveAddressButton;
    @FindBy(xpath = "//a[.='Edit Your Billing Address']")
    public WebElement editYourBillingAddress;

    //BillingAddress required fields alerts;
    @FindBy(xpath = "//*[@data-id='billing_first_name']")
    public WebElement firstNameAlertForBilling;
    @FindBy(xpath = "//*[@data-id='billing_last_name']")
    public WebElement lastNameAlertForBilling;
    @FindBy(xpath = "//*[@data-id='billing_country']")
    public WebElement countryRegionAlertForBilling;
    @FindBy(xpath = "//*[@data-id='billing_address_1']")
    public WebElement streetAddressAlertForBilling;
    @FindBy(xpath = "//*[@data-id='billing_postcode']")
    public WebElement postcodeAlertForBilling;
    @FindBy(xpath = "//*[@data-id='billing_city']")
    public WebElement townCityAlertForBilling;
    @FindBy(xpath = "//*[@data-id='billing_phone']")
    public WebElement phoneAlertForBilling;
    @FindBy(xpath = "//*[@data-id='billing_email']")
    public WebElement emailAlertForBilling;
    @FindBy(xpath ="//div[@role='alert']")
    public WebElement addressChangedBillingText;



    //ShippingAddress
    @FindBy(xpath = "(//*[contains(text(),'Add')])[7]")
    public WebElement addShippingAddress;
    @FindBy(id = "shipping_first_name")
    public WebElement shippingFirstName;
    @FindBy(id = "shipping_last_name")
    public WebElement shippingLastName;
    @FindBy(id = "select2-shipping_country-container")
    public WebElement shippingCountryRegion;
    @FindBy(id = "shipping_address_1")
    public WebElement shippingStreetAddress;
    @FindBy(id = "shipping_city")
    public WebElement shippingTownCity;
    @FindBy(id = "select2-shipping_state-container")
    public WebElement shippingState;
    @FindBy(id = "shipping_postcode")
    public WebElement shippingZipCode;
    @FindBy(xpath = "//*[@value='Save address']")
    public WebElement shippingSaveAddressButton;
    @FindBy(xpath = "//a[contains(text(),'Edit Your Shipping Address')]")
    public WebElement editYourShippingAddress;

    //ShippingAddress required fields alerts;
    @FindBy(xpath = "//li[@data-id='shipping_first_name']" )
    public WebElement requiredFirstName;
    @FindBy(xpath = "//li[@data-id='shipping_last_name']")
    public WebElement requiredLastName;
    @FindBy(xpath = "//li[@data-id='shipping_address_1']")
    public WebElement requiredAddress1;
    @FindBy(xpath = "//li[@data-id='shipping_postcode']")
    public WebElement requiredZipCode;
    @FindBy(xpath = "//li[@data-id='shipping_city']")
    public WebElement requiredTownCity;
    @FindBy(xpath = " //li[@data-id='shipping_state']")
    public WebElement requiredProvince;
    @FindBy(xpath ="//div[@role='alert']")
    public WebElement addressChangedText;


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
