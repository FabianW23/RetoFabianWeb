package co.com.tevolvers.certification.stepdefinitions;

import co.com.tevolvers.certification.questions.LoginFailedValidation;
import co.com.tevolvers.certification.questions.LoginValidation;
import co.com.tevolvers.certification.questions.OrderConfirmationValidation;
import co.com.tevolvers.certification.tasks.Login;
import co.com.tevolvers.certification.tasks.LoginFailed;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInStepdefinitions {

    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Fabian");
    }

    @Given("^the user access to the home page$")
    public void theUserAccessToTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^the user enter all login data correctly$")
    public void theUserEnterAllLoginDataCorrectly() {
        theActorInTheSpotlight().attemptsTo(Login.login());
    }

    @Then("^the user can see his name in the page$")
    public void theUserCanSeeHisNameInThePage() {
        theActorInTheSpotlight().should(seeThat(LoginValidation.validate(), Matchers.is(true)));
    }

    @When("^the user enter all login with bad data$")
    public void theUserEnterAllLoginWithBadData() {
        theActorInTheSpotlight().attemptsTo(LoginFailed.login());
    }


    @Then("^the user can see an error message$")
    public void theUserCanSeeAnErrorMessage(List<String> message) {
        theActorInTheSpotlight().remember("message",message.get(0));
        theActorInTheSpotlight().should(seeThat(LoginFailedValidation.validate(), Matchers.is(true)));
    }

}
