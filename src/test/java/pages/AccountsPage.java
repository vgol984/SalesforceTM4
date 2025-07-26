package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage{

    private final By BUTTON_NEW = By.xpath("//div[text()='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewButton(){
        driver.findElement(BUTTON_NEW).click();
    }
}
