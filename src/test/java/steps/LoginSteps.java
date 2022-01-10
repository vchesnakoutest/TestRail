package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class LoginSteps extends AbstractSteps{

    @Given("I open home page")
    public void iOpenHomePage() {
        homePage.openHomePage();
    }
}
