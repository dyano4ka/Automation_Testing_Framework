import Managers.WebDriverManager;

public class testRunner {
    public static void main(String[] args) {
        WebDriverManager webDriverManager = new WebDriverManager("FIREFOX");

        webDriverManager.getDriver().get("https://www.google.md");
    }
}
