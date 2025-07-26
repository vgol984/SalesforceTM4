package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    private final By WAFFLE_BUTTON = By.xpath("//button[@title='App Launcher']");
    private final By SALES_CONSOLE_BUTTON = By.xpath("//span/p[text()='Sales Console']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickWaffleButton(){
        driver.findElement(WAFFLE_BUTTON).click();
    }

    public void clickConsoleButton(){
        driver.findElement(SALES_CONSOLE_BUTTON).click();
    }
}
