package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    private static class Locators{
        private final static By h1Element = By.tagName("form");
        private final static By labelElement = By.xpath("/html/body/div[1]/div/header/div[2]/div/div[2]/div/form/input");
    }

    private static class Label{
        private final static String partOfUrlText = "Найдено по запросу";
    }

    public void waitForPageLoaded(){
        waiters.waitTitleContainsText(Label.partOfUrlText);
    }
    public void waitForH1Loaded(){
        waiters.waitForVisabilityOfElement(Locators.h1Element);
    }
    public String getTextFromH1(){
        return elements.getTextFromElementBy(Locators.h1Element);
    }
    public String getTextFromLabel(){
        return elements.getTextFromElementBy(Locators.labelElement);
    }

    public void checkH1ElementContainsText(String input){
        String resultOfReach = elements.getTextFromElementBy(Locators.h1Element).replace("Найдено по запросу ", "");
        assertions.equalsOfStrings(resultOfReach, "«"+input+"»" );
    }
    public void checkLabelElementContainsText(String input){
        String resultOfReach = elements.getTextFromElementBy(Locators.labelElement);
        assertions.equalsOfStrings(resultOfReach, "«"+input+"»" );
    }
}
