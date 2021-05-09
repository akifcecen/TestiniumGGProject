package Icerik;

import Util.ElementInfo;
import org.openqa.selenium.By;

public interface AramaIcerik {
    public ElementInfo aramaText = new ElementInfo("E-posta adresi girilemedi", By.xpath("//div[@class=\"sc-4995aq-4 dNPmGY\"]/input"));
    public ElementInfo twoPage = new ElementInfo("İkinci Sayfaya gidilemedi", By.xpath("//ul[@class='clearfix']/li/a[.='2']"));
    public ElementInfo secondPageActiveControl = new ElementInfo("İkinci sayfa aktif değil", By.xpath("//li[@class='selected']/a[.='2']"));
    public ElementInfo sepetEkleButton = new ElementInfo("Sepete eklenemedi", By.xpath("//button[@id='add-to-basket']"));
    public ElementInfo sepetttimButton = new ElementInfo("Sepette eklenemedi", By.cssSelector(".gg-ui-btn-default.padding-none"));
    public ElementInfo urunAlan = new ElementInfo("Urun bulunamadı", By.xpath("//div[@class='gg-input gg-input-select ']"));
    public ElementInfo urunAlanSec = new ElementInfo("Urun seçilemedi", By.xpath("//div[@class='gg-input gg-input-select ']//select//option[2]"));
    public ElementInfo urunSil = new ElementInfo("Urun Silinemedi", By.xpath("//div[@class='gg-d-24 hidden-m update-buttons-container']//a[1]"));
    public ElementInfo sepetControl = new ElementInfo("Sepet kontrol edilemedi", By.xpath("//h2[.='Sepetinizde ürün bulunmamaktadır.']"));

}
