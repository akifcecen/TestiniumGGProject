package Sayfalar;

import Icerik.GirisIcerik;
import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


public class Giris extends BasePage implements GirisIcerik {

    private Logger LOGGER = LogManager.getLogger(Giris.class);
    String email="akifcecenn";
    String sifre="wink19-apace";

    public void goToLoginPage (){
        waitSeconds(1);
        String actualTitle;
        actualTitle = driver.getTitle();
        Assert.assertTrue("anasayfada değilsiniz", actualTitle.equals("Üye Giriş Sayfası – Gittigidiyor.com"));

    }

    public void Girisyap(){
        waitForElementAndClick(login);
        waitForElementAndClick(loginbutton);
        waitForElementAndSendKeys(emailText,email);
        waitForElementAndSendKeys(sifreText,sifre);
        waitForElementAndClick(girisYap);
        Assert.assertTrue("Hesabın elementi görünmüyor. Login işlemi başarısız.",isElementVisible(submitKontrol,10));
        LOGGER.info("Başarılı şekılde giriş yapıldı.");
    }

}
