package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.customerLoginPage;
import runner.TestRunner;

public class customerLoginTest {
    customerLoginPage cusLoginPage;

    @When("^I select (.*) in the YourName label$")
    public void select_Customer_Name(String userSelect) throws InterruptedException {
        cusLoginPage = new customerLoginPage(TestRunner.driver);
        Thread.sleep(3000);
        cusLoginPage.chooseYourName(userSelect);
    }

    @When("^I click Login button$")
    public void clickLogBtn() throws InterruptedException {
        cusLoginPage = new customerLoginPage(TestRunner.driver);
        Thread.sleep(3000);
        cusLoginPage.clickLogBtn();
    }

    @Then("^I verify Harry Potter is already selected in the YourName label")
    public void verify_CusLog() throws InterruptedException {
        Thread.sleep(3000);
        cusLoginPage.checkAccount();
    }
}
