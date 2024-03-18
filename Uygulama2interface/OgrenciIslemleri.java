package Uygulama2interface;
// burada implementin amacı ayrı ayrı classlarda ortak metotları hızlıca oluşturmak

import java.util.ArrayList;

public class OgrenciIslemleri implements Islmeler<Ogrenci>{


    // not: implements lerde normalde degişken tanımlanmaz ama degeri belliyse kullanırız
    public int a=5;
    // implements icinde sadece degeri belli olan her şey kullnaılır ör boş bir liste tanımla nesne sayesinde olştur
    private ArrayList<Ogrenci> ogrenciler= new ArrayList<>();

    @Override
    public boolean kaydet(Ogrenci ogrenci) {
        boolean durum= ogrenciler.add(ogrenci);
        return durum;
    }

    @Override
    public boolean sil(Ogrenci ogrenci) {
        return false;
    }

    @Override
    public boolean listele(Ogrenci ogrenci) {
        return false;
    }
}
