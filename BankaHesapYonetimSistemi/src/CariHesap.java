import java.net.SocketTimeoutException;

public class CariHesap extends Hesap {
    private int ekHesap;
    private int hesapKullanımÜcreti;


    public CariHesap (String hesapNo, double bakiye,int ekHesap,int hesapKullanımÜcreti){
        super(bakiye, hesapNo);
        this.ekHesap=ekHesap;
        this.hesapKullanımÜcreti=hesapKullanımÜcreti;
    }






    @Override
    public void paraYatir() {
        System.out.println("Cari Hesap Para Yatırma Sistemi içindesiniz....");
        System.out.print("Yatırmak istediğiniz tutar:");
        int tutar = scanner.nextInt();
        if(tutar>0){
            System.out.println("İşlem başarılı...");
            tutar+=getBakiye();
        }else{
            System.out.println("İşlem başarısız...");
        }

    }


    @Override
    public void paraÇek() throws NegatifBakiyeException {
        System.out.println("Cari Hesap Para Çekme  Sistemi içindesiniz....");
        System.out.print("Çekmek istediğiniz tutar: ");
        int tutar= scanner.nextInt();

        if(tutar>0 && getBakiye()+ ekHesap>= tutar){
            super.paraÇek();
            System.out.println("İşlem başarılı para çekildi");
        }else{
            throw new NegatifBakiyeException("Geçersiz miktar veya yetersiz bakiye. İşlem yapılamadı.");

        }

    }



    public void hesapKullanımÜcreti(){
        hesapKullanımÜcreti=50;

        System.out.println("Hesap kullanım ücreti tahsil edilmiştir...");
        double hesaplama= getBakiye()-hesapKullanımÜcreti;
        System.out.println("Yeni Bakiyeniz: "+ hesaplama);

    }
}