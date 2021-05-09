package Icerik;

import Util.ElementInfo;
import org.openqa.selenium.By;

public interface GirisIcerik {
    public ElementInfo login = new ElementInfo("Giriş yapılamadı", By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div"));

    public ElementInfo loginbutton = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//div[@class='sc-12t95ss-3 fDarBX']/a[@href=\"https://www.gittigidiyor.com/uye-girisi\"]"));

    public ElementInfo emailText = new ElementInfo("E-posta adresi girilemedi", By.id("L-UserNameField"));

    public ElementInfo sifreText = new ElementInfo("E-posta şifresi girilemedi", By.id("L-PasswordField"));

    public ElementInfo girisYap = new ElementInfo("Giriş yapılamadı", By.id("gg-login-enter"));

    public ElementInfo submitKontrol = new ElementInfo("Hesabın elementi gözükmedi", By.xpath("//span[@class='profile-page-name visible-d visible-w'][.='Hesabım']"));





}
