package co.com.tevolvers.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target DELIVERY_PRICE = Target.the("delivery price").
            located(By.xpath("//tr[@class='cart_total_delivery']//td[@class='price']"));
    public static final Target TOTAL_PRICE = Target.the("delivery price").
            located(By.xpath("//tr[@class='cart_total_price']//td[@id='total_price_container']"));
    public static final Target PROCEED_CHECKOUT = Target.the("Proceed to checkout button").
            located(By.xpath("//*[@id='center_column']//span[text()='Proceed to checkout']"));
    public static final Target PROCEED_CHECKOUT2 = Target.the("Proceed to checkout button").
            located(By.xpath("//*[@id='form']/p/button/span"));
    public static final Target TERMS_CHECK = Target.the("Terms check").
            located(By.id("cgv"));
    public static final Target PAYMENT_METHOD = Target.the("Payment method button").
            located(By.className("bankwire"));
    public static final Target COMFIRM_ORDER = Target.the("confirm order button").
            located(By.xpath("//*[@id='center_column']//span[text()='I confirm my order']"));
    public static final Target ORDER_COMPLETE = Target.the("Order complete message").
            located(By.xpath("//*[@id='center_column']/div/p/strong"));
}
