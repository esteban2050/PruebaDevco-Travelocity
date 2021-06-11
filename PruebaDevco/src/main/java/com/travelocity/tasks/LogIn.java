package com.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userinterfaces.HomePage.BTN_SIGIN;
import static com.travelocity.userinterfaces.HomePage.BTN_SIGIN2;
import static com.travelocity.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogIn implements Task {

    private String user;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        user = System.getProperty("user");
        password = System.getProperty("password");
        actor.attemptsTo(WaitUntil.the(BTN_SIGIN, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(BTN_SIGIN),
                Click.on(BTN_SIGIN2),
                WaitUntil.the(INPUT_EMAIL, isVisible()),
                Enter.theValue(user).into(INPUT_EMAIL),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_SIGIN3)
        );

    }

    public static LogIn thePage() {
        return instrumented(LogIn.class);
    }
}
