package co.com.tevolvers.certification.tasks;

import co.com.tevolvers.certification.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import co.com.tevolvers.certification.interactions.AddProductToCart;

import static co.com.tevolvers.certification.userinterfaces.CheckoutPage.DELIVERY_PRICE;
import static co.com.tevolvers.certification.userinterfaces.ProductPage.*;
import static co.com.tevolvers.certification.userinterfaces.WomanPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Double total = 0.0;
        actor.attemptsTo(
                Click.on(WOMAN),
                Click.on(PRODUCT1));
        total+=Double.parseDouble(PRICE.resolveFor(actor).getText().replace("$","")) ;
        actor.attemptsTo(
                Click.on(ADD_TO_CART),
                Wait.theSeconds(10),
                Click.on(CLOSE_POPUP),
                Click.on(WOMAN),
                Click.on(PRODUCT2));
        total+=Double.parseDouble(PRICE.resolveFor(actor).getText().replace("$","")) ;
        actor.attemptsTo(
                Click.on(ADD_TO_CART),
                Wait.theSeconds(10),
                Click.on(CLOSE_POPUP),
                Click.on(WOMAN),
                Click.on(PRODUCT3));
        total+=Double.parseDouble(PRICE.resolveFor(actor).getText().replace("$","")) ;
        actor.attemptsTo(
                Click.on(ADD_TO_CART),
                Wait.theSeconds(10),
                Click.on(CLOSE_POPUP));
        actor.attemptsTo(
                Click.on(GO_TO_CART)
        );
        total+= Double.parseDouble(DELIVERY_PRICE.resolveFor(actor).getText().replace("$","")) ;
        actor.remember("totalPrice", total);
    }

    public static AddProducts add() {
        return instrumented(AddProducts.class);
    }
}
