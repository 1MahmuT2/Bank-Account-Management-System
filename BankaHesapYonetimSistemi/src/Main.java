import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Müşterinin İsmi: ");
            String müsteriAdi1= scanner.nextLine();
            Müsteri müsteri = new Müsteri(müsteriAdi1);


            System.out.print("Tasarruf hesabı Numarası: ");
            String tasarrufHesapNumarası1 = scanner.nextLine();
            System.out.print("Tasarruf hesabı Bakiyesi: ");
            double bakiye1=scanner.nextDouble();
            System.out.print("Faiz oranı: ");
            double faizOranı1= scanner.nextDouble();
            scanner.nextLine();

            Tasarruf tasarruf1 = new Tasarruf(tasarrufHesapNumarası1, bakiye1, faizOranı1);


            System.out.print("Cari Hesap Numarası: ");
            String cariHesapNumarası1= scanner.nextLine();
            System.out.print("Cari Hesap Bakiyesi: ");
            double bakiye2= scanner.nextDouble();
            System.out.print("Ek Hesap Limiti: ");
            int ekHesapLimiti1= scanner.nextInt();
            scanner.nextLine();

            CariHesap cariHesap1 = new CariHesap(cariHesapNumarası1, bakiye2, ekHesapLimiti1, 100);


            Banka banka = new Banka();
            banka.hesapEkle(cariHesap1);
            banka.hesapEkle(tasarruf1);


            // Hesap Detayları

            tasarruf1.hesapBilgileriniGöster();
            cariHesap1.hesapBilgileriniGöster();


            while(true){
                String islemler=" Tasarruf Hesap İşlemleri= '1'\n"
                        +" Cari  Hesap İşlemleri = '2'\n"
                        +" Banka toplam Mevcut bakiye= '3'\n"
                        +" Çıkış İçin= '4'";

                System.out.println("------------------------------------------");
                System.out.println(islemler);
                System.out.println("------------------------------------------");
                System.out.print("İşlem seçin: ");
                String islem1= scanner.nextLine();



                if(islem1.equals("1")){
                    String islemler44 = "Para yatırmak için= '1'\n"
                            +"Para çekmek için= '2'\n"
                            +"Faiz Uygulamak için= '3'\n"
                            +"Çıkış için= '4'";



                    System.out.println("------------------------");
                    System.out.println("Tasarruf hesabı içerisindesiniz....");
                    System.out.println(islemler44);
                    System.out.println("------------------------");
                    System.out.print("işlem seçin: ");
                    int secim33=scanner.nextInt();
                    System.out.println("------------------------");


                    switch(secim33){
                        case 1:
                            tasarruf1.paraYatir();
                            break;

                        case 2:
                            tasarruf1.paraÇek();
                            break;

                        case 3:
                            tasarruf1.faizHesaplamaProgramı();
                            break;

                        case 4:
                            System.out.println("Programdan çıkılıyor...");
                            break;

                        default:
                            System.out.println("Geçersiz seçim...");
                            break;
                    }


                }

                else if(islem1.equals("2")){
                    String islemler44 = "Para yatırmak için= '1'\n"
                            +"Para çekmek için= '2'\n"
                            +"Hesap kesim Ücreti Uygulama= '3'\n"
                            +"Çıkış için= '4'";
                    System.out.println("------------------------");
                    System.out.println("Cari hesabı içerisindesiniz....");
                    System.out.println(islemler44);
                    System.out.println("------------------------");
                    System.out.print("işlem seçin: ");
                    int secim33=scanner.nextInt();
                    System.out.println("------------------------");

                    switch(secim33){
                        case 1:
                            cariHesap1.paraYatir();
                            break;

                        case 2:
                            cariHesap1.paraÇek();
                            break;

                        case 3:
                            cariHesap1.hesapKullanımÜcreti();
                            break;

                        case 4:
                            System.out.println("Programdan çıkılıyor...");
                            break;

                        default:
                            System.out.println("Geçersiz seçim...");
                            break;

                    }



                }else if(islem1.equals("3")){


                    System.out.println("Toplam mevcut bakiye: "+ banka.toplamMevcutBakiye()+"TL");



                }else if ( islem1.equals("4")){
                    System.out.println("Programdan çıkılıyor....");
                    System.out.println("İslem başarılı....");

                    break;
                }





            }




        } catch (NegatifBakiyeException e) {
            System.out.println(e.getMessage());

        }

    }
}