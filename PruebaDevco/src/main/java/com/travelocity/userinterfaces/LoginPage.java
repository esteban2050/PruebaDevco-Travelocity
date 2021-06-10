package com.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    //BUTTON
    public static final Target BTN_SIGIN3 = Target.the("button to enter to the page").located(By.id("submitButton"));
    public static final Target BTN_FORGOT_PASSWORD = Target.the("button to recover your account").located(By.id("go-to-forgot-password"));
    public static final Target BTN_RETRIEVE_PASSWORD = Target.the("button to recover your password").located(By.id("forgot-password-unregistered-submit-button"));

    //INPUT
    public static final Target INPUT_EMAIL = Target.the("The input of email").located(By.id("signin-loginid"));
    public static final Target INPUT_EMAIL_FP = Target.the("The input of email when you clicked in forgot your password").located(By.id("forgot-password-registered-emailId"));
    public static final Target INPUT_PASSWORD = Target.the("The input of password").located(By.id("signin-password"));

    //TEXT
    public static final Target TXT_PASSWORD_RESET = Target.the("The title that indicates that you received an email to reset your password").locatedBy("//h1[@class='section-header-main']");

}
