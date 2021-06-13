package com.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.travelocity.userinterfaces.HomePage.BTN_SIGIN;
import static com.travelocity.userinterfaces.HomePage.BTN_SIGN_OFF;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogOut implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SIGIN),
                Click.on(BTN_SIGN_OFF));
    }

    public static LogOut thePage() {
        return instrumented(LogOut.class);
    }
}
