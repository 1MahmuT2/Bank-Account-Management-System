import java.util.Scanner;

public abstract class Hesap {
    Scanner scanner= new Scanner(System.in);

    private double bakiye;
    private String hesapNo;


    public Hesap(double bakiye, String hesapNo){
        this.bakiye=bakiye;
        this.hesapNo=hesapNo;
    }

    public String getHesapNo(){
        return hesapNo;
    }
    public double getBakiye(){
        return bakiye;
    }


    public void paraYatir(){
        System.out.print("Para yatırmak istediğiniz tutarı: ");
        int tutar = scanner.nextInt();

        if(tutar>0){
            bakiye+= tutar;
            System.out.println("İşlem başarılı....");
            System.out.println("Yeni bakiyeniz: "+ getBakiye());
        }else{
            System.out.println("İşlem başarısız...");
        }
    }

    public void paraÇek() throws NegatifBakiyeException {
        System.out.print("Çekmek istedğiniz tutar: ");
        int tutar= scanner.nextInt();

        if(tutar>0 && bakiye>= tutar){
            bakiye -= tutar;

            System.out.println(tutar + " TL çekildi. Yeni bakiye: " + bakiye + " TL");

        }else{
            throw new NegatifBakiyeException("Geçersiz miktar veya yetersiz bakiye. İşlem yapılamadı.");
        }
    }

    public void hesapBilgileriniGöster(){
        System.out.println("Hesap Numarası: "+ getHesapNo()+" Bakiyesi: "+getBakiye());
    }



}
