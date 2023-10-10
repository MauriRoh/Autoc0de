package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestPage;

public class MainPageSteps {
    /*
     ** PAGE INSTANCE **
     */

    TestPage TestPage = new TestPage();

    @Given("^the user click the \"(.*)\" button$")
    public void theUserClickTheD01Button(String button){
        TestPage.ClickTheD01Button(button);
    }

    @When("the DO2 button change from disable to enable")
    public void theDO2ButtonChangeFromDisableToEnable(){
        TestPage.Button02ChangeFromDisableToEnable();
    }

    @And("^the user clicking the \"(.*)\" button$")
    public void theUserClickTheD02Button(String button){
        TestPage.ClickTheD02Button(button);
    }

    @Then("the DO1 button change from disable to enable")
    public void theDO1ButtonChangeFromDisableToEnable(){
        TestPage.Button01ChangeFromDisableToEnable();
    }



}
