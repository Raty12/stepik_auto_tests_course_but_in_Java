import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;

public class SummDropbox {
    @Test
    public void dropbox() {
        open("http://suninjuly.github.io/selects1.html");
        String a = $(By.id("num1")).getText();
        String b = $(By.id("num2")).getText();
        int result = Integer.parseInt(a)+Integer.parseInt(b);
        Select select = new Select($(By.id("dropdown")));
        select.selectByValue(String.valueOf(result));
        $(By.tagName("button")).click();
        sleep(5000);
    }
}
