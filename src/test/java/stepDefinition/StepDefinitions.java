package stepDefinition;

import app.FizzBuzzWebApp;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	public FizzBuzzWebApp app;
	public String result;
	@Given("^The user accesses FizzBuzz app$")
    public void the_user_accesses_fizzbuzz_app() throws Throwable {
        app = new FizzBuzzWebApp();
    }

    @When("^The user enters (.+) in the app$")
    public void the_user_enters_in_the_app(String value) throws Throwable {
        result=app.fnCheck(value);
    }

    @Then("^The user verifies the (.+) in the app$")
    public void the_user_verifies_the_in_the_app(String status) throws Throwable {
       Assert.assertEquals(result, status);
    }

}
