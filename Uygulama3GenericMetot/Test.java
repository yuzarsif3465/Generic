package Uygulama3GenericMetot;

public class Test {
    public static void main(String[] args) {
        Daire daire = new Daire(5.7);
        Kare kare = new Kare(5);
        DaireIslemler daireislemleri = new DaireIslemler();
        KareIslemler kareislemleri = new KareIslemler();
        double alan = daireislemleri.alanHesapla(daire);
        double cevre = daireislemleri.cevreHesapla(daire);
        double alankare = kareislemleri.alanHesapla(kare);
        System.out.println("Alan : " + alan);
        System.out.println("Cevre " + cevre);

        System.out.println("Kare : ");
        System.out.println("Alan : " + alankare);

        hesapla(daire);
    }
    // generic bu şekilde
    public static <T> void hesapla(T t){
        System.out.println(t);
    }
}
