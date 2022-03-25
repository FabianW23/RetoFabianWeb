package co.com.tevolvers.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tevolvers.certification.userinterfaces.AccountPage.ACCOUNT_NAME;

public class LoginValidation implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(ACCOUNT_NAME.resolveFor(actor).getText());
        return ACCOUNT_NAME.resolveFor(actor).getText().equals("Fabian Test");
    }

    public static LoginValidation validate(){
        return new LoginValidation();
    }
}
