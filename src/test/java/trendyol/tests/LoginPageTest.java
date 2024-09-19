package trendyol.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import trendyol.pages.HomePage;
import trendyol.pages.LoginPage;
import trendyol.utilities.*;

public class LoginPageTest {
    LoginPage loginPage = new LoginPage();
    @BeforeClass
    public void setUp() {
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

    @AfterClass
    public void tearDown() {

        Driver.closeDriver();
    }


    @Test
    public void test01() {

        ActionsUtils.hoverOver(loginPage.loginText);
        loginPage.loginText.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("TrendyolCorrectEmail"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("TrendyolIncorrectPassword"));
        loginPage.submitButton.click();
        WaitUtils.waitFor(5);
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());


    }

    @Test()
    public void test02() {

        ActionsUtils.hoverOver(loginPage.loginText);
        loginPage.loginButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("TrendyolIncorrectEmail"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("TrendyolCorrectPassword"));
        loginPage.submitButton.click();
        WaitUtils.waitForVisibility(loginPage.errorMessage,10);
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }
}
