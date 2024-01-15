package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2 {
	WebDriver driver;
    @BeforeTest
    void setup() {
        // Set up the wWebDriverManager for chrome driver
    	WebDriverManager.chromedriver().clearDriverCache().setup();
        // Create the driver object
        driver = new ChromeDriver();
    }
 
    @Test
    void checkTheUrl() {
        // Open the browser and go to lambdatest ecommerce website
        driver.get("https://ecommerce-playground.lambdatest.io/");
        // Set the current url as a string
        String url = driver.getCurrentUrl();
        // Verify that current url contains lambdatest
        Assert.assertTrue(url.contains("lambdatest"));
    }
    @Test
    void checkTheUrl2() {
        // Open the browser and go to lambdatest ecommerce website
        driver.get("https://ecommerce-playground.lambdatest.io/");
        // Set the current url as a string
        String url = driver.getCurrentUrl();
        // Verify that current url contains lambdatest
        Assert.assertTrue(url.contains("lambdatest"));
    }
    @Test
    void checkTheUrl3() {
        // Open the browser and go to lambdatest ecommerce website
        driver.get("https://ecommerce-playground.lambdatest.io/");
        // Set the current url as a string
        String url = driver.getCurrentUrl();
        // Verify that current url contains lambdatest
        Assert.assertTrue(url.contains("lambdatest"));
    }
 
    @AfterTest
    void teardown() {
       // Close the driver
        driver.quit();
    }

}
