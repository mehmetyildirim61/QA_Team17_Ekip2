package Mehmet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) throws IOException {

        BufferedReader t = new BufferedReader(new FileReader("src/main/java/Mustafa/FilmTahmin_Task"));


        while (t.readLine() != null) {
            System.out.println(t.readLine());
        }




//        List<String> film = new ArrayList<>(Arrays.asList("KELEBEK", "MUCIZE", "AYLA", "DUNKIRK", "MEMENTO", "GORA", "ESKIYA",
//                "FIGHTCLUB", "KARAKOMIK", "KILLBILL", "AMELIE", "XMEN", "OLDBOY",
//                "BATMAN", "KELOGLAN", "TOYSTORY", "MUTLULUK", "SEVEN"));
//
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("film secmek icin 0'dan 17'ye kadar bir sayi girin");
//        int secim = input.nextInt();
//
//                String sectiginfilm = film.get(secim);
//        String d = film.get(secim);
//
//        List<String> tahminList = new ArrayList<>(sectiginfilm.length());
//
//        for (int i = 0; i < sectiginfilm.length(); i++) {
//            tahminList.add("-");
//        }
//        System.out.println("tahminList = " + tahminList);
//
//        System.out.println("sectiginiz film icin tahmin hakkiniz : " + sectiginfilm.length() * 2);
//
//        int tahmin=1;
//        int tahminHakki = sectiginfilm.length() * 2;
//        while (tahmin <= sectiginfilm.length() * 2) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("film tahmininiz");
//            String ft = scan.nextLine();
//            if (ft.equalsIgnoreCase(sectiginfilm)) {
//                System.out.println("TEBRIKLER!!");
//                break;
//            }
//            tahminHakki--;
//
//            System.out.println("kalan tahmin hakkiniz : " + tahminHakki);
//
//            System.out.println("bir harf giriniz");
//            String c = input.next().substring(0, 1).toUpperCase();
//
//
//            if (d.contains(c)) {
//                tahminList.set(d.indexOf(c), c);
//                System.out.println(tahminList);
//                d= d.replaceFirst(c, " ");
//
//            }
//
//            if(tahminHakki==0){
//                break;
//
//            }
//
//
//        }
//        System.out.println("KAYBETTINIZ");






    }
}
