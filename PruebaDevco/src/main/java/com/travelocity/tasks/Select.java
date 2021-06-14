package com.travelocity.tasks;

import com.travelocity.models.TravelTypes;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userinterfaces.HomePage.BTN_MORE_TRAVEL;
import static com.travelocity.userinterfaces.HomePage.BTN_TRAVEL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Select implements Task {

    private TravelTypes travelTypes;

    public Select(TravelTypes travelTypes){
        this.travelTypes = travelTypes;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(BTN_MORE_TRAVEL),
                WaitUntil.the(travelType(), isVisible()).forNoMoreThan(3).seconds(),
                Click.on(travelType())
                );
    }

    @SneakyThrows
    private Target travelType() {
        switch(travelTypes){
            case PACKAGES:
                return BTN_TRAVEL.of("Packages");
            case STAYS:
                return BTN_TRAVEL.of("Stays");
            case CARS:
                return BTN_TRAVEL.of("Cars");
            case FLIGHTS:
                return BTN_TRAVEL.of("Flights");
            case CRUISES:
                return BTN_TRAVEL.of("Cruises");
            case THINGSTODO:
                return BTN_TRAVEL.of("Things to do");
            default:
                //throw new ElementDoesNotExistException("Element does not exists: " + travelTypes);
                return null;
        }
    }

    public static Select travelType(TravelTypes travelTypes){
        return instrumented(Select.class, travelTypes);
    }
}
