package co.com.tevolvers.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tevolvers.certification.userinterfaces.CheckoutPage.TOTAL_PRICE;
import static co.com.tevolvers.certification.userinterfaces.ProductPage.PRICE;

public class TotalPriceValidation implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        String totalPrice = actor.recall("totalPrice").toString();
        return totalPrice.equals(TOTAL_PRICE.resolveFor(actor).getText().replace("$",""));
    }

    public static TotalPriceValidation validate(){
        return new TotalPriceValidation();
    }
}
