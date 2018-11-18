package steps;

import net.thucydides.core.annotations.Step;
import pages.CalculatorPage;
import pages.MainPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicSteps {
    MainPage main = new MainPage();
    CalculatorPage calculator = new CalculatorPage();

    @Step
    public void openCalculatorPage() {
        if (calculator.isOpen() == false) {
            main.openPage();
            main.typeTextAndSearch("calculator");
            calculator.waitForCalculatorBlock();
        }
    }

    @Step
    public void clickOnButton(String button) {
        System.out.println("button-" + button);
        switch (button) {
            case "1": {
                calculator.clickOnButtonNumberOne();
                break;
            }
            case "2":{
                calculator.clickOnButtonNumberTwo();
                break;
            }
            case "3":{
                calculator.clickOnButtonNumberThree();
                break;
            }
            case "4":{
                calculator.clickOnButtonNumberFour();
                break;
            }
            case "5":{
                calculator.clickOnButtonNumberFive();
                break;
            }
            case "6":{
                calculator.clickOnButtonNumberSix();
                break;
            }
            case "7":{
                calculator.clickOnButtonNumberSeven();
                break;
            }
            case "8":{
                calculator.clickOnButtonNumberEight();
                break;
            }
            case "9":{
                calculator.clickOnButtonNumberNine();
                break;
            }
            case "0":{
                calculator.clickOnButtonNumberZero();
                break;
            }
            case "+": {
                calculator.clickOnButtonAdd();
                break;
            }
            case ".": {
                calculator.clickOnButtonDot();
                break;
            }
            case "-": {
                calculator.clickOnButtonSubtract();
                break;
            }
            case "×": {
                calculator.clickOnButtonMultiply();
                break;
            }
            case "÷": {
                calculator.clickOnButtonDivide();
                break;
            }
            case "=": {
                calculator.clickOnButtonEqual();
                break;
            }
        }
    }

    @Step
    public void checkResult(String expectedResult){
        assertThat("Wrong calculation result", expectedResult, equalTo(calculator.getResult()));
    }

    @Step
    public void clearField(){
        calculator.clickOnButtonCE();
    }

    @Step
    public void closeWindow(){
        main.closePage();
    }

}
