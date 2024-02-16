package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz: ");
        int sayi = sc.nextInt();
        boolean asalMi = true; //bayrak yukarı
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) { //tekrardan gelen herhangi bir sayiya bölünme sartı kontrol edildi
                asalMi = false; //bayrak asağı
                break; //döngü kırıldı.
            }
        }
        System.out.println(asalMi ? sayi + " sayisi asal sayidir" : sayi + " sayisi asal değildir.");

        //2.yol
        for (int i = 2; i <= sayi; i++) {
            if (i == sayi) {
                System.out.println("girilen sayı asal");
            } else if (sayi % i == 0) {
                System.out.println("girilen sayı asal değil");
                break;
            }
        }


    }
}
