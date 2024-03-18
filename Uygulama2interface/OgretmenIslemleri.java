package Uygulama2interface;

public class OgretmenIslemleri implements Islmeler<Ogrenci>{
    @Override
    public boolean kaydet(Ogrenci ogrenci) {
        return false;
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
