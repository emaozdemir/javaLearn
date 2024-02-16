package j08_Loops.Loop02_WhileLoop.Bireysel;

import java.util.Scanner;

public class S04_Sayiisteme {
    public static void main(String[] args) {
        /*kullanicidan pozitif sayi isteyin.
        girilen sayinin pozitif tam bölenlerisayisi 5 ten büyükse güzel sayi yazdirin ve isşlemi bitirin.
        5 ten buyuk değilse kotu sayi yazdırın ve tekrar sayi girmesini isteyin

         */
        Scanner input = new Scanner(System.in);
        int girilenSayi = 0;
        boolean devamMİ = true;
        int ptbs = 0;

        while (devamMİ == true) {
            System.out.println("lütfen pozitif sayi giriniz..");
            girilenSayi = input.nextInt();

            ptbs = pozitifTamBolenSayisiBul(girilenSayi);
            if (ptbs > 5) {
                System.out.println("güzel sayi");
                devamMİ = false;
            } else System.out.println("kotu sayı");


        }
    }

    public static int pozitifTamBolenSayisiBul(int sayi) {
        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }

        }
        return sayac;
    }
}
