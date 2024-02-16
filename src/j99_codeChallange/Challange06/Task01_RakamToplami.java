package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task01_RakamToplami {
    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz: ");
        int girilenSayi = scan.nextInt();
        int birlerbas=0;
        int rakamlarToplamı=0;

        int basamakSayısı=(girilenSayi+"").length();

        for (int i =1;i<=basamakSayısı;i++){
            birlerbas=girilenSayi%10;
            rakamlarToplamı+=birlerbas;
            girilenSayi/=10;
        }
        System.out.println("Rakamlar Toplamı = " + rakamlarToplamı);

    }// main sonu
}// Class sonu

