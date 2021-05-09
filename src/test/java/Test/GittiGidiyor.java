package Test;

import Sayfalar.Arama;
import Sayfalar.Giris;
import base.BaseTest;
import org.junit.Test;

public class GittiGidiyor extends BaseTest {

    Giris loginPage;
    Arama searchPage;

    @Test
    public void  GittiGidiyor(){

        loginPage=new Giris();
        searchPage=new Arama();

        loginPage.Girisyap();
        searchPage.Search();



    }



}
