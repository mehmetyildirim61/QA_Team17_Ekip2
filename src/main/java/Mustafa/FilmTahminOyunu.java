package Mustafa;

import java.util.*;

public class FilmTahminOyunu {

    public static void main(String[] args) {

        List<String> film = new ArrayList<>(Arrays.asList("KELEBEK", "MUCIZE", "AYLA", "DUNKIRK", "MEMENTO", "GORA", "ESKIYA",
                "FIGHTCLUB", "KARAKOMIK", "KILLBILL", "AMELIE", "XMEN", "OLDBOY",
                "BATMAN", "KELOGLAN", "TOYSTORY", "MUTLULUK", "SEVEN"));


        Scanner input = new Scanner(System.in);
        System.out.println("film secmek icin 0'dan 17'ye kadar bir sayi girin");
        int secim = input.nextInt();

        filmSec(film.get(secim));

    }

    public static void filmSec(String str){

        String d = str;//kullanicinin girdigi index'e karsilik gelen film

        List<String> tahminList = new ArrayList<>(str.length());//filmin kac harfli oldugunu gosteren bos list
        for (int i = 0; i < str.length(); i++) {
            tahminList.add("-");
        }
        System.out.println(d.length()+    " harfli bir film  = " + tahminList);//tahminList = [-, -, -, -]

        System.out.println("Tahmin hakkiniz : " + (str.length() * 2) + "\n");//tahmin hakki filmin harf sayisinin iki kati kadar.

        String sp[] = d.split("");
        List<String> j = Arrays.asList(sp);


        int dogruTahmin=0;
        int yanlisTahmin=0;


        int tahminHakki = str.length() * 2;
        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("HARF LUTFEN!!");
            String c = input.next().substring(0, 1).toUpperCase();

            if(str.contains(c)){
                dogruTahmin++;
                while(str.contains(c)){

                    tahminList.set(str.indexOf(c), c);
                    str= str.replaceFirst(c, " ");
                }

                System.out.println(tahminList);
                System.out.println("Dogru Tahmin = " + dogruTahmin);
                System.out.println("Yanlis Tahmin = " + yanlisTahmin+ "\n");

            }else{
                yanlisTahmin++;
                System.out.println("Dogru Tahmin = " + dogruTahmin);
                System.out.println("Yanlis Tahmin = " + yanlisTahmin+ "\n");
            }

            if(j.equals(tahminList)){
                System.out.println("TEBRIKLER!");
                break;
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("Filmi tahmin et");
            String ft = scan.nextLine();


            if (ft.equalsIgnoreCase(d)) {
                System.out.println("TEBRIKLER!!");
                break;
            }


            tahminHakki--;
            System.out.println("kalan tahmin hakkiniz : " + tahminHakki);

            if(tahminHakki==0){
                System.out.println("KAYBETTINIZ");
                System.out.println("FILM : " + d);
                break;

            }







        }

    }



}




