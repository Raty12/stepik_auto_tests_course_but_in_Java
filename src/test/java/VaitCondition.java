import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Math.abs;

public class VaitCondition {
    @Test
    public void rent(){
        Configuration.timeout = 10000;

        open("http://suninjuly.github.io/explicit_wait2.html");
        $(By.id("price")).shouldHave(Condition.text("$100")).click();
        $(By.id("book")).click();
        String x = $(By.id("input_value")).getText();
        double answer = Math.log(abs(12*Math.sin(Double.parseDouble(x))));
        String answer1 = String.valueOf(answer);
        $(By.id("answer")).setValue(answer1);
        $(By.id("solve")).click();
        sleep(6000);
    }
}
