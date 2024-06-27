package baseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

    public void initializeBrowser() throws InterruptedException {
        String os;
        os = System.getProperty("os.name");
        System.out.println("os identified:"+os);
        if(os.contains("Linux")) {
            WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            Thread.sleep(3000);
            driver.close();
        }

    }
}
