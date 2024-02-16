package j07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        /*
    String içersinde istenen stringinin varlığını kontrol eder boolean değer return eder..
    char parametre -> CTE
     */
        String str1 = "Basari gayrete asiktir :)";
        System.out.println("str1 = " + str1);
        System.out.println("str1.contains(\"Basari\") = " + str1.contains("Basari"));//true
        //str1.contains('a'); //CTE hatasi verir -> char
        System.out.println("str1.contains(\"a\") = " + str1.contains("a"));//
        System.out.println("str1.contains(\"dogukan\") = " + str1.contains("dogukan"));//

        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz...
        Scanner sc = new Scanner(System.in);
        System.out.println("bir metin giriniz :");
        String metin = sc.nextLine();
        System.out.println("metindeki hangi kelimeyi sorgulatmak istersiniz? ");
        String kelime = sc.nextLine();
        System.out.println("metin.contains(kelime) = " + metin.contains(kelime));
        System.out.println("kelime.contains(metin) = " + kelime.contains(metin));
        System.out.println(metin.contains(kelime) ? "girilen " + metin + " de aranan " + kelime + " mevcuttur" : "girilen " + metin + " de aranan " + kelime + " mevcut DEGILDIR");




    }

}
