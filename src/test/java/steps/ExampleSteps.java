package steps;

import io.cucumber.java.en.*;
import io.cucumber.java.en_scouse.An;
import pages.ExamplePage;

public class ExampleSteps {
    /*
     ** PAGE INSTANCE **
     */

    ExamplePage examplePage = new ExamplePage();

   @Given("^the user click the \"(.*)\" button$")
    public void theUserClickTheD01Button() {
        examplePage.ClickTheD01Button();
    }

    @When("the DO2 button change from disable to enable")
    public void theDO2ButtonChangeFromDisableToEnable() {
        examplePage.Button02ChangeFromDisableToEnable();
    }

    @And("^the user clicking the \"(.*)\" button$")
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

}
