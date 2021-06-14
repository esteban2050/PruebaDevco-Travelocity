package com.travelocity.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTheInformation implements Task {

    private String destination;
    private String fchIni;
    private String fhcFin;
    private int adults;
    private int children;

    public FillTheInformation(String destination, String fchIni, String fhcFin, int adults, int children){
        this.destination =destination;
        this.fchIni = fchIni;
        this.fhcFin = fhcFin;
        this.adults = adults;
        this.children = children;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(BTN_LOCATION, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_LOCATION),
                Enter.theValue(destination).into(INP_DESTINATION),
                Click.on(BTN_SELECT_LOCATION),
                Click.on(BTN_TRAVELERS)
        );
        String numberAdults = NUMBER_ADULTS.resolveFor(actor).getValue();

        if(!(Integer.parseInt(numberAdults) == adults)){
            if(Integer.parseInt(numberAdults) > adults){
                actor.attemptsTo(Click.on(BTN_DECREASE_ADULTS));
            }else{
                for (int i=1; i <= (adults-Integer.parseInt(numberAdults)); i++)
                {
                    actor.attemptsTo(Click.on(BTN_INCREASE_ADULTS));
                }
            }
        }
        if (children>0){
            for (int i=1; i <= children; i++)
            {
                actor.attemptsTo(Click.on(BTN_INCREASE_CHILDREN));
            }
        }
        actor.attemptsTo(Click.on(BTN_CONFIRM_TRAVELERS),
                WaitUntil.the(BTN_SEARCH, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_SEARCH));
    }

    public static FillTheInformation ofStay(String destination, String fchIni, String fhcFin, int adults, int children ){
        return instrumented(FillTheInformation.class, destination, fchIni, fhcFin, adults, children );
    }
}
