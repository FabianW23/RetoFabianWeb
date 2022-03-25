package co.com.tevolvers.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tevolvers.certification.userinterfaces.CheckoutPage.ORDER_COMPLETE;

public class OrderConfirmationValidation implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        String message = actor.recall("message").toString();
        return message.equals(ORDER_COMPLETE.resolveFor(actor).getText());
    }

    public static OrderConfirmationValidation validate(){
        return new OrderConfirmationValidation();
    }
}
