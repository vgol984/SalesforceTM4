package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Textarea {
    WebDriver driver;
    String label;

    public Textarea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeToArea(String text){
        driver.findElement(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-textarea//textarea", label))).sendKeys(text);
    }
}
