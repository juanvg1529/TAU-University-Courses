package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver chromedriver;
    private  By usernameField= By.id("username");
    private  By userPasswordField= By.id("password");
    private By loginButton= By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.chromedriver=driver;
    }
    public void setUserName(String userName){
        chromedriver.findElement(usernameField).sendKeys(userName);
    }

    public void setUserPassword(String userPassword){
        chromedriver.findElement(userPasswordField).sendKeys(userPassword);
    }

    public SecureAreaPage clickLoginButton( ){
        chromedriver.findElement(loginButton).click();
        return  new SecureAreaPage(chromedriver);
    }


}
