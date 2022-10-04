package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver chromedriver;
    private By statusAlertMessage= By.id("flash");
    public SecureAreaPage ( WebDriver driver){
        this.chromedriver=driver;
    }
    public String getAlertText(){
        return chromedriver.findElement(statusAlertMessage).getText();
    }
}
