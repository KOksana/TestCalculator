package testsforrun;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.AfterStories;
import steps.BasicSteps;


public class TestRunner extends SerenityStories {
    @Steps
    BasicSteps basicSteps;


    @AfterStories
    public void closeWindow(){
        basicSteps.closeWindow();
    }

}
