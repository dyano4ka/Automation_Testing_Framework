package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"input-firstname\"]")
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/form/div/div/div/input")
    private WebElement privacyCheckbox;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/form/div/div/button")
    private WebElement continueButton;

    public void fillInTheRegisterForm(String firstName, String lastName, String email, String password) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);

    }

    public void acceptAndContinue(){
        privacyCheckbox.click();
        continueButton.click();
    }
}

