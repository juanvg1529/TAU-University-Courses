package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTest;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage= homePage.clickFormAuthenticationLink();
        loginPage.setUserName("tomsmith");
        loginPage.setUserPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

      assertTrue( secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");


    }
}
