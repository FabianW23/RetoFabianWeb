package co.com.tevolvers.certification.stepdefinitions;


import co.com.tevolvers.certification.questions.OrderConfirmationValidation;
import co.com.tevolvers.certification.questions.TotalPriceValidation;
import co.com.tevolvers.certification.tasks.AddProducts;
import co.com.tevolvers.certification.tasks.Checkout;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyProductsStepdefinitions {

    @When("^The user search some products$")
    public void theUserSearchSomeProducts() {
        theActorInTheSpotlight().attemptsTo(AddProducts.add());
    }

    @When("^The user pay the products$")
    public void theUserPayTheProducts() {
        theActorInTheSpotlight().attemptsTo(Checkout.products());
    }

    @Then("^he can see the total value$")
    public void heCanSeeTheTotalValue() {
        theActorInTheSpotlight().should(seeThat(TotalPriceValidation.validate(), Matchers.is(true)));
    }

    @Then("^The user can see the order confirmation message$")
    public void theUserCanSeeTheOrderConfirmationMessage(List<String> message) {
        theActorInTheSpotlight().remember("message",message.get(0));
        theActorInTheSpotlight().should(seeThat(OrderConfirmationValidation.validate(), Matchers.is(true)));
    }

}
