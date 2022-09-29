package base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp ( )
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();//maximize the window
        homePage=new HomePage(driver);

    }
    @AfterClass
    public  void tearDown(){
        driver.quit();
    }
    // Scenario
      /*
      Given The user open the browser
      And the user sets he url at the internet website
      When user clicks on "Shifting content" option
      And the user click on "Menu Element" option
      Then the user prints the number of elements that at the menu appear
       */
    public void scenarioTask(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement shiftingContentLink= driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[39]/a"));
        shiftingContentLink.click();
        WebElement menuElementLink= driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]"));
        menuElementLink.click();
        List <WebElement> menuShiftingContent= driver.findElements(By.tagName("li"));

        System.out.println("the number of elements at the current menu are ="+menuShiftingContent.size());



    }

}
