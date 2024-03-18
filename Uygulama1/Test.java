package Uygulama1;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("yusuf", "zorlu", 2002, "20120205018");
        Ogretmen ogretmen1 = new Ogretmen("Yuksel", "zorlu", 1977, "turkce");

        Islemler<Ogrenci> islem = new Islemler<>();
        islem.kaydet(ogrenci1);
        islem.listele();

        Islemler<Ogretmen> islemm = new Islemler<>();
        islemm.kaydet(ogretmen1);
        islemm.sil(ogretmen1);
    }
}