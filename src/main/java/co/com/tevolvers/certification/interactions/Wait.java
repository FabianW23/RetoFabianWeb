package co.com.tevolvers.certification.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Wait implements Interaction {
    private long waitValue;
    public Wait(long waitValue){this.waitValue= waitValue;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(waitValue * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Wait theSeconds(long waitValue){
        return instrumented(Wait.class,waitValue);
    }
}