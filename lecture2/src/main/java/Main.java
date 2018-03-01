import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 2/27/18
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        WebDriver driver =  getChromeDriver();
        driver.get("https://www.bing.com");
        WebElement fieldSearch = driver.findElement(By.id("sb_form_q"));
        fieldSearch.sendKeys("selenium");
        WebElement buttonSearch = driver.findElement(By.name("go"));
        buttonSearch.click();

        List<WebElement> refers = driver.findElements(By.className("b_algo"));
        System.out.println(refers.size());

        driver.quit();
    }

    public static WebDriver getChromeDriver() {
        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }
}
