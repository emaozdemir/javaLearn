package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task11 {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisim giriniz: ");
        String isim = input.nextLine();
        String soyisim = input.nextLine();
        if (isim.length() > soyisim.length()) {
            System.out.println("isim daha uzun");
        }else if (isim.length() == soyisim.length()){
            System.out.println("isim ve soyisim uzunluk eşit");
        }
        else System.out.println("soyisim daha uzun");

        System.out.println(isim.length() > soyisim.length() ? "isim daha uzun":"soyisim daha uzun" );

    }

}