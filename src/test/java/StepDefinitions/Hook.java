package StepDefinitions;

import io.cucumber.java.After;

public class Hook {

    @After
    public void tearDown() {
        Util.getDriver().quit();
    }
}
