package Uygulama2interface;

public class Ogretmen extends Kisi{
    public String brans;
    public Ogretmen(){
    }
    public Ogretmen(String adı, String soyadı, int dogumYılı){
        super(adı, soyadı, dogumYılı);
    }
    public Ogretmen(String adı, String soyadı,  int dogumYılı, String brans){
        super(adı, soyadı, dogumYılı);
        this.brans= brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Ogretmen{adı: " +getAdı()+" soyadı: "+ getSoyadı()+" dogum yılı " + getDogumYılı()+" brans='" + brans + '\'' + '}';
    }
}
