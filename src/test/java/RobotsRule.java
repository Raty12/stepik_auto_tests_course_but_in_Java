import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Value;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Math.abs;

public class RobotsRule {
    @Test
    public void mathRobot() {
        open("http://suninjuly.github.io/math.html");
        String x = $(By.id("input_value")).getText();
        double answer = Math.log(abs(12*Math.sin(Double.parseDouble(x))));
        String answer1 = String.valueOf(answer);
        $(By.id("answer")).setValue(answer1);
        $(By.id("robotCheckbox")).click();
        $(By.id("robotsRule")).click();
        $(By.tagName("button")).click();
        sleep(5000);

        System.out.println(answer);

    }
}
