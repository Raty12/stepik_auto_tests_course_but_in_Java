import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Math.abs;

public class RobotJavascript {
    @Test
    public void mathRobot() {
        open("http://suninjuly.github.io/execute_script.html");
        String x = $(By.id("input_value")).getText();
        double answer = Math.log(abs(12*Math.sin(Double.parseDouble(x))));
        String answer1 = String.valueOf(answer);
        $(By.id("answer")).setValue(answer1);
        $(By.id("robotCheckbox")).click();

        SelenideElement button;
        button = $("button");
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("return arguments[0].scrollIntoView(true);",button);
        $(By.id("robotsRule")).click();
        $(By.tagName("button")).click();
        sleep(5000);

        System.out.println(answer);

    }
}
