package Mehmet;

import java.util.ArrayList;
import java.util.Arrays;

import static Mehmet.Islemler.islemler;
import static Mehmet.KartNumarasiVeSifre.kartNumarasiVeSifreGir;

public class Runner {

    static ArrayList<MusteriBilgileri> musteriler = new ArrayList<>();

    public static void main(String[] args) {

        MusteriBilgileri musteri1 = new MusteriBilgileri("Mehmet Yildirim ", "1025468954203687", "1234");
        MusteriBilgileri musteri2 = new MusteriBilgileri("Mustafa Dag", "9512346852100567", "1981");
        MusteriBilgileri musteri3 = new MusteriBilgileri("Kamil Hirkali", "4562803191000782", "8026");
        MusteriBilgileri musteri4 = new MusteriBilgileri("Nuran Albayrak", "2001564228339471", "3346");
        MusteriBilgileri musteri5 = new MusteriBilgileri("Nurefsan Aydemir", "6456823100458990", "5910");


        musteriler.add(musteri1);
        musteriler.add(musteri2);
        musteriler.add(musteri3);
        musteriler.add(musteri4);
        musteriler.add(musteri5);

        kartNumarasiVeSifreGir();

        islemler();



    }

}
