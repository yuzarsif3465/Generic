package Uygulama3GenericMetot;

public class DaireIslemler implements Islemler<Daire>{
    @Override
    public double alanHesapla(Daire t) {
        double alan = t.getPI()*t.getYariCap()*t.getYariCap();
        return alan;
    }

    @Override
    public double cevreHesapla(Daire t) {
        double cevre=2*t.getPI()*t.getYariCap();
        return cevre;
    }

    // burada aynı zamanda daire degerini burada verip aynı zamanada metotlarıda buradan alabiliriz
    // or
    private Daire daire;
    public DaireIslemler(){

    }
    public DaireIslemler(Daire daire){
        this.daire=daire;
    }
    //
    public double alanHesapla(){
        return daire.getPI()*daire.getYariCap()*daire.getYariCap();
    }

    @Override
    public double cevreHesapla() {
        return 0;
    }
}
