package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class VendorPage {
    public VendorPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    //VendorPage Locators


    //Vendor Registration Bolumu
    @FindBy(id = "user_email")
    public WebElement vendorRegistrationEmail;
    @FindBy(xpath = "//*[@name='wcfm_email_verified_input']")
    public WebElement vendorRegistrationVerificationCode;
    @FindBy(xpath = "//*[@value='Re-send Code']")
    public WebElement vendorRegistrationResendCode;
    @FindBy(id = "passoword")
    public WebElement vendorRegistrationPassword;
    @FindBy(id = "confirm_pwd")
    public WebElement vendorRegistrationConfirmPassword;
    @FindBy(id = "wcfm_membership_register_button")
    public WebElement vendorRegisterButton;

    @FindBy(xpath = "//*[@class='short']")
    public WebElement passwordStrengthTooShort;
    @FindBy(xpath = "//*[@class='weak']")
    public WebElement passwordStrengthWeak;
    @FindBy(xpath = "//*[@class='good']")
    public WebElement passwordStrengthGood;
    @FindBy(xpath = "//*[@class='strong']")
    public WebElement passwordStrengthStrong;



    //Store Manager islemleri
    @FindBy(xpath = "//a[.='Store Manager']")
    public WebElement storeManagerButton;
    @FindBy(xpath = "//a[@class='wcfm_menu_item active']")
    public WebElement storeManagerProductButton;
    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")
    public WebElement addnewButton;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_inventory_head']")
    public WebElement inventory;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_shipping_head']")
    public WebElement shipping;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributes;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_linked_head']")
    public WebElement linked;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_yoast_head']")
    public WebElement seo;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_advanced_head']")
    public WebElement advanced;
    @FindBy(xpath = "//input[@class='wcfm-text']")
    public WebElement skuTextbox;
    @FindBy(xpath = "//input[@id='manage_stock']")
    public WebElement manageStockCheckbox;
    @FindBy(xpath = "//select[@name='stock_status']")
    public WebElement stockStatusDropdown;
    @FindBy(xpath = "//input[@id='sold_individually']")
    public WebElement soldindividuallyCheckbox;
    @FindBy(xpath = "//input[@id='weight']")
    public WebElement weightTextbox;
    @FindBy(xpath = "//input[@id='length']")
    public WebElement lenghtTextbox;
    @FindBy(xpath = "//input[@id='width']")
    public WebElement widthTextbox;
    @FindBy(xpath = "//input[@id='height']")
    public WebElement heightTextbox;
    @FindBy(xpath = "//select[@name='shipping_class']")
    public WebElement shippingClassDropdown;
    @FindBy(xpath = "//select[@name='_wcfmmp_processing_time']")
    public WebElement processingTimeDropdown;
    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement colorCheckbox;
    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement activeCheckbox;
    @FindBy(xpath = "//input[@id='attributes_is_visible_1']")
    public WebElement visibleCheckbox;
    @FindBy(xpath = "//select[@name='attributes[1][value][]']")
    public WebElement colorDropdown;
    @FindBy(xpath = "(//button[.='Select none'])[1]")
    public WebElement selectNoneButton;
    @FindBy(xpath = "(//button[.='Add New'])[1]")
    public WebElement addNewButton;
    @FindBy(xpath = "(//button[.='Select all'])[1]")
    public WebElement selectAllButton;
    @FindBy(xpath = "//input[@id='attributes_is_active_2']")
    public WebElement sizeCheckbox;

    //Vendor MyAccount Bolumu
    @FindBy(xpath = "//*[contains(text(),'Sign Out')]")
    public WebElement vendorSignOut;
    @FindBy(xpath = "(//a[contains(text(),'Orders')])[1]")
    public WebElement vendorMyAccountOrdersLink;
    @FindBy(xpath = "(//a[contains(text(),'Downloads')])[1]")
    public WebElement vendorMyAccountDownloadLink;
    @FindBy(xpath = "(//a[normalize-space()='Addresses'])[1]")
    public WebElement vendorMyAccountAddressLink;
    @FindBy(xpath = "(//a[normalize-space()='Account details'])[1]")
    public WebElement vendorMyAccountDetailsLink;
    @FindBy(xpath = "(//a[normalize-space()='Wishlist'])[2]")
    public WebElement vendorMyAccountWishlistLink;
    @FindBy(xpath = "(//a[normalize-space()='Support Tickets'])[1]")
    public WebElement vendorMyAccountSupportTicketLink;
    @FindBy(xpath = "(//a[normalize-space()='Followings'])[1]")
    public WebElement vendorMyAccountFollowingsTicketLink;
    @FindBy(xpath = "(//a[normalize-space()='Logout'])[1]")
    public WebElement vendorMyAccountLogoutLink;
    @FindBy(xpath = "//*[.='My Store']")
    public WebElement vendorMyAccountMyStoreText;
    @FindBy(xpath = "//a[contains(text(),'#91482')]")
    public WebElement vendorMyAccountOrdersOrderText;
    @FindBy(xpath = "//time[contains(text(),'21 September 2024')]")
    public WebElement vendorMyAccountOrdersTimeText;
    @FindBy(xpath = "(//td[@data-title='Status'])[1]")
    public WebElement vendorMyAccountOrdersStatusText;
    @FindBy(xpath = "//p[.='No downloads available yet.']")
    public WebElement vendorMyAccountDownloadsControlText;
    @FindBy(id = "account_display_name")
    public WebElement vendorMyAccountDetailsEmailTextbox;
    @FindBy(xpath = "//a[contains(text(),'1984 George Orwell')]")
    public WebElement vendorMyAccountWishlistProductText;
    @FindBy(xpath = "//a[contains(text(),'Ticket #000065')]")
    public WebElement vendorMyAccountSupportTicketLinkTicketText;
    @FindBy(xpath = "//td[@data-title='NO Followings']")
    public WebElement vendorMyAccountFollowingsControlText;



    //Store Manager Products;
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    public WebElement productsButton;
    @FindBy(xpath = "//span[text()='Add New']")
    public WebElement productsAddNewButton;
    @FindBy(css = ".message_count")
    public WebElement notificationNUmber;
    @FindBy(css = ".unread_notification_count notice_count")
    public WebElement announcementButton;
    @FindBy(xpath = "//i[@class='wcfmfa fa-book'] ")
    public WebElement knowledgebaseButton;
    @FindBy(css = "#product_type")
    public WebElement simpleProduct;
    @FindBy(css = "#is_virtual")
    public WebElement virtualCheckBox;
    @FindBy(css = "#is_downloadable")
    public WebElement downloadableCheckBox;
    @FindBy(css = "#pro_title")
    public WebElement productTitleButton;
    @FindBy(css = "#regular_price")
    public WebElement addProductRegularPrice;
    @FindBy(css = "#sale_price")
    public WebElement addProductSalePrice;
    @FindBy(css = "#insert-media-button")
    public WebElement addMediaButton;
    @FindBy(css = "#excerpt_ifr")
    public WebElement shortDescriptionIframe;
    @FindBy(css = "#tinymce")
    public WebElement shortDescription ;
    @FindBy(css = "#__wp-uploader-id-1")
    public WebElement selectFiles;
    @FindBy(css = "#description_ifr")
    public WebElement descriptionIframe;
    @FindBy(css = "#tinymce")
    public WebElement description;
    @FindBy(css = "#featured_img_display")
    public WebElement imageDisplay;
    @FindBy(css = "#gallery_img_gimage_0_display")
    public WebElement smallImageDisplay;
    @FindBy(xpath = "//strong[text()='Categories']")
    public WebElement selectCategories;
    @FindBy(xpath = "//p[text()='+Add new category']")
    public WebElement addNewCategory;
    @FindBy(xpath = "//strong[text()='Product brands']")
    public WebElement selectProductBrands;
    @FindBy(xpath = "//p[text()='+Add new Product brands']")
    public WebElement addNewProductBrands;
    @FindBy(css = "#product_tags")
    public WebElement seperateProductsTags;
    @FindBy(xpath = "//p[text()='Choose from the most used tags']")
    public WebElement chooseFromTheMostUsedTags;
    @FindBy(css = "#catalog_visibility")
    public WebElement selectCatalogVisibility;
    @FindBy(css = "#wcfm_products_simple_draft_button")
    public WebElement draftButton;
    @FindBy(css = "#wcfm_products_simple_submit_button")
    public WebElement submitButton;








    //Checkout islemleri;
    @FindBy(xpath = "//span[contains(text(),'Chess')]")
    public WebElement chessControlText;
    @FindBy(xpath = "//span[@class='cart-count'][1]")
    public WebElement chessAddToCart;
    @FindBy(xpath = "//input[@name='billing_first_name']")
    public WebElement checkoutFirstNameTextBox;
    @FindBy(xpath = "//input[@name='billing_last_name']")
    public WebElement checkoutLastNameTextBox;
    @FindBy(xpath = "//input[@name='billing_company']")
    public WebElement checkoutCompanyNameTextBox;
    @FindBy(xpath = "//span[@class='select2-selection__rendered'][1]")
    public WebElement checkoutCountryRegionTextBox;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement checkoutStreetAddressTextBox;
    @FindBy(xpath = "//input[@id='billing_address_2']")
    public WebElement checkoutStreetAddress2TextBox;
    @FindBy(xpath = "//input[@name='billing_postcode']")
    public WebElement checkoutStreetPostcodeTextBox;
    @FindBy(xpath = "//input[@name='billing_city']")
    public WebElement checkoutTownCityTextBox;
    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement checkoutPhoneTextBox;
    @FindBy(xpath = "//input[@name='billing_phone']")
    public WebElement checkoutStateCountryTextBox;
    @FindBy(xpath = "//input[@name='billing_email']")
    public WebElement checkoutEmailTextBox;
    @FindBy(xpath = "//span[contains(text(),'Ship to a different address?')]")
    public WebElement checkoutShipDifferentAddressCheckBox;
    @FindBy(xpath = "//textarea[@id='order_comments']")
    public WebElement checkoutOrdersNotesTextBox;
    @FindBy(xpath = "//button[@value='Place order']")
    public WebElement checkoutPlaceOrdersButton;
    @FindBy(xpath = "//p[.=Thank you. Your order has been received.']")
    public WebElement checkoutThankYouText;




    //Vendor-Shipping islemleri
    @FindBy(xpath = "//a[.='Edit Your Shipping Address']")
    public WebElement editShipAddress;
    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement editShipFirstName;
    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public WebElement editShipLastName;
    @FindBy(xpath = "//input[@id='shipping_company']")
    public WebElement editShipCompanyName;
    @FindBy(xpath = "//span[@id='select2-shipping_country-container']")
    public WebElement editShipCountryName;
    @FindBy(xpath = "//input[@id='shipping_address_1']")
    public WebElement editShipStreetAddress;
    @FindBy(xpath = "//input[@id='shipping_postcode']")
    public WebElement editShipZip;
    @FindBy(xpath = "//input[@id='shipping_city']")
    public WebElement editShipTown;
    @FindBy(xpath = "//span[@id='select2-shipping_state-container']")
    public WebElement editShipProvince;
    @FindBy(xpath = "//button[.='Save address']")
    public WebElement editShipSaveButton;
    @FindBy(xpath = "//div[@re='alert']")
    public WebElement editShipSuccesfully;
    @FindBy(xpath = "//li[@data-id='shipping_first_name']")
    public WebElement editShipFirstRequired;
    @FindBy(xpath = "//li[@data-id='shipping_last_name']")
    public WebElement editShipLastRequired;
    @FindBy(xpath = "//li[@data-id='shipping_address_1']")
    public WebElement editShipStreetRequired;
    @FindBy(xpath = "//li[@data-id='shipping_postcode']")
    public WebElement editShipZIPRequired;
    @FindBy(xpath = "//li[@data-id='shipping_city']")
    public WebElement editShipTownRequired;





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
