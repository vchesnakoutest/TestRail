package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class LoginSteps {

    HomePage homePage;

    @Before
    public void setup() {
        homePage = new HomePage();
    }

    @Given("I open home page")
    public void iOpenHomePage() {
        homePage.openHomePage();
    }
}
