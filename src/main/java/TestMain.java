import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by jboiko on 16/01/2018.
 */
public class TestMain {

    private static final String WEB_DRIVER_FOLDER = "src\\test\\resources\\drivers\\chromedriver.exe";

    protected static void stopWebDriver() {
        driver.quit();
    }

    protected static void startWebDriver() {
        System.setProperty("webdriver.chrome.driver", WEB_DRIVER_FOLDER);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        driver = new ChromeDriver(options);
    }

    protected static WebDriver driver;

    public static void main(String[] args) {
        startWebDriver();
        driver.get("https://www.valtech.com/");

        driver.findElement(By.cssSelector("a[href = '/about/'")).click();
        System.out.println("About title is -> " + driver.findElement(By.cssSelector(".page-header > h1")).getText());

        driver.findElement(By.cssSelector("a[href = '/services/'")).click();
        System.out.println("Services title is -> " + driver.findElement(By.cssSelector(".page-header > h1")).getText());

        driver.findElement(By.cssSelector("a[href = '/work/'")).click();
        System.out.println("Work title is -> " + driver.findElement(By.cssSelector(".page-header > h1")).getText());

        driver.findElement(By.cssSelector("i[data-icon = 'earth-contact'")).click();
        System.out.println("Valtech offices in Total -> " + driver.findElements(By.cssSelector(".contactcountry")).size());

        stopWebDriver();
    }
}
