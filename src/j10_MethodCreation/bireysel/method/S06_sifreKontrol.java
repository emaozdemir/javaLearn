package j10_MethodCreation.bireysel.method;

import java.util.Scanner;

public class S06_sifreKontrol {
    public static void main(String[] args) {
        /*kullanicidan bir şifre isteyip asağıdaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksiklikleri söyleyin.
        eğer tum sartları saglarsa sifre başarıyla kaydedildi yazdırın
        -ilk harf kucuk harf olmali
        -son karakter rakam olmali
        -sifre bosluk içermemeli
        -en az 10 karakterli olmali
         */
        Scanner scan = new Scanner(System.in);
        String girilenSife = "";
        boolean sifreUygunMu = false;

        while (sifreUygunMu == false) {
            System.out.println("lütfen bir sifre olusturun..");
            girilenSife = scan.nextLine();
            sifreUygunMu = sifreKontrolEt(girilenSife);
        }
        System.out.println("sifre kaydedildi");


    }

    public static boolean sifreKontrolEt(String sifre) {
        int flag = 0; //hata buldukca bu flag degisecek.
        // en sonda flag değişmi diye kontrol edecek ve basarılı basarız diye donus yapabileceğiz.
        //ilk harf kucuk olmalı
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("ilk harf kucuk olmalı !!");
            flag++;
        }
        //son karakter rakam olmalı
        char sonKarakter = sifre.charAt(sifre.length() - 1);
        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
            System.out.println("son karakter rakam olmalı!!");
            flag++;
        }
        //sifre bosluk içermemeli
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk içermemeli!!");
            flag++;
        }
        //en az 10 karakterli olmalı
        if (sifre.length() < 10) {
            System.out.println("en az 10 karakterli olmalı!!");
            flag++;
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

}
