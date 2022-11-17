package Mehmet;

import java.util.Scanner;

import static Mehmet.Runner.musteriler;

public class KartNumarasiVeSifre {

    static void kartNumarasiVeSifreGir(){

        System.out.println("Lutfen musteri numaranizi giriniz");
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int musNo=scan.nextInt();

        System.out.println("Lutfen 16 haneli kart numaranizi giriniz");
        String kartNo=input.nextLine().trim().replaceAll(" ","");

        for(int i=1; i<=5; i++){
            if(musNo==i){
                if(kartNo.equals(musteriler.get(i-1).getKartNo())){
                    System.out.println("Lutfen 4 basamakli sifrenizi giriniz");
                    String sifre=input.next();
                    if(sifre.equals(musteriler.get(i-1).getSifre())){
                        System.out.println("sifre girisi basarili, isleminiz devam ediyor...");
                        System.out.println("Sayin "+musteriler.get(i-1).getAdSoyad()+", bankamiza hosgeldiniz.\nLutfen yapmak istediginiz islemi seciniz");
                        break;
                    }else{
                        System.out.println("yanlis sifre, lutfen tekrar deneyiniz");
                        kartNumarasiVeSifreGir();
                    }
                }else{
                    System.out.println("yanlis kart numarasi, lutfen tekrar deneyiniz");
                    kartNumarasiVeSifreGir();
                }
            }
        }





    }
}
