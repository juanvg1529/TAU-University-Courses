package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private  By formAuthenticationLink= By.linkText("Form Authentication");
    private WebDriver chromedriver;
    public HomePage(WebDriver driver){
        this.chromedriver=driver;
    }
    public LoginPage clickFormAuthenticationLink() {

        chromedriver.findElement(formAuthenticationLink).click();
        return  new LoginPage(chromedriver);
    }

}
