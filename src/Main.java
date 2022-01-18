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
        driver.get("https://www.ii.co.uk/account-opening/trading-account");

        driver.findElement(By.id("TRADING_title")).sendKeys("MR");

        driver.findElement(By.cssSelector("[data-id='input_First_name']")).sendKeys("Josh");

        driver.findElement(By.id("TRADING_lastName")).sendKeys("Test");

        driver.findElement(By.id("TRADING_emailAddress")).sendKeys("josh.test@ii.co.uk");

        driver.findElement(By.id("mobileNumber")).sendKeys("07234567890");

        driver.findElement(By.id("TRADING_postcodeLookup")).sendKeys("LS1 4AX");

        driver.findElement(By.cssSelector("[data-testid='postcodeLookupButton']")).click();

        WebDriverWait wait=new WebDriverWait(driver, 2000);

        driver.findElement(By.cssSelector("[data-testid='select_addressMetaSelector']")).sendKeys("Interactive");

//        Select address = new Select(driver.findElement(By.cssSelector("[data-testid='select_addressMetaSelector']")));
//        address.selectByVisibleText("Interactive Investor");

//        Interactive Investor

    }
}
