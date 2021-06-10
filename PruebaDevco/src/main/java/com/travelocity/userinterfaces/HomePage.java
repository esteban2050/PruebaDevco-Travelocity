package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    //BUTTON
    public static final Target BTN_SIGIN = Target.the("button of the sign in").locatedBy("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']");
    public static final Target BTN_SIGIN2 = Target.the("button of the sign in the panel").locatedBy("//a[@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-has-text uitk-button-primary']");
    public static final Target BTN_MORE_TRAVEL = Target.the("button to select different travels").locatedBy("//div[@class='uitk-text uitk-type-300']");
    public static final Target BTN_TRAVEL = Target.the("item of the travels").locatedBy("//div[@class='uitk-text uitk-type-300' and contains(text(),'{0}')]");

    //TITLE
    public static final Target TITLE_TRAVELS1 = Target.the("The title that indicates that you are in a search different of travel").locatedBy("//div[@class='uitk-type-display-700']");
    public static final Target TITLE_TRAVELS2 = Target.the("The title that indicates that you are in a search different of travel").locatedBy("//h1[@class='uitk-heading-3']");

}
