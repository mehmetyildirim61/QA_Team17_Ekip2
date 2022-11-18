package Mehmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Mehmet.Islemler.*;
import static Mehmet.KartNumarasiVeSifre.kartNumarasiVeSifreGir;

public class Runner {

    static ArrayList<MusteriBilgileri> musteriler = new ArrayList<>();

    public static void main(String[] args) {

        MusteriBilgileri musteri1 = new MusteriBilgileri("Mehmet Yildirim ", "1025468954203687", "1234", 0);
        MusteriBilgileri musteri2 = new MusteriBilgileri("Mustafa Dag", "9512346852100567", "1981", 0);
        MusteriBilgileri musteri3 = new MusteriBilgileri("Kamil Hirkali", "4562803191000782", "8026", 0);
        MusteriBilgileri musteri4 = new MusteriBilgileri("Nuran Albayrak", "2001564228339471", "3346", 0);
        MusteriBilgileri musteri5 = new MusteriBilgileri("Nurefsan Aydemir", "6456823100458990", "5910", 0);


        musteriler.add(musteri1);
        musteriler.add(musteri2);
        musteriler.add(musteri3);
        musteriler.add(musteri4);
        musteriler.add(musteri5);


        int musNo = kartNumarasiVeSifreGir();
        System.out.println("musNo = " + musNo);

        islemler();

        boolean islemDevamMi = true;
        while(islemDevamMi==true) {
            Scanner input = new Scanner(System.in);
            char islemTercih = input.next().charAt(0);

            switch (islemTercih) {
                case '1':
                    bakiyeSorgula(musNo);
                    break;
                case '2':
                    paraYatir(musNo);
                    break;
                case '3':
                    paraCek(musNo);
                    break;
                case '4':
                    paraGonder(musNo);
                    break;
                case '5':
                    sifreDegistir(musNo);
                    break;
                case '6':
                     islemDevamMi=false;
            }
        }
        System.out.println("Bankamizi kullandiginiz icin tesekkur ederiz.\n!!!Kartinizi almayi unutmayiniz!!!");
    }
    }


