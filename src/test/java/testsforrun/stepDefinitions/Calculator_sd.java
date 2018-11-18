package testsforrun.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.BasicSteps;

public class Calculator_sd {
    @Steps
    BasicSteps basicSteps;

    @Given("User is on calculator page")
    public void userIsOnCalculatorPage(){
        basicSteps.openCalculatorPage();
    }

    @When("User clicks on $button")
    public void userClicksOnButton(String button){
        basicSteps.clickOnButton(button);
    }

    @Then("$result is displayed in result field")
    public void resultIsDisplayedInResultField(String result){
        basicSteps.checkResult(result);
        basicSteps.clearField();
    }

}
