package j08_Loops.Loop02_WhileLoop.Bireysel;

import j10_MethodCreation.bireysel.method.S03_AsalSayiSonucuDondurme;

import java.util.Scanner;

public class S05_WhileloopAsal {
    public static void main(String[] args) {
        /*kullanicidan asal sayi girmesini isteyin.kullanicinin giridği sayiyi kontrol et.
        doğruysa giriş basarili değilse tekrar deneyiniz deyin.
         */
        //kaç kere gireceğini bilmiyoruz o yüzden while.
        Scanner scan = new Scanner(System.in);
        int girilenSayi = 0;
        boolean asalMi = false;

        while (asalMi == false) {
            System.out.println("lütfen bir asal sayi giriniz..");
            girilenSayi = scan.nextInt();
            asalMi = S03_AsalSayiSonucuDondurme.isAsal(girilenSayi);
        }
        System.out.println("giriş basarili");


    }
}
