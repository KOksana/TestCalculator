package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage {

    @FindBy(xpath = "//div[@id='cwmcwd']")
    WebElement calculatorBlock;

    @FindBy(xpath = "//span[@id='cwos']")
    WebElement resultField;

    @FindBy(xpath = "//span[text()='1']")
    WebElement buttonNumberOne;

    @FindBy(xpath = "//span[text()='2']")
    WebElement buttonNumberTwo;

    @FindBy(xpath = "//span[text()='3']")
    WebElement buttonNumberThree;

    @FindBy(xpath = "//span[text()='4']")
    WebElement buttonNumberFour;

    @FindBy(xpath = "//span[text()='5']")
    WebElement buttonNumberFive;

    @FindBy(xpath = "//span[text()='6']")
    WebElement buttonNumberSix;

    @FindBy(xpath = "//span[text()='7']")
    WebElement buttonNumberSeven;

    @FindBy(xpath = "//span[text()='8']")
    WebElement buttonNumberEight;

    @FindBy(xpath = "//span[text()='9']")
    WebElement buttonNumberNine;

    @FindBy(xpath = "//span[text()='0']")
    WebElement buttonNumberZero;

    @FindBy(xpath = "//span[text()='.']")
    WebElement buttonDot;

    @FindBy(xpath = "//span[text()='+']")
    WebElement buttonAdd;

    @FindBy(xpath = "//span[text()='−']")
    WebElement buttonSubtract;

    @FindBy(xpath = "//span[text()='×']")
    WebElement buttonMultiply;

    @FindBy(xpath = "//span[text()='÷']")
    WebElement buttonDivide;

    @FindBy(xpath = "//span[text()='=']")
    WebElement buttonEqual;

    @FindBy(xpath = "//span[text()='AC']")
    WebElement buttonCE;


    public void clickOnButtonNumberOne() {
        buttonNumberOne.click();
    }

    public void clickOnButtonNumberTwo() {
        buttonNumberTwo.click();
    }

    public void clickOnButtonNumberThree() {
        buttonNumberThree.click();
    }

    public void clickOnButtonNumberFour() {
        buttonNumberFour.click();
    }

    public void clickOnButtonNumberFive() {
        buttonNumberFive.click();
    }

    public void clickOnButtonNumberSix() {
        buttonNumberSix.click();
    }

    public void clickOnButtonNumberSeven() {
        buttonNumberSeven.click();
    }

    public void clickOnButtonNumberEight() {
        buttonNumberEight.click();
    }

    public void clickOnButtonNumberNine() {
        buttonNumberNine.click();
    }

    public void clickOnButtonNumberZero() {
        buttonNumberZero.click();
    }

    public void clickOnButtonDot() {
        buttonDot.click();
    }

    public void clickOnButtonAdd() {
        buttonAdd.click();
    }

    public void clickOnButtonSubtract() {
        buttonSubtract.click();
    }

    public void clickOnButtonMultiply() {
        buttonMultiply.click();
    }

    public void clickOnButtonDivide() {
        buttonDivide.click();
    }

    public void clickOnButtonEqual() {
        buttonEqual.click();
    }

    public void clickOnButtonCE(){
        buttonCE.click();
    }


    public boolean isOpen() {
        try {
            calculatorBlock.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public void waitForCalculatorBlock() {
        waitForElementVisible(calculatorBlock);
    }

    public String getResult(){
        return resultField.getText();
    }

}
