package com.travelocity.stepdefinitions;

import com.travelocity.exceptions.ResultException;
import com.travelocity.interactions.OpenBrowser;
import com.travelocity.questions.TheTitle;
import com.travelocity.tasks.LogIn;
import com.travelocity.tasks.LogOut;
import com.travelocity.userinterfaces.TravelocityPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.travelocity.exceptions.ResultException.TEXT_IS_INCORRECT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    TravelocityPage travelocityPage;

    @Given("^that a user has access to the travelocity page$")
    public void thatAUserHasAccessToTheTravelocityPage() {
        theActorCalled("Esteban");
        theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(travelocityPage));
    }

    @When("^the user try to logg-in on the page$")
    public void theUserTryToLoggInOnThePage() {
        theActorInTheSpotlight().attemptsTo(LogIn.thePage());
    }

    @And("^the user try to logs out$")
    public void theUserTryToLogsOut(){
        theActorInTheSpotlight().attemptsTo(LogOut.thePage());
    }

    @Then("^the user see the (.*) in the toolbar$")
    public void theUserSeeThatSeesThatHeWasAbleToEnter(String title){
        theActorInTheSpotlight().should(seeThat(TheTitle.isCorrect(title))
         .orComplainWith(ResultException.class,TEXT_IS_INCORRECT));
    }
}
