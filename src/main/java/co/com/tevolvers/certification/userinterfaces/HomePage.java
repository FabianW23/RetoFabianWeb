package co.com.tevolvers.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target SIGNIN = Target.the("login button").
            located(By.className("login"));
}
