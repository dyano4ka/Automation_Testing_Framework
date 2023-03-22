import Managers.WebDriverManager;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class testRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager webDriverManager = new WebDriverManager("FIREFOX");

        webDriverManager.getDriver().get("https://demo.opencart.com");

        HomePage homePage = new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();

        RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());
        registerPage.fillInTheRegisterForm("Ina", "Bond", "ana.cretu@email.com", "pass!");
        Thread.sleep(3000);
        registerPage.acceptAndContinue();
        Thread.sleep(2000);
        webDriverManager.getDriver().close();
    }
}
