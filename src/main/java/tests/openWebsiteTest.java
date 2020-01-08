package tests;

import cucumber.api.java.en.Given;
import runner.TestRunner;

public class openWebsiteTest {
    @Given("I open website as (.*)$")
    public void openWebsite(String website) throws InterruptedException {
        Thread.sleep(3000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(3000);

    }
}
