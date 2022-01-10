package steps;

import io.cucumber.java.Before;
import pages.HomePage;

abstract class AbstractSteps {

    HomePage homePage;

    @Before
    public void setup() {
        homePage = new HomePage();
    }
}
