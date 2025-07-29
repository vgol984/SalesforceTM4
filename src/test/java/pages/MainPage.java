package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    private final By WAFFLE_BUTTON = By.xpath("//button[@title='App Launcher']");
    private final By SALES_CONSOLE_BUTTON = By.xpath("//span/p[text()='Sales Console']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage clickWaffleButton(){
        driver.findElement(WAFFLE_BUTTON).click();
        return this;
    }

    public AccountsPage clickConsoleButton(){
        driver.findElement(SALES_CONSOLE_BUTTON).click();
        return new AccountsPage(driver);
    }

    @Override
    public MainPage isPageOpened(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='App Launcher']")));
        return this;
    }
}
