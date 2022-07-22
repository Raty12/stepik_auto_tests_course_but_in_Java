import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.bytebuddy.utility.nullability.NeverNull;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HugeForm {
    @Test
    public void speedFill(){
        open("http://suninjuly.github.io/huge_form.html");
        ElementsCollection element = $$(By.tagName("input"));
        for (SelenideElement e : element ) {
           e.setValue("Answer");
        }
        $(By.tagName("button")).click();
        sleep(6000);

    }
}
