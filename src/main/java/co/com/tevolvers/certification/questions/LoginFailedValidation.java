package co.com.tevolvers.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tevolvers.certification.userinterfaces.AccountPage.ACCOUNT_NAME;
import static co.com.tevolvers.certification.userinterfaces.CheckoutPage.ORDER_COMPLETE;
import static co.com.tevolvers.certification.userinterfaces.LoginPage.MESSAGE;

public class LoginFailedValidation implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        String message = actor.recall("message").toString();
        return message.equals(MESSAGE.resolveFor(actor).getText());
    }

    public static LoginFailedValidation validate(){
        return new LoginFailedValidation();
    }
}
