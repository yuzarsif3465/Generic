package Uygulama1;

import java.util.ArrayList;
// burada her extends edilen clas icin ayrı ayrı metot yazmamak için ortak metotlar oluşturuyoruz ** <> ** yaparak
// not: bu islmeler class ı herhangi baska clas tarafından kullanılmasın istiyorsak bunuda extends edersin
// bu şekilde sadece extend edilen ve extends edenler tarafından kullanılabilir.

public class Islemler<T> extends Kisi {
    private ArrayList<T> liste = new ArrayList<>();
    public void kaydet(T t){
        liste.add(t);
    }
    public void sil(T t){
        liste.remove(t);
    }
    public void listele(){
        for(T t:liste){
            System.out.println(t);
        }
    }

}
