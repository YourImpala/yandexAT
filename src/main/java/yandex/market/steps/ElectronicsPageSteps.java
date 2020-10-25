package yandex.market.steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import yandex.market.pageObjects.ElectronicsPage;
import yandex.market.pageObjects.MainPage;

public class ElectronicsPageSteps {

    WebDriver driver;
    private ElectronicsPage electronicsPage;

    public ElectronicsPageSteps(WebDriver driver) {
        this.driver = driver;
        this.electronicsPage = new ElectronicsPage();
    }

    @Step("Заголовок  открывшейся страницы = '{title}'")
    public void checkTitle(String title) {
        Assertions.assertTrue(
                electronicsPage.checkTitle(driver, title)
        );
    }

    @Step("Нажать на элемент каталога - '{name}'")
    public void clickOnCatalogItem(String name) {
        electronicsPage.clickOnCatalogItem(name);
    }
}
