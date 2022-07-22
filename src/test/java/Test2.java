import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Test2 {
    @Test
    public void Link () {
        open("http://suninjuly.github.io/find_link_text");
        String text = String.valueOf(Math.round(Math.pow(Math.PI, Math.E)*10000));
        //System.out.println(text);
        $(By.linkText(text)).click();
        $(By.name("first_name")).setValue("Li");
        $(By.name("last_name")).setValue("Xao");
        $(".city").setValue("Seul");
        $("#country").setValue("China");
        $("button").click();

        sleep(3000);


    }
}
