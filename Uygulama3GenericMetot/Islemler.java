package Uygulama3GenericMetot;

public interface Islemler<T> {
    // bu metotlardan sonuc alabilmek icin void degil double yapalım
    // otomatikmen iplements edilenlerde double yapılmak zorunda
    public double alanHesapla(T t);
    public double cevreHesapla(T t);

    public double alanHesapla();
    public double cevreHesapla();
}
