package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
    private static WebDriver driver;
    private static WebDriverWait driverWait;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driverWait = new WebDriverWait(driver, 20);
        }
        return driver;
    }

    public void closePage() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void waitForElementVisible(WebElement element) {
        driverWait.until(ExpectedConditions.visibilityOf(element));
    }
}
