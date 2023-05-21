import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test2 extends BaseTest{
    @Test
    public void teams() {
        driver.get("https://liquipedia.net/counterstrike/Main_Page");
        String teamseurl = "https://liquipedia.net/counterstrike/Portal:Teams";
        driver.findElement(By.xpath("/html/body/div[3]/main/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/a")).click();
        assertEquals(driver.getCurrentUrl(), teamseurl);
        driver.quit();
    }
    @Test
    public void  players() {
        driver.get("https://liquipedia.net/counterstrike/Main_Page");
        String url = "https://liquipedia.net/counterstrike/Portal:Players";
        driver.findElement(By.xpath("/html/body/div[3]/main/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void transfers() {
        driver.get("https://liquipedia.net/counterstrike/Main_Page");
        String url = "https://liquipedia.net/counterstrike/Portal:Transfers";
        driver.findElement(By.xpath("/html/body/div[3]/main/div/div[3]/div[3]/div/div[2]/div/div[3]/div/div/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void tournaments() {
        driver.get("https://liquipedia.net/counterstrike/Main_Page");
        String url = "https://liquipedia.net/counterstrike/Portal:Tournaments";
        driver.findElement(By.xpath("/html/body/div[3]/main/div/div[3]/div[3]/div/div[2]/div/div[4]/div/div/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void  statistic(){
        driver.get("https://liquipedia.net/counterstrike/Main_Page");
        String url = "https://liquipedia.net/counterstrike/Portal:Statistics";
        driver.findElement(By.xpath("/html/body/div[3]/main/div/div[3]/div[3]/div/div[2]/div/div[5]/div/div/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void maps(){
        driver.get("https://liquipedia.net/counterstrike/Main_Page");
        String url = "https://liquipedia.net/counterstrike/Portal:Maps";
        driver.findElement(By.xpath("/html/body/div[3]/main/div/div[3]/div[3]/div/div[2]/div/div[6]/div/div/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void futplayers(){
        driver.get("https://www.futbin.com/");
        String url = "https://www.futbin.com/players";
        driver.findElement(By.xpath("/html/body/header/nav/div/ul[1]/li[4]/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void futsquadb(){
        driver.get("https://www.futbin.com/");
        String url = "https://www.futbin.com/squad-builder";
        driver.findElement(By.xpath("/html/body/header/nav/div/ul[1]/li[5]/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void futsbc(){
        driver.get("https://www.futbin.com/");
        String url = "https://www.futbin.com/squad-building-challenges";
        driver.findElement(By.xpath("/html/body/header/nav/div/ul[1]/li[6]/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void futdraft(){
        driver.get("https://www.futbin.com/");
        String url = "https://www.futbin.com/draft-simulator";
        driver.findElement(By.xpath("/html/body/header/nav/div/ul[1]/li[7]/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void futlogin(){
        driver.get("https://www.futbin.com/");
        String url = "https://www.futbin.com/account/login";
        driver.findElement(By.xpath("/html/body/header/nav/div/ul[2]/li[3]/a")).click();
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
    @Test
    public void  futsearch(){
        driver.get("https://www.futbin.com/");
        String url = "https://www.futbin.com/23/player/50602/lionel-messi";
        driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div/div[2]/form/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div/div[2]/form/div/input")).sendKeys("messi");
        driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div/div[2]/form/div/input")).sendKeys(Keys.ENTER);
        assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
}
