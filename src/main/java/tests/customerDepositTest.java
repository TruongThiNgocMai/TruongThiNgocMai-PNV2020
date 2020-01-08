package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.customerDepositPage;

public class customerDepositTest {
    customerDepositPage cusDepPage;

    @When("^I click DepositTop button$")
    public void clickDepTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusDepPage.clickDepTopBtn();
    }

    @When("^I type Amount to be Deposited as (.*)$")
    public void inputAmount(String userSelect) throws InterruptedException {
        Thread.sleep(3000);
        cusDepPage.inputAmount();
    }

    @When("^I click DepositBottom button$")
    public void clickDepBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        cusDepPage.clickDepBottomBtn();
    }

    @Then("^I verify Deposit Successful")
    public void verify_Deposit() throws InterruptedException {
        Thread.sleep(3000);
        cusDepPage.checkInputAmount();
    }
}
