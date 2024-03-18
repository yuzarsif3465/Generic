package Uygulama1;

public class Ogrenci extends Kisi {
    private String  okulNumarası;
    public Ogrenci(){}
    public Ogrenci(String adı, String soyadı, int dogumYılı){
        super(adı, soyadı, dogumYılı);
    }
    public Ogrenci(String adı, String soyadı, int dogumYılı, String okulNumarası){
        super(adı, soyadı, dogumYılı);
        this.okulNumarası=okulNumarası;
    }

    public String getOkulNumarası() {
        return okulNumarası;
    }

    public void setOkulNumarası(String okulNumarası) {
        this.okulNumarası = okulNumarası;
    }

    @Override
    public String toString() {
        return "Ogrenci{ adı: " +getAdı()+" soyadı: "+ getSoyadı()+" dogum yılı" + getDogumYılı() + " okulNumarası='" + okulNumarası + '\'' + '}';
    }
}
