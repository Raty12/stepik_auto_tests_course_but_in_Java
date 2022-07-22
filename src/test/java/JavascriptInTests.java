import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptInTests {
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("alert('Robots at work');");
        } else {
            throw new IllegalStateException("This driver does not support JavaScript!");
        }
    }
}
