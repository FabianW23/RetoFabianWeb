package co.com.tevolvers.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountPage {
    public static final Target ACCOUNT_NAME = Target.the("login button").
            located(By.className("account"));
}
