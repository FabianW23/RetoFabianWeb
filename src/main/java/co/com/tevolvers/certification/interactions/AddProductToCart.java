package co.com.tevolvers.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.tevolvers.certification.userinterfaces.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AddProductToCart implements Interaction {

    private static Target product;
    private static int count;

    public AddProductToCart(Target product, int count) {
        this.product = product;
        this.count = count;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(product)
        );
        for (int i = 0;i < count;i++){
            actor.attemptsTo(
                    Click.on(ADD_NUMBER_ITEM)
            );
        }
        actor.attemptsTo(
                Click.on(ADD_TO_CART),
                Wait.theSeconds(10),
                Click.on(CLOSE_POPUP)
        );
    }

    public static AddProductToCart add(Target product, int count) {
        return instrumented(AddProductToCart.class, product, count);
    }
}
