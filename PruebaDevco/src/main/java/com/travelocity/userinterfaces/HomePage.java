package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    //BUTTON
    public static final Target BTN_SIGIN = Target.the("button of the sign in").locatedBy("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']");
    public static final Target BTN_SIGIN2 = Target.the("button of the sign in the panel").locatedBy("//a[@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-has-text uitk-button-primary']");
    public static final Target BTN_MORE_TRAVEL = Target.the("button to select different travels").locatedBy("//div[@class='uitk-text uitk-type-300']");
    public static final Target BTN_SUPPORT = Target.the("button of the support").located(By.id("support-cs"));
    public static final Target BTN_TRIPS = Target.the("button of the trips").located(By.id("itinerary"));
    public static final Target BTN_TRAVEL = Target.the("item of the travels").locatedBy("//div[@class='uitk-text uitk-type-300' and contains(text(),'{0}')]");
    public static final Target BTN_SIGN_OFF = Target.the("button to close the session").locatedBy("//div[@class='uitk-text uitk-type-300' and contains(text(), 'Cerrar sesi')]");
    public static final Target BTN_LANGUAGE = Target.the("button to change the language of the page").locatedBy("//button[@class='uitk-button uitk-button-medium uitk-button-has-text']");
    public static final Target BTN_LOCATION = Target.the("button to search the location").locatedBy("//button[@class='uitk-faux-input']");
    public static final Target BTN_SELECT_LOCATION = Target.the("button to select the location").locatedBy("//*[@id=\"location-field-destination-menu\"]/div[2]/ul/li[1]/button");

    //TITLE
    public static final Target TITLE_TRAVELS1 = Target.the("The title that indicates that you are in a search different of travel").locatedBy("//div[@class='uitk-type-display-700']");
    public static final Target TITLE_TRAVELS2 = Target.the("The title that indicates that you are in a search different of travel").locatedBy("//h1[@class='uitk-heading-3']");

    //INPUT
    public static final Target INP_DESTINATION = Target.the("The input of the destination").located(By.id("location-field-destination"));

}
