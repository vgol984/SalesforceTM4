package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import pages.AccountsPage;
import pages.LoginPage;
import pages.MainPage;
import pages.NewAccountPage;

import java.time.Duration;
import java.util.HashMap;

public class BaseTest {

    WebDriver driver;
    SoftAssert softAssert;
    LoginPage loginPage;
    MainPage mainPage;
    NewAccountPage newAccountPage;
    AccountsPage accountsPage;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true, description = "Настройка драйвера")
    public void setup(@Optional("chrome") String browser, ITestContext iTestContext) {

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            HashMap<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("credentials_enable_service", false);
            chromePrefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", chromePrefs);
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-infobars");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")){

            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        softAssert = new SoftAssert();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        accountsPage = new AccountsPage(driver);
        newAccountPage = new NewAccountPage(driver);

    }
    @AfterMethod
    public void tearDown(ITestResult result) {
        driver.quit();
    }
}
