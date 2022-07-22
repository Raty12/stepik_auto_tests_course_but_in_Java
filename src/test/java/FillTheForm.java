import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


public class FillTheForm {

    @Test
    public void fillForm() {
        open("http://suninjuly.github.io/simple_form_find_task.html");
        $(By.name("first_name")).setValue("Ivan");
        $(By.name("last_name")).setValue("Petrov");
        $(".city").setValue("Smolensk");
        $("#country").setValue("Russia");
        $("#submit_button").click();
        sleep(30000);

    }

}
