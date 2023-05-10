import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Testsearch  extends BaseTest{

    @Test
    public void citrusurl () throws InterruptedException {
        driver.get("https://www.ctrs.com.ua/ru/");
        String Nexturl = "https://www.ctrs.com.ua/ru/smartfony/brand-apple/seriya_iphone-14_iphone-14-pro_iphone-14-plus_iphone-14-pro-max/";
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div[2]/div/div/a[1]/span")).click();
        Thread.sleep(3000);
        assertEquals(driver.getCurrentUrl(), Nexturl);
        driver.quit();
    }
    @Test
    public void citrusplay () {
        driver.get("https://www.ctrs.com.ua/ru/");
        String appletext = "iPhone 14";
        WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div[2]/div/div/a[1]/span"));
        text.getText();
        assertEquals(text.getText(),appletext);
        driver.quit();
    }
    @Test
    public void citruslocation() throws InterruptedException {
        driver.get("https://www.ctrs.com.ua/ru/");
        String dlocation = "Днепр";
        driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/ul/li[1]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[19]/p")).click();
        Thread.sleep(1000);
        WebElement Dnipro = driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/ul/li[1]/div/span"));
        assertEquals(Dnipro.getText(),dlocation);
        driver.quit();
    }
}
