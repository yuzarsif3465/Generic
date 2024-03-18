package Uygulama3GenericMetot;

public class KareIslemler implements Islemler<Kare>{
    @Override
    public double alanHesapla(Kare t) {

        return t.getkenar()* t.getkenar();
    }

    @Override
    public double cevreHesapla(Kare t) {

        return 4* t.getkenar();
    }

    @Override
    public double alanHesapla() {
        return 0;
    }

    @Override
    public double cevreHesapla() {
        return 0;
    }
}
