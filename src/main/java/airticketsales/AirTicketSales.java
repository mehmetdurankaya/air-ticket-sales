package airticketsales;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class AirTicketSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double biletFiyatiUzerindenIndirim = 0.10,yasIndirimOrani = 0.50,gidisDonusIndirimOrani = 0.20,yas65UstuIndirimOrani=0.30;
        double mesafe=0.0,birimFiyat = 0.10,toplamTutar;
        double biletFiyatiIndirimUygula,yasIndirimiUygula,gidiDonusIndirimiUygula,yas65UsuIndirimUygula;
        int yas;
        int select;

        System.out.println("Bu uygulama Uçak Bileti Satış uygulamasıdır.\n" +
                           "Lütfen Gitmek istediğiniz mesafeyi seçiniz!");
        mesafe = input.nextDouble();

        toplamTutar=mesafe*birimFiyat;
        System.out.println("İndirimsiz Toplam Tutar: " + toplamTutar +"TL\n" +
                           "********************");
        yasIndirimiUygula=toplamTutar*yasIndirimOrani;//12 yaş altındaki insanlar için
        System.out.println("12 yaşından küçükleri için Yaş indirimi :"+ yasIndirimiUygula +"TL\n" +
                           "********************");
        gidiDonusIndirimiUygula=yasIndirimiUygula*gidisDonusIndirimOrani;
        System.out.println("Gidiş dönüş indirimi: "+gidiDonusIndirimiUygula +"TL\n" +
                           "********************");
        biletFiyatiIndirimUygula=toplamTutar*biletFiyatiUzerindenIndirim;
        System.out.println("12-24 yaş arası Bilet fiyatı üzerinden indirim: " +biletFiyatiIndirimUygula+ "TL\n" +
                           "********************");
        yas65UsuIndirimUygula=toplamTutar* yas65UstuIndirimOrani;
        System.out.println("65 yaş üstü indirim "+ yas65UsuIndirimUygula+ "TL\n" +
                           "********************");


        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("-------------------------");
        System.out.print("Yolculuk tipini giriniz (1 ==> Tek Yön, 2 ==> Gidiş Dönüş): ");
        select = input.nextInt();
        System.out.println("-------------------------");
        switch (select) {
            case 1:
                System.out.print("Biletiniz Tek yön olarak kesildi: ");
                if (yas < 12){
                    System.out.println("12 yaşından küçüklere yaş indirimi uygulandı: " + yasIndirimiUygula+ "TL");
                    System.out.print("TOPLAM TUTAR: ");
                    System.out.println(toplamTutar-yasIndirimiUygula);
                }else if(yas>12 && yas<24){
                    System.out.println("12-24 yaş aralığındasınız bilet fiyatı üzerinden indirim uyulandı: "+ biletFiyatiIndirimUygula +"TL");
                    System.out.print("TOPLAM TUTAR: ");
                    System.out.println(toplamTutar-biletFiyatiIndirimUygula);
            } else if (yas>=65){
                    System.out.println("65 yaşı ve üstü bilet fiyatı indirimi uygulandı:"+ yas65UsuIndirimUygula +"TL");
                    System.out.print("TOPLAM TUTAR: ");
                    System.out.println(toplamTutar-yas65UsuIndirimUygula+ "TL");
            }else{
                    System.out.print("TOPLAM TUTAR: ");
                    System.out.println(toplamTutar+ "TL");
                }
                break;
            case 2:
                     System.out.println("Biletiniz Gidiş-Dönüş olarak kesildi. ");
                if (yas < 12){
                    System.out.println("12 yaşından küçüklere yaş indirimi uygulandı: " + yasIndirimiUygula+ "TL");
                    System.out.println("Gidiş-Dönüş indirimi uygulandı: " + gidiDonusIndirimiUygula+ "TL");
                    System.out.print("TOPLAM TUTAR: ");
                    System.out.println(toplamTutar-yasIndirimiUygula-gidiDonusIndirimiUygula+ " TL");
                }else if(yas>12 && yas<24){
                    System.out.println("12-24 yaş aralığındasınız bilet fiyatı üzerinden indirim uyulandı: " + yasIndirimiUygula+ "TL");
                    System.out.println("Gidiş-Dönüş indirimi uygulandı: " + gidiDonusIndirimiUygula+ "TL");
                    System.out.print("TOPLAM TUTAR: ");
                    System.out.println(toplamTutar-biletFiyatiIndirimUygula-gidiDonusIndirimiUygula+ "TL");
                } else if (yas>=65){
                    System.out.println("65 yaşı ve üstü bilet fiyatı indirimi uygulandı: "+ yas65UsuIndirimUygula +"TL");
                    System.out.println("Gidiş-Dönüş indirimi uygulandı: " + gidiDonusIndirimiUygula+ "TL");
                    System.out.print("TOPLAM TUTAR: ");
                    System.out.println(toplamTutar-yas65UsuIndirimUygula-gidiDonusIndirimiUygula+ "TL");
                }else{
                    System.out.println("Gidiş Dönüş İndirimi Uygulandı: " + gidiDonusIndirimiUygula + "TL");
                    System.out.print("TOPLAM TUTAR: ");
                    System.out.println(toplamTutar-gidiDonusIndirimiUygula+ " TL");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.Lütfen tekrar deneyiniz. ");

             }
        System.out.println("==============@by Mehmet Duran Kaya=================");
        }
    }



