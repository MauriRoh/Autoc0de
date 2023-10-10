package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestPage;

public class loginSteps {
    /*
     ** PAGE INSTANCE **
     */

    TestPage TestPage = new TestPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        TestPage.navigateToMainURL();
    }

    @When("^the user enters valid username: \"(.*)\" and password: \"(.*)\"$")
    public void theUserEnterUsernameAndPass(String user, String pass){
        TestPage.completeLoginData(user, pass);
    }

    @Then("^the user click the \"LOGIN\" button on the form$")
    public void theUserClickTheLoginButtonOnTheForm() {
        TestPage.ClickTheLoginButtonOnTheForm();
    }
//    @And("^the user click the \"LOGIN\" button on the form$")
//    public void theUserClickTheLoginButtonOnTheForm() {
//        TestPage.ClickTheLoginButtonOnTheForm();
//    }

//    @Then("the user verifies that they are logged in.")
//    public void theUserVerifiesThatTheyAreLoggedIn() {
//        TestPage.verifyLogin();
//    }

}
