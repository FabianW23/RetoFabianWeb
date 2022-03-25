package co.com.tevolvers.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tevolvers.certification.userinterfaces.CheckoutPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Checkout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PROCEED_CHECKOUT),
                Click.on(PROCEED_CHECKOUT),
                Click.on(TERMS_CHECK),
                Click.on(PROCEED_CHECKOUT2),
                Click.on(PAYMENT_METHOD),
                Click.on(COMFIRM_ORDER)
        );
    }

    public static Checkout products() {
        return instrumented(Checkout.class);
    }
}
