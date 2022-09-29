package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    public void setUp ( )
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setSize( new Dimension(375,812));//maximize the window
        System.out.println(driver.getTitle());//opens the window
        //driver.quit();//close all the windows and sessions
    }

    public  static  void main (String args []){
        BaseTest test = new BaseTest();
        test.setUp();
    }
}