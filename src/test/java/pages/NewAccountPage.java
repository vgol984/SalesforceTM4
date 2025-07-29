package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.CheckBox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

public class NewAccountPage extends BasePage{
    private final By BUTTON_SAVE = By.xpath("//button[@name='SaveEdit']");
    private final By SCROLL_TO_ELEMENT = By.xpath("//span[text()='Description']");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage saveAccountInfo(){
        driver.findElement(BUTTON_SAVE).click();
        return new AccountsPage(driver);
    }

    public NewAccountPage setAccountInfo(String rating, String accountName, String phone, String fax, String accountNumber, String webSite, String accountSite,
                               String tickerSymbol, String type, String ownership, String industry, String employees, String annualRevenue, String sicCode,
                               String billingStreet, String shippingStreet){
        new Picklist(driver, "Rating").selectOption(rating);
        new Picklist(driver, "Type").selectOption(type);
        new Picklist(driver, "Industry").selectOption(industry);
        new Picklist(driver, "Ownership").selectOption(ownership);
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Website").write(webSite);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(tickerSymbol);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "SIC Code").write(sicCode);
        new Textarea(driver, "Billing Street").writeToArea(billingStreet);
        new Textarea(driver, "Shipping Street").writeToArea(shippingStreet);
        new CheckBox(driver, "VIP Client").clickCheckbox();
        new CheckBox(driver, "TeachMeSkills").clickCheckbox();
        return this;
    }

    public NewAccountPage isPageOpened(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='SaveEdit']")));
        return this;
    }
}
