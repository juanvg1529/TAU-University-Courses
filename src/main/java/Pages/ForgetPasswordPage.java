package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    private WebDriver driver;

    public ForgetPasswordPage(WebDriver driver){
        this.driver=driver;

    }


    public void sendKeysLink(String linkText, String sendKeyString){
        driver.findElement(By.id(linkText)).sendKeys(sendKeyString);
    }

    public RetrievePasswordPage clickButtonRetrievePassword(){

        driver.findElement(By.id("form_submit")).click();
        return  new RetrievePasswordPage(driver);

    }
}
