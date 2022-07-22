import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class SendFile {
    @Test
    public void send(){
        open("http://suninjuly.github.io/file_input.html");
        $(By.name("firstname")).setValue("Robot");
        $(By.name("lastname")).setValue("001");
        $(By.name("email")).setValue("robot@test.com");
        File file = $(By.id("file")).uploadFile(new File("D:/1/uploadText.txt"));
        $(By.tagName("button")).click();
        sleep(6000);

    }
}
