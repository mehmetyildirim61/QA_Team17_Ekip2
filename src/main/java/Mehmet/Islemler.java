package Mehmet;

import java.util.Scanner;

import static Mehmet.Runner.musteriler;

public class Islemler {
    static Scanner input = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);
    static Scanner scan3 = new Scanner(System.in);

    static void islemler() {
        System.out.println("1- Bakiye sorgulama\n2- Para yatirma\n3- Para çekme\n4- Para gönderme\n5- Sifre değiştirme\n6- Cikis");
    }

    static void bakiyeSorgula(int musNo) {
        System.out.println("Guncel Bakiyeniz: " + musteriler.get(musNo - 1).getBakiye() + " TL\nAna menuye donmek icin herhangi bir tusa basin");
        scan.next();
        islemler();
    }

    static void paraYatir(int musNo) {
        double guncelBakiye = musteriler.get(musNo - 1).getBakiye();
        System.out.println("Guncel Bakiyeniz: " + guncelBakiye + " TL");

        while (true) {
            System.out.println("Lutfen yatiracaginiz miktari giriniz ve parayi acilan bolmeye koyunuz...");

            double hesabaYatirilanMiktar = input.nextDouble();
            System.out.println("Paraniz tanimlaniyor...\nYatirilan miktar: " + hesabaYatirilanMiktar);

            musteriler.get(musNo - 1).setBakiye(guncelBakiye + hesabaYatirilanMiktar);

            guncelBakiye = musteriler.get(musNo - 1).getBakiye();

            System.out.println("Guncel Bakiyeniz: " + guncelBakiye + " TL");
            System.out.println("Ekstra para yatirmak icin 1'e, ana menuye donmek icin herhangi bir tusa basiniz");
            char cevap = scan.next().charAt(0);
            if (cevap != '1') {
                break;
            }
        }
        islemler();
    }

    static void paraCek(int musNo) {
        double guncelBakiye = musteriler.get(musNo - 1).getBakiye();
        System.out.println("Guncel Bakiyeniz: " + guncelBakiye + " TL");

        while (true) {
            System.out.println("Cekmek istediginiz miktari giriniz...");

            double cekilenMiktar = input.nextDouble();
            if (cekilenMiktar > guncelBakiye) {
                System.out.println("Bakiye yetersiz, lutfen hesabinizi kontrol edin");
                break;
            }
            System.out.println("Paraniz hazirlaniyor...\nLutfen paranizi aliniz.\nCekilen miktar: " + cekilenMiktar+" TL");

            musteriler.get(musNo - 1).setBakiye(guncelBakiye - cekilenMiktar);
            guncelBakiye = musteriler.get(musNo - 1).getBakiye();
            System.out.println("Guncel Bakiyeniz: " + guncelBakiye + " TL");
            System.out.println("Ekstra para cekmek icin 1'e, ana menuye donmek icin herhangi bir tusa basiniz");
            char cevap = scan.next().charAt(0);
            if (cevap != '1') {
                break;
            }
        }
        islemler();
    }

    static void paraGonder(int musNo) {
        double guncelBakiye = musteriler.get(musNo - 1).getBakiye();
        System.out.println("Guncel Bakiyeniz: " + guncelBakiye + " TL");

        System.out.println("Lutfen para gondereceginiz IBAN numarasini giriniz");
        String IBAN = scan3.nextLine();
        IBAN=IBAN.trim().replaceAll(" ", "");

        while (true) {
            if (IBAN.substring(0, 2).equalsIgnoreCase("TR") && IBAN.length() == 26) {
                System.out.println("Lutfen gondereceginiz miktari yaziniz");
                double gonderilecekTutar = input.nextDouble();
                if (guncelBakiye < gonderilecekTutar) {
                    System.out.println("Bakiye yetersiz, lutfen hesabinizi kontrol edin");
                    islemler();
                    break;
                } else {
                    System.out.println("Gonderilecek Tutar: " + gonderilecekTutar + " TL\nPara Gonderme Islemi Basariyla Gerceklesti");
                    musteriler.get(musNo - 1).setBakiye(guncelBakiye - gonderilecekTutar);
                    guncelBakiye = musteriler.get(musNo - 1).getBakiye();
                    System.out.println("Guncel Bakiyeniz: " + guncelBakiye + " TL");
                    System.out.println("Ana menuye donmek icin herhangi bir tusa basin");
                    scan.next();
                    islemler();
                    break;
                }
            } else {
                System.out.println("Lutfen girdiginiz IBAN numarasini kontrol ediniz.\nIBAN numarasi TR ile baslamali ve toplam 26 karakterden olusmalidir");
                paraGonder(musNo);
            }
        }

    }
    static void sifreDegistir(int musNo) {
        while (true) {

        System.out.println("Lutfen mevcut sifrenizi giriniz.");
        String sifre = scan2.next();

            if (sifre.equals(musteriler.get(musNo - 1).getSifre())) {
                System.out.println("Lutfen yeni sifrenizi giriniz");
                String yeniSifre = scan2.next();

                if (yeniSifre.replaceAll("[0-9]", "").length() == 0 && yeniSifre.length() == 4) {

                    musteriler.get(musNo - 1).setSifre(yeniSifre);
                    System.out.println("Yeni sifreniz " + yeniSifre + " olarak tanimlanmistir\nAna menuye donmek icin herhangi bir tusa basin");
                    scan.next();
                    break;
                } else {
                    System.out.println("Gecersiz sifre girisi. Sifreniz 4 basamakli olmali ve rakamlardan olusmalidir");
                }
            }
        }
        islemler();

    }
}


