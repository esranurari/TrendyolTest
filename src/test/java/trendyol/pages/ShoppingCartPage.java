package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class ShoppingCartPage {
    public ShoppingCartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='button wc-forward']")
    public WebElement viewCartButton;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement proceedToCheckoutButton;
    @FindBy(id = "billing_first_name")
    public WebElement billingDetailsFirstName;
    @FindBy(id = "billing_last_name")
    public WebElement billingDetailsLastName;
    @FindBy(id = "select2-billing_country-container")
    public WebElement billingDetailsCountryRegionDropdown;
    @FindBy(name = "billing_address_1")
    public WebElement billingDetailsStreetAddress ;
    @FindBy(name = "billing_postcode")
    public WebElement billingDetailsPostcodeZip;
    @FindBy(name = "billing_city")
    public WebElement billingDetailsTownCity ;
    @FindBy(name = "billing_phone")
    public WebElement billingDetailsPhone;
    @FindBy(id = "payment_method_bacs")
    public WebElement paymentMethodsWireTransferEft;
    @FindBy(id = "payment_method_cod")
    public WebElement paymentMethodsPayAtTheDoor;
    @FindBy(id = "place_order")
    public WebElement placeOrderButton;
    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement quantityPlusButton;
    @FindBy(xpath = "//button[@class='quantity-minus w-icon-minus']")
    public WebElement quantityMinusButton;
    @FindBy(xpath = "//button[@value='Update cart']")
    public WebElement updateCartButton;
    @FindBy(id = "coupon_code")
    public WebElement couponCodeSearchBox;
    @FindBy(name = "apply_coupon")
    public WebElement applyCouponButton;


    //Coupon Operations;
    @FindBy(xpath = "(//a[.='Coupons'])")
    public WebElement couponsButton;
    @FindBy(xpath = "(//a[.='Add New'])")
    public WebElement addNewCouponButton;
    @FindBy(xpath = "//input[@id='title']")
    public WebElement couponCodeField;
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionField;
    @FindBy(xpath = "//select[@id='discount_type']")
    public WebElement discountTypeDropdown;
    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmountField;
    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement allowFreeShippingCheckbox;
    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement couponExpiryDateField;
    @FindBy(xpath = "//a[.='Usage Restriction']")
    public WebElement usageRestrictionTab;
    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minimumSpendField;
    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maximumSpendField;
    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement individualUseOnlyCheckbox;
    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement excludeSaleItemsCheckbox;
    @FindBy(xpath = "//*[@id='publish']")
    public WebElement saveCouponButton;







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
