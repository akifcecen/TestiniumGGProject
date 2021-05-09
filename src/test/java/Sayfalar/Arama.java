package Sayfalar;

import Icerik.AramaIcerik;
import base.BasePage;
import base.BaseTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class Arama extends BasePage implements AramaIcerik {
    String aramatxt ="bilgisayar";
    static String ilkfiyatTXT;

    public Logger LOGGER = LogManager.getLogger(Arama.class);
    protected WebDriver driver = BaseTest.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    public void Search()
    {
        waitForElementAndSendKeys(aramaText,aramatxt);
        waitSeconds(3);
        LOGGER.info("Arama alanına bılgısayar yazıldı.");

        driver.findElement(By.xpath("//input[@placeholder='Keşfetmeye Bak']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//ul[@class='clearfix']/li/a[.='2']")).sendKeys(Keys.DOWN);
        waitForElementAndClick(twoPage);
        Assert.assertTrue("2.sayfada olduğunuz doğrulanamadı.",isElementVisible(secondPageActiveControl,10));
        LOGGER.info("2.sayfaya geçıldı");
        randomUrunSec();
        LOGGER.info("Arama alanına bılgısayar yazıldı.");
        javaScriptClicker(sepetEkleButton);
        goToBasketAndControlPrice();
        waitSeconds(2);
        waitForElementAndClick(urunAlan);
        waitSeconds(1);
        waitForElementAndClick(urunAlanSec);
        LOGGER.info("Ürün arttırma gerçekleştırıldı.");
        waitForElementAndClick(urunSil);
        LOGGER.info("Sepettekı ürün temızlendı.");
        waitSeconds(3);

        Assert.assertTrue("Ürün sepeti boş değil.",isElementVisible(sepetControl,5));
        LOGGER.info("Sepetın boş olduğu doğrulandı.");

    }
    public void goToBasketAndControlPrice()
    {

        javaScriptClicker(sepetttimButton);
        WebElement secondByPrice = driver.findElement(By.xpath("//div[@class='new-price-box']//p"));
        String ikincifiyatTXT = secondByPrice.getText();
        LOGGER.info("Sepettekı ürün fıyatı alındı.");
        System.out.println("İkinci Fiyat :"+ikincifiyatTXT);
        Assert.assertEquals("",ilkfiyatTXT,ikincifiyatTXT);
        LOGGER.info("Ürün ve sepettekı fıyat eşıt olduğu doğrulandı");
    }

    public void randomUrunSec(){


        Random random = new Random();

        List<WebElement> imgSrcList = driver.findElements(By.xpath("//ul[@class='catalog-view clearfix products-container']//p/img"));
        int randomImg = random.nextInt(imgSrcList.size());

        By by =  By.xpath("(//a[@class='product-link']//p/img)["+randomImg+"]");
        System.out.println("Random ürün  : "+by);
        System.out.println("Random ürün  : "+by);
        System.out.println("Random ürün no : "+randomImg);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        waitSeconds(3);
        driver.findElement(by).click();
        LOGGER.info("Rastgele bır ürün seçıldı.");
        WebElement byPrice = driver.findElement(By.xpath("//div[@id='sp-price-container']//div[2]"));
        ilkfiyatTXT = byPrice.getText();
        LOGGER.info("Ürün sayfasından fıyat alındı");
        System.out.println("İlk fiyat :"+ilkfiyatTXT);

    }

}
