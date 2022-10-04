package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver chromedriver;
    public HomePage(WebDriver driver){
        this.chromedriver=driver;
    }
    public LoginPage clickFormAuthenticationLink() {

       clickLink("formAuthenticationLink");
        return  new LoginPage(chromedriver);
    }
    public DropDownPage clickDropDownPage(){
        clickLink("Dropdown");
        return new DropDownPage(chromedriver);
    }
    public ForgetPasswordPage clickForgetPasswordPage(){
        clickLink("Forgot Password");
        return  new ForgetPasswordPage(chromedriver);
    }
    private void clickLink(String linkText){
        chromedriver.findElement(By.linkText(linkText)).click();
    }


}
