package Nuran;

import java.util.Scanner;

public class Deneme {


        public static int populationOfCountry(String[] countryNames, int[] countryPopulations, String str) {
            int population=0;
            for (int i = 0; i < countryNames.length ; i++) {
                if (str.equalsIgnoreCase(countryNames[i])){
                    population=countryPopulations[i];
                    break;
                }else {
                    population=-1;
                }

            }
            return population;

        }public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("**lutfen ulke ismini giriniz**");
            String str=input.nextLine();

            String[] countryNames={"Usa","United States","Mexico","Canada","France","Germany"};

            int countryPopulation []={40000,150000,123000,45600,478300,123000};

            int sonuc=populationOfCountry(countryNames,countryPopulation,str);
            System.out.println(sonuc);

        }
    }

