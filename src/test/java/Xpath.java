import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class Xpath {
    @Test
    public void fillForm() {
        open("http://suninjuly.github.io/find_xpath_form");
        $(By.name("first_name")).setValue("Ivan");
        $(By.name("last_name")).setValue("Petrov");
        $(".city").setValue("Smolensk");
        $("#country").setValue("Russia");
        $(By.xpath("//button[@type=\"submit\"]")).click();
        sleep(6000);

    }
}
