package com.travelocity.questions;

import com.travelocity.exceptions.ElementDoesNotExistException;
import com.travelocity.models.TravelTypes;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.travelocity.userinterfaces.HomePage.*;

public class TheSearchTitle implements Question<Boolean> {

    private TravelTypes travelTypes;

    public TheSearchTitle(TravelTypes travelTypes){
        this.travelTypes = travelTypes;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TITLE_TRAVELS1.resolveFor(actor).containsText(word())
                || TITLE_TRAVELS2.resolveFor(actor).containsText(word());
    }

    @SneakyThrows
    private String word(){
        switch(travelTypes){
            case PACKAGES:
                return "package";
            case STAYS:
                return "stays";
            case CARS:
                return "car";
            case FLIGHTS:
                return "flights";
            case CRUISES:
                return "cruises";
            case THINGSTODO:
                return "things to do";
            default:
                //throw  new ElementDoesNotExistException("the element is does not exist" + travelTypes);
                return null;
        }
    }

    public static TheSearchTitle isCorrect(TravelTypes travelTypes){
        return new TheSearchTitle(travelTypes);
    }
}
