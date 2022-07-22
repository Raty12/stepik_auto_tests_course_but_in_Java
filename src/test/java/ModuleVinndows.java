import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Math.abs;

public class ModuleVinndows {
    @Test
    public void confirm() {
        open("http://suninjuly.github.io/alert_accept.html");
        $(By.tagName("button")).click();
        Selenide.switchTo().alert().accept();
        String x = $(By.id("input_value")).getText();
        double answer = Math.log(abs(12*Math.sin(Double.parseDouble(x))));
        String answer1 = String.valueOf(answer);
        $(By.id("answer")).setValue(answer1);
        $(By.tagName("button")).click();
        sleep(6000);
    }
}
