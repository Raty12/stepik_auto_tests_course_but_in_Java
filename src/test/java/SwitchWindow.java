import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Math.abs;


public class SwitchWindow {
    @Test
    public void anotherWindow() {
        open("http://suninjuly.github.io/redirect_accept.html");
        $(By.tagName("button")).click();
        switchTo().window(1);
        String x = $(By.id("input_value")).getText();
        double answer = Math.log(abs(12*Math.sin(Double.parseDouble(x))));
        String answer1 = String.valueOf(answer);
        $(By.id("answer")).setValue(answer1);
        $(By.tagName("button")).click();
        sleep(6000);


    }
}
