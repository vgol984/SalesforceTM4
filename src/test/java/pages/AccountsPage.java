package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPage extends BasePage{

    private final By BUTTON_NEW = By.xpath("//div[text()='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountPage clickNewButton(){
        driver.findElement(BUTTON_NEW).click();
        return new NewAccountPage(driver);
    }

    public AccountsPage isPageOpened(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='New']")));
        return this;
    }
}
