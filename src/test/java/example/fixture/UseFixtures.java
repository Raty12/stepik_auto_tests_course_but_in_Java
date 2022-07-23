package example.fixture;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class UseFixtures extends Fixtures{
    @Test
    public void sampleTestOne() {
        driver.get("http://selenium1py.pythonanywhere.com/ru/");
        String title = driver.getTitle();
        Assertions.assertEquals("Oscar - Sandbox", title);
    }
    @Test
    public void sampleTestTwo() {
        driver.get("http://selenium1py.pythonanywhere.com/ru/");
        driver.findElement(By.id("login_link")).click();
        String title = driver.getTitle();
        Assertions.assertEquals("Войти или зарегистрироваться | Oscar - Sandbox", title);
    }
}
/*Аналог на Pithon выглядел так:
 # вызываем фикстуру в тесте, передав ее как параметр
    def test_guest_should_see_login_link(self, browser):
        browser.get(link)
        browser.find_element(By.CSS_SELECTOR, "#login_link")

 В Java же я нашла из методов подключения фикстуры только, либо наследование "extends", либо через интерфейсы "interface". */
