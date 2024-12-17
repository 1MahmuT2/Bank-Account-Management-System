import java.util.ArrayList;

public class Banka {
    private ArrayList<Hesap> hesap1;

    public Banka(){
        hesap1=new ArrayList<>();
    }


    public void hesapEkle(Hesap hesap){
        hesap1.add(hesap);
    }

    public double toplamMevcutBakiye(){
        double toplam=0;
        for(Hesap hesap: hesap1){
            toplam+=hesap.getBakiye();
        }
        return toplam;
    }
}
