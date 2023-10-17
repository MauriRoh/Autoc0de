package steps;

import io.cucumber.java.en.*;
import pages.ExamplePage;

public class ExampleSteps {
    /*
     ** PAGE INSTANCE **
     */

    ExamplePage examplePage = new ExamplePage();

//    @Given("the user is on the home screen of Underc0de.org")
//    public void theUserIsOnTheHomeScreenOfUndercDeOrg() {
//        examplePage.navigateToMainURL();
//        examplePage.verifyHomeTitle();
//    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        examplePage.navigateToMainURL();
    }

    @And("^the user enters valid username \"(.*)\" password \"(.*)\"$")
    public void theUserEnterUsernameAndPass(String user, String pass){
        examplePage.completeLoginData(user, pass);
    }

    @And("^the user click the \"LOGIN\" button on the form$")
    public void theUserClickTheLoginButtonOnTheForm() {
        examplePage.ClickTheLoginButtonOnTheForm();
    }

//    @Given("^the user click the \"(.*)\" button$")
    @Given("the user click the D01 button")
    public void theUserClickTheD01Button() {
        examplePage.ClickTheD01Button();
    }

    @When("the DO2 button change from disable to enable")
    public void theDO2ButtonChangeFromDisableToEnable() {
        examplePage.Button02ChangeFromDisableToEnable();
    }

//    @And("^the user clicking the \"(.*)\" button$")
    @And("the user clicking the D02 button")
    public void theUserClickTheD02Button() {
        examplePage.ClickTheD02Button();
    }

    @Then("the DO1 button change from disable to enable")
    public void theDO1ButtonChangeFromDisableToEnable() {
        examplePage.Button01ChangeFromDisableToEnable();
    }

    @Given("^the user clicks the \"(.*)\" button four times$")
    public void theUserClicksTheUpButtonfourTimes(int up) {
        examplePage.ClicksTheUpButtonfourTimes(up);
    }

    @And("the font increases in size")
    public void theFontIncreasesInSize() {
        examplePage.FontIncreasesInSize();
    }

    @And("^the user clicks the down \"(.*)\" button four times$")
    public void theUserClicksTheDownButtonfourTimes(int down) {
        examplePage.ClicksTheDownButtonfourTimes(down);
    }

    @Then("the font decreases in size")
    public void theFontDecreasesInSize() {
        examplePage.FontDecreasesInSize();
    }

    @When("^the user enters a color into the input \"(.*)\"$")
    public void theUserEntersColorIntoTheInput(String color) {
        examplePage.EntersColorIntoTheInput(color);
    }

    @And("^the user click the \"SET BACKGROUND COLOR\" button$")
    public void theUserClickTheSetBackgroundColorButton() {
        examplePage.ClickTheSetBackgroundColorButton();
    }

    @Then("the form background color changes")
    public void theFormBackgroundColorChanges() {
        examplePage.BackgroundColorChanges();
    }






////    @And("^the user click the \"(.*)\" button$")
////    public void theUserClickTheButton(String button) {
////        examplePage.clickButtonSwitch(button);
////    }
//    @And("^the user click the \"INGRESAR\" button of the forum$")
//    public void theUserClickTheINGRESARButtonOfTheForum() {
//        examplePage.clickIngresarButtonForum();
//    }
//
//    @And("^the user click the \"INGRESAR\" button of the forum modal$")
//    public void theUserClickTheINGRESARButtonOfTheForumModal() {
//        examplePage.clickIngresarButtonForumModal();
//    }
////
//    @And("^the user complete te user information. Usuario: \"(.*)\" Contraseña: \"(.*)\"$")
//    public void theUserCompleteTeUserInformationUsuarioUserContraseñaPass(String user, String pass) {
//        examplePage.completeLoginData(user, pass);
//    }
//
////    @Then("the user verifies that they are logged in.")
////    public void theUserVerifiesThatTheyAreLoggedIn() {
////        examplePage.verifyLogin();
////    }

}
