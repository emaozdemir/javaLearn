package j08_Loops.Loop02_WhileLoop.task;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz
        Scanner scan = new Scanner(System.in);

        int girilenSayi;
        int sayilarinToplami=0;
        int girilenSayiAdedi=0;
        System.out.println("İstediğiniz kadar sayının toplamını bulmak için sayıları girin. (Çıkmak için 0'a basın)");

        while (true) {
            System.out.println("Bir sayı girin:");
            girilenSayi = scan.nextInt();

            if (girilenSayi == 0) {
                break; // 0 girildiğinde döngüyü sonlandır
            }

            sayilarinToplami += girilenSayi;
            girilenSayiAdedi++;
        }

        System.out.println("sayilarin toplamı: "+sayilarinToplami+"\n "+ "girilen sayilarin adedi: "+girilenSayiAdedi);


     }

}
