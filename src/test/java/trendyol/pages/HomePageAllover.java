package trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import trendyol.utilities.Driver;

public class HomePageAllover {
    public HomePageAllover() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //HomePage Locators

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@class='btn btn-search']")
    public WebElement searchButton;
    @FindBy(xpath = "//*[contains(text(),'Sign In')]")
    public WebElement signIn;
    @FindBy(xpath = "//*[contains(text(),'Register')]")
    public WebElement registerButton;
    @FindBy(xpath = "//span[contains(text(),'Wishlist')]")
    public WebElement wishlistButton;
    @FindBy(xpath = "//*[@class='cart-toggle']")
    public WebElement shoppingCartButton;
    @FindBy(xpath = "//*[@class='cart-count']")
    public WebElement shoppingCartCountButton;
    @FindBy(xpath = "(//button[@name='add-to-cart'])[1]")
    public WebElement mensClothingAddToCartButton;
    @FindBy(xpath = "//a[.='Women']")
    public WebElement womenDropdownMenu;
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOutButton;

    //Compare islemleri;
    @FindBy(xpath = "//a[.='Bags']")
    public WebElement bagsOption;
    @FindBy(xpath = "(//a[@data-product_id='13257'])[2]")
    public WebElement comfortableBackpackCompareIcon;
    @FindBy(xpath = "(//a[@data-product_id='32667'])[2]")
    public WebElement leatherWhiteHandbagCompareIcon;
    @FindBy(xpath = "(//a[@data-product_id='13278'])[2]")
    public WebElement whiteHandbagCompareIcon;
    @FindBy(xpath = "(//a[@data-product_id='36429'])[2]")
    public WebElement basicCoachBagCompareIcon;
    @FindBy(xpath = "(//a[@data-product_id='19895'])[4]")
    public WebElement chessCompareIcon;
    @FindBy(xpath = "(//a[@href='?add-to-cart=19895'])[3]")
    public WebElement chessAddToCartButton;
    @FindBy(xpath = "(//a[.='Start Compare !']")
    public WebElement startCompareButton;
    @FindBy(xpath = "//a[@data-product_id='13257']")
    public WebElement  xIconFirstProduct;
    @FindBy(xpath = "//a[@data-product_id='32667']")
    public WebElement xIconSecondProduct;
    @FindBy(xpath = "//a[@data-product_id='13278']")
    public WebElement xIconThirdProduct;
    @FindBy(xpath = "//a[@data-product_id='36429']")
    public WebElement xIconFourthProduct;
    @FindBy(xpath = "//p/mark")
    public WebElement comparing4Products;
    @FindBy(xpath = "//h2[1]")
    public WebElement compareText;
    @FindBy(xpath = "//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']")
    public WebElement comfortableMainView;
    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[3]")
    public WebElement leatherWhiteHangbagMainView;
    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[5]")
    public WebElement whiteHangbagMainView;
    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[13]")
    public WebElement basicCoachBagMainView;
    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[16]")
    public WebElement chessMainView;
    @FindBy(xpath = "//h2[.='Popular Departments']")
    public WebElement popularDepartments;
    @FindBy(xpath = "//div[@class='compare-popup-overlay']")
    public WebElement popupExit;
    @FindBy(xpath = "//a[@class='compare btn-product-icon']")
    public WebElement compareButton;
    @FindBy(xpath = "//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']")
    public WebElement productsBags;
    @FindBy(xpath = "//div[@class='container slider-relative']")
    public WebElement mainContainerPopUp;



    //Wishlist
    @FindBy(xpath ="//button[.='Quick View']" )
    public WebElement quickViewInWishlist;
    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCardInWishlist;
    @FindBy(xpath = "//a[.='blue book']")
    public WebElement blueBook;
    @FindBy(xpath = "//a[@data-product-id='62727']" )
    public  WebElement blueBookHeartIcon;
    @FindBy(xpath = "//a[.='Balıkçı Yaka Düz Uzun Kollu Kadın Triko Kazak']")
    public WebElement trikoKazak;
    @FindBy(xpath = "//a[@data-product-id='14661']")
    public WebElement trikoKazakHeartIcon;
    @FindBy(xpath = " (//a[contains(text(),'View cart')])[2]")
    public WebElement viewCardInWishlist;















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
