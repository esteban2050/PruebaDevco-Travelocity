package com.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.travelocity.userinterfaces.HomePage.BTN_SIGIN;

public class TheTitle implements Question<Boolean> {

    private String title;

    public TheTitle(String title){
        this.title = title;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String name = BTN_SIGIN.resolveFor(actor).getText();
        if (title.equals("different")){
                 return !title.contains(name);
        } else {
            return title.contains(name);
        }
    }
    public static TheTitle isCorrect(String title){
        return new TheTitle(title);
    }
}
