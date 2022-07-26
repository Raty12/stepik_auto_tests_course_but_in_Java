package example.fixture;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fixtures {
    public ChromeDriver driver;

    @BeforeEach
    public void setUP(){
        System.setProperty("webdriver.chrome.driver", "D:/soft/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test start.");
    }

    @AfterEach
    public void close() {
        System.out.println("Test clouse.");
        driver.quit();
    }
}
/*Аналог на Pithon из урока выглядел так:
import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By

link = "http://selenium1py.pythonanywhere.com/"
@pytest.fixture
def browser():
    print("\nstart browser for test..")
    browser = webdriver.Chrome()
    yield browser
    # этот код выполнится после завершения теста
    print("\nquit browser..")
    browser.quit()

    Здесь принципы довольно похожи. */
