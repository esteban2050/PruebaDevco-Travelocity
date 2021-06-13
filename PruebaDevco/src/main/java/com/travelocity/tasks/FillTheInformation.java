package com.travelocity.tasks;

import com.travelocity.interactions.Click;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userinterfaces.HomePage.BTN_LOCATION;
import static com.travelocity.userinterfaces.HomePage.INP_DESTINATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class FillTheInformation implements Task {

    private String destination;
    private String fchIni;
    private String fhcFin;
    private int adults;
    private int children;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_LOCATION, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_LOCATION),
                Enter.theValue(destination).into(INP_DESTINATION));

    }

    public static FillTheInformation ofStay(String destination, String fchIni, String fhcFin, int adults, int children ){
        return instrumented(FillTheInformation.class, destination, fchIni, fhcFin, adults, children );
    }
}
