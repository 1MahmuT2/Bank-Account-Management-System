public class Tasarruf extends Hesap {
    private double faizOranı;

    public Tasarruf ( String hesapNo, double bakiye, double faizOranı){
        super(bakiye, hesapNo);
        this.faizOranı=faizOranı;
    }

    public double getfaizOranı(){
        return faizOranı;
    }

    @Override
    public void paraYatir() {
        System.out.println("Tasarruf Hesap Para Yatırma Sistemi içindesiniz....");
        System.out.print("Yatırmak istediğiniz tutar:");
        int tutar = scanner.nextInt();
        if(tutar>0){
            System.out.println("İşlem başarılı...");
            tutar+=getBakiye();
        }else{
            System.out.println("İşlem başarısız...");
        }
    }


    public void faizHesaplamaProgramı(){
        // Aylık Faiz Getirisi = (Anapara / 100) x (Faiz Oranı / 12) x Ay Sayısı​
        System.out.print("Kaç ay faiz hesabı kullanacaksınız: ");
        int faizAy=scanner.nextInt();
        double faiz= (getBakiye()/100)*(getfaizOranı()*12)*faizAy;

        System.out.println(faizAy+" Ay sonucunda ana paranız: "+ faiz);
    }

}