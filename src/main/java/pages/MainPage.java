package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private static class Locators{
        private final static By searchField = By.xpath("/html/body/div[1]/div/header/div[2]/div/div[2]/div/form/input");
        private final static By searchButton = By.xpath("/html/body/div[1]/div/header/div[2]/div/div[2]/div/form");
    }

    private static class Label{
        private final static String url = "https://www.ctrs.com.ua/ru/";
        private final static String citrusurl = "https://www.ctrs.com.ua/ru/";
    }

    public void searchByText(String text){
        elements.sendKeysToElementBy(Locators.searchField,text);
        elements.clickOnElementBy(Locators.searchButton);
    }
    public void openPage(){
        driver.get(Label.url);
    }
}
