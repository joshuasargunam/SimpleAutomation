import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        //open a browser
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        
        //Navigates to ii trading account page
        driver.get("https://www.ii.co.uk/account-opening/trading-account");

        //select Title 
        driver.findElement(By.id("TRADING_title")).sendKeys("MR");

        //enter first name
        driver.findElement(By.cssSelector("[data-id='input_First_name']")).sendKeys("Josh");

        //enter last name
        driver.findElement(By.id("TRADING_lastName")).sendKeys("Test");

        //enter email address
        driver.findElement(By.id("TRADING_emailAddress")).sendKeys("josh.test@ii.co.uk");

        //enter mobile number
        driver.findElement(By.id("mobileNumber")).sendKeys("07234567890");

        //enter post code
        driver.findElement(By.id("TRADING_postcodeLookup")).sendKeys("LS1 4AX");

        //click postcode lookup button
        driver.findElement(By.cssSelector("[data-testid='postcodeLookupButton']")).click();

        //explict wait for the page to load address lookup
        WebDriverWait wait=new WebDriverWait(driver, 2000);

        //select Interactive Investors
        driver.findElement(By.cssSelector("[data-testid='select_addressMetaSelector']")).sendKeys("Interactive");

        //enter date of birth
         driver.findElement(By.cssSelector("input[data-testid='date-input']")).sendKeys("17/01/1980");
   
    }
}
