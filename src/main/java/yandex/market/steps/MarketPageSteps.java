package yandex.market.steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import yandex.market.GeneralMethods;
import yandex.market.pageObjects.MarketPage;

public class MarketPageSteps {
    WebDriver driver;
    private MarketPage marketPage;

    public MarketPageSteps(WebDriver driver) {
        this.driver = driver;
        this.marketPage = new MarketPage();
    }

    @Step("Заголовок  открывшейся страницы = '{title}'")
    public void checkTitle(String title) {
        GeneralMethods.switchDriverToNextTab(driver);
        Assertions.assertTrue(
                marketPage.checkTitle(driver, title)
        );
    }

    @Step("Нажать на каталог '{catalogName}'")
    public void clickOnCatalog(String catalogName) {
        marketPage.clickOnCatalog(catalogName);
    }
}
