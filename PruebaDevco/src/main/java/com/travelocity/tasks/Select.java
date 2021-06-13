package com.travelocity.tasks;

import com.travelocity.exceptions.ElementDoesNotExistException;
import com.travelocity.interactions.Click;
import com.travelocity.models.TravelTypes;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userinterfaces.HomePage.BTN_MORE_TRAVEL;
import static com.travelocity.userinterfaces.HomePage.BTN_TRAVEL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class Select implements Task {

    private TravelTypes travelTypes;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_MORE_TRAVEL, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_MORE_TRAVEL),
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
                throw new ElementDoesNotExistException("Element does not exists: " + travelTypes);
        }
    }

    public static Select travelType(TravelTypes travelTypes){
        return instrumented(Select.class, travelTypes);
    }
}