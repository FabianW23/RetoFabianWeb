package co.com.tevolvers.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WomanPage {
    public static final Target WOMAN = Target.the("Woman page button").
            located(By.xpath("//a[text()='Women']"));
    public static final Target PRODUCT1 = Target.the("Product number 1").
            located(By.xpath("//div[@class='product-container']//a[contains(text(),'Faded Short Sleeve T-shirts')]"));
    public static final Target PRODUCT2 = Target.the("Product number 2").
            located(By.xpath("//div[@class='product-container']//a[contains(text(),'Blouse')]"));
    public static final Target PRODUCT3 = Target.the("Product number 3").
            located(By.xpath("//div[@class='product-container']//a[contains(text(),'Printed Dress')]"));
}
