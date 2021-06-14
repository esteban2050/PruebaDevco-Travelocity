package com.travelocity.stepdefinitions;

import com.travelocity.exceptions.ResultException;
import com.travelocity.interactions.Click;
import com.travelocity.models.TravelTypes;
import com.travelocity.questions.Result;
import com.travelocity.questions.TheLanguage;
import com.travelocity.questions.TheSearchTitle;
import com.travelocity.tasks.FillTheInformation;
import com.travelocity.tasks.Select;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.travelocity.exceptions.ResultException.*;
import static com.travelocity.userinterfaces.HomePage.BTN_LANGUAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeStepDefinitions {

    @When("^the user change the language on the page$")
    public void theUserChangeTheLanguageOnThePage() {
        theActorInTheSpotlight().attemptsTo(Click.on(BTN_LANGUAGE));
    }

    @Then("^sees that the language change to english$")
    public void seesThatTheLanguageChangeToEnglish() {
        theActorInTheSpotlight().should(seeThat(TheLanguage.change())
                .orComplainWith(ResultException.class, LANGUAGE_IS_SAME)
        );
    }

    @When("^the user see the (.*) type$")
    public void theUserSeeTheTravelType(TravelTypes travelTypes) {
        theActorInTheSpotlight().attemptsTo(Select.travelType(travelTypes));
    }

    @Then("^sees the title of the search is the correct with (.*)$")
    public void seesTheTitleOfTheSearchIsTheCorrectWith(TravelTypes travelTypes) {
        theActorInTheSpotlight().should(seeThat(TheSearchTitle.isCorrect(travelTypes))
                .orComplainWith(ResultException.class, TITLE_INCORRECT)
        );
    }

    @When("^the user fills the information with (.*), (.*), (.*), (.*) and (.*)$")
    public void theUserFillTheInformation(String destination, String fchIni, String fhcFin, int adults, int children) {
        theActorInTheSpotlight().attemptsTo(FillTheInformation.ofStay(destination, fchIni, fhcFin, adults, children));
    }

    @Then("^saw that the search was successful$")
    public void sawThatTheSearchWasSuccessful() {
        theActorInTheSpotlight().should(seeThat(Result.isAppears())
                .orComplainWith(ResultException.class, SEARCH_ERROR)
        );
    }
}
