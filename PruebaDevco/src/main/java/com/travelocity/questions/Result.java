package com.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.travelocity.userinterfaces.HomePage.RESULT;

public class Result implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(RESULT).viewedBy(actor).asBoolean();
    }

    public static Result isAppears(){
        return new Result();
    }
}
