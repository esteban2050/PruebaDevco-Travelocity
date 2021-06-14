package com.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.travelocity.userinterfaces.HomePage.*;

public class TheLanguage implements Question<Boolean> {

    private String moreTravel;
    private String support;
    private String trips;

    @Override
    public Boolean answeredBy(Actor actor) {
        moreTravel = BTN_MORE_TRAVEL.resolveFor(actor).getText();
        support = BTN_SUPPORT.resolveFor(actor).getText();
        trips = BTN_TRIPS.resolveFor(actor).getText();
        return !(moreTravel.equals("More travel") && support.equals("Support") && trips.equals("Trips"));
    }

    public static TheLanguage change(){
        return new TheLanguage();
    }
}
