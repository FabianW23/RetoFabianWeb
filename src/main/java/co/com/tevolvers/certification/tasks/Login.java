package co.com.tevolvers.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tevolvers.certification.userinterfaces.HomePage.SIGNIN;
import static co.com.tevolvers.certification.userinterfaces.LoginPage.*;
import static co.com.tevolvers.certification.utils.Credentials.EMAIL;
import static co.com.tevolvers.certification.utils.Credentials.PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGNIN),
                Enter.theValue(EMAIL).into(EMAIL_FIELD),
                Enter.theValue(PASSWORD).into(PASSWORD_FIELD),
                Click.on(LOGIN_BTN)
        );
    }

    public static Login login () {
        return instrumented(Login.class);
    }
}
