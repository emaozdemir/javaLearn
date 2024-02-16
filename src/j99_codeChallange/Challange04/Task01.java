package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismi ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        // isim soyismi tek seferde alma:
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isim ve soyisinizi giriniz.");
        String text = scan.nextLine();
        if (text.indexOf(" ") == text.lastIndexOf(" ")){

            System.out.println("text.substring(0).toUpperCase() = " + text.substring(0).toUpperCase());

        }else System.out.println();

        // isim soyismi ayrı ayrı alma:
        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş adını girive bakennn : ");
        String name = input.next();
        System.out.println("Agıdeşşş soyadını girive bakennn : ");
        String surname = input.next();

        System.out.println(name.toUpperCase() + " " + surname.toUpperCase());


    }
}


