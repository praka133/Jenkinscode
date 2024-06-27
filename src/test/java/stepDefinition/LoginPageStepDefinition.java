package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.Given;

public class LoginPageStepDefinition extends BaseClass {

    @Given("user navigates to application")
    public void launchApp() throws InterruptedException {
        initializeBrowser();

    }
}
