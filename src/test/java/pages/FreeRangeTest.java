package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTest {
    
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //Initialize WebDriver for Chrome browser
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       
    }

    @Test
    public void browseToFreeRangeTesters(){
        //Browse to the webpage
        driver.get("https://www.freerangetesters.com");


    }

    @AfterMethod
    public void tearDown(){
        //close the browser after test is executed
        if(driver != null) {
            driver.quit();
        }
    }
    


}
