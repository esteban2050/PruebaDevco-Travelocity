package com.travelocity.interactions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Interaction {

    private PageObject page;

    public OpenBrowser(PageObject page) {
        this.page = page;
    }

    @Override
    @Step("{0} opens the browser on travelocity page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenBrowser on(PageObject page) {
        return instrumented(OpenBrowser.class, page);
    }
}
