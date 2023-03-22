package Managers;

import com.google.common.cache.AbstractCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class WebDriverManager {

    public WebDriverManager(String webDriverType){
        this.webDriverType = webDriverType;
    }

    private WebDriver driver;

    private String webDriverType;

    private WebDriver createDriver(){
        switch (webDriverType){
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
                driver = new ChromeDriver();
                break;

            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.out.println("Optiunea de Web Driver indicata nu este valabila! Mai incearca!");
        }
        return driver;
    }

    public WebDriver getDriver(){
        if(driver == null){
            createDriver();
        }

        return driver;
    }

    public void closeDriver(){
        if (driver != null){
            driver.close();
            System.out.println("Driverul a fost inchis!");
        }
    }
}
