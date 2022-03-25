package co.com.tevolvers.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_FIELD = Target.the("Email field").
            located(By.id("email"));
    public static final Target PASSWORD_FIELD = Target.the("Password field").
            located(By.id("passwd"));
    public static final Target LOGIN_BTN = Target.the("Login button").
            located(By.id("SubmitLogin"));
    public static final Target MESSAGE = Target.the("Error login message").
            located(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
}
