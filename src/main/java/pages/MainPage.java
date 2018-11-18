package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    private static final String MAIN_PAGE_URL = "https://www.google.com/";

    @FindBy(xpath = "//img[@alt='Google']")
    WebElement logo;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement inputField;

    public void openPage() {
        getDriver().get(MAIN_PAGE_URL);
        waitForElementVisible(logo);
    }

    public void typeTextAndSearch(String text){
        inputField.sendKeys(text + Keys.ENTER);
    }

}
