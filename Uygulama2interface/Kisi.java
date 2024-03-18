package Uygulama2interface;

public abstract class Kisi {
    private String adı;
    private String soyadı;
    private int dogumYılı;
    public Kisi(){

    }
    public Kisi(String adı,String soyadı, int dogumYılı){
        this.adı=adı;
        this.soyadı=soyadı;
        this.dogumYılı=dogumYılı;
    }

    public String getSoyadı() {
        return soyadı;
    }

    public void setSoyadı(String soyadı) {
        this.soyadı = soyadı;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public int getDogumYılı() {
        return dogumYılı;
    }

    public void setDogumYılı(int dogumYılı) {
        this.dogumYılı = dogumYılı;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adı='" + adı + '\'' +
                ", soyadı='" + soyadı + '\'' +
                ", dogumYılı=" + dogumYılı +
                '}';
    }
}
