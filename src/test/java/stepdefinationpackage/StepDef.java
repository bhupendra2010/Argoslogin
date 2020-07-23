package stepdefinationpackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectpackage.Homepage;

public class StepDef {

    Homepage homepage=new Homepage();
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    homepage.baseurl();
    }

    @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String arg1, String arg2) throws Throwable {
    homepage.detail(arg1,arg2);
    }

    @Then("^User should log in securly$")
    public void user_should_log_in_securly() throws Throwable {
    homepage.login();
    }
}
