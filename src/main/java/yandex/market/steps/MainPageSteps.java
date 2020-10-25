package yandex.market.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import yandex.market.pageObjects.MainPage;
import org.junit.jupiter.api.Assertions;


public class MainPageSteps {
    WebDriver driver;
    private MainPage mainPage;

    public MainPageSteps(WebDriver driver) {
        this.driver = driver;
        this.mainPage = new MainPage();
    }

    @Step("Заголовок  открывшейся страницы = '{title}'")
    public void checkTitle(String title) {
        Assertions.assertTrue(
                mainPage.checkTitle(driver, title)
        );
    }

    @Step("Нажать на сервис - '{service}'")
    public void clickOnService(String service) {
        mainPage.clickOnService(service);
    }

}
