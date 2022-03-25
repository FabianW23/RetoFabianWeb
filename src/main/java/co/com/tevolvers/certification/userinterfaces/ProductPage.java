package co.com.tevolvers.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target PRICE = Target.the("Produc price").
            located(By.className("our_price_display"));
    public static final Target ADD_NUMBER_ITEM = Target.the("Add count of items").
            located(By.className("icon-plus"));
    public static final Target ADD_TO_CART = Target.the("Add product to cart").
            located(By.id("add_to_cart"));
    public static final Target GO_TO_CART = Target.the("go to cart button").
            located(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
    public static final Target CLOSE_POPUP = Target.the("close popup button").
            located(By.className("cross"));
}
