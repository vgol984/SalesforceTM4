package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    WebDriver driver;
    String label;

    public CheckBox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void clickCheckbox(){
        driver.findElement(By.xpath(String.format("//label/span[text()='%s']//ancestor::lightning-primitive-input-checkbox//input", label))).click();
    }
}
