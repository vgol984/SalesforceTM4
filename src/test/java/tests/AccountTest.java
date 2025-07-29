package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import wrappers.Input;

import java.time.Duration;
import java.util.HashMap;

import static java.lang.Thread.sleep;

public class AccountTest extends BaseTest{

    @Test
    public void checkCreateAccount(){

        loginPage.open()
                        .login("tborodich@tms.sandbox", "Password003!");
        mainPage.clickWaffleButton()
                        .clickConsoleButton();
        accountsPage.clickNewButton();
        newAccountPage.setAccountInfo("Hot", "qwerty", "+8764321", "+123123123",
                        "123123123", "terty.uk", "qwerty.su", "test", "Prospect", "Public",
                        "Apparel", "mmhgjn", "fhfgh", "123", "Baker St.", "Wall St.")
                        .saveAccountInfo();

        /*loginPage.open();
        loginPage.login("tborodich@tms.sandbox", "Password003!");
        mainPage.clickWaffleButton();
        mainPage.clickConsoleButton();
        accountsPage.clickNewButton();
        newAccountPage.setAccountInfo("Hot", "qwerty", "+8764321", "+123123123",
                "123123123", "terty.uk", "qwerty.su", "test", "Prospect", "Public",
                "Apparel", "mmhgjn", "fhfgh", "123", "Baker St.", "Wall St.");
        newAccountPage.saveAccountInfo();*/
    }
}
