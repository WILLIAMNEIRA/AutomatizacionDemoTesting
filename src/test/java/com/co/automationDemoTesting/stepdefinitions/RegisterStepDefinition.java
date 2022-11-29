package com.co.automationDemoTesting.stepdefinitions;

import com.co.automationDemoTesting.tasks.Register;
import com.co.automationDemoTesting.userinterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {

    @Managed
    WebDriver isBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("William");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(isBrowser));
    }
    @Given("^he user is on the page$")
    public void heUserIsOnThePage() {
       OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demo.automationtesting.in/Index.html"));

    }

    @When("^he user enters his data$")
    public void heUserEntersHisData() {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.registerUser());

    }

    @Then("^confirm registration$")
    public void confirmRegistration() {
      ;
    }
}
