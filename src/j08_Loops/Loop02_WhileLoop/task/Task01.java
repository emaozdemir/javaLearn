package j08_Loops.Loop02_WhileLoop.task;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner sc = new Scanner(System.in);

        int adet=0;
        int toplam=0;

        while (toplam<=333){
            System.out.println("sayı giriniz");
            int girilenSayi=sc.nextInt();
            toplam+=girilenSayi;
            adet++;
        }
        System.out.println("sayıların toplamı: "+toplam+ "\ngirilen sayi adedi: "+adet);






    }
}
