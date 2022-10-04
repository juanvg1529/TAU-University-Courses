package ForgetPassword;

import Pages.ForgetPasswordPage;
import Pages.RetrievePasswordPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Given The internet Web page
When the user click on the forgot password option
And the types the email
And the user retrieves the password
Then the user assert that the email has been set
 */
public class ForgetPasswordTest extends BaseTest {

    @Test
    public  void retrievePassword(){
        ForgetPasswordPage forgetPasswordPage= homePage.clickForgetPasswordPage();
        forgetPasswordPage.sendKeysLink("email","test@tau.com");
        RetrievePasswordPage retrievePasswordPage = forgetPasswordPage.clickButtonRetrievePassword();
        var assertString=retrievePasswordPage.getRetriveText();
        Assert.assertTrue(retrievePasswordPage.getRetriveText().contains("Internal Server Error"));
    }




}
