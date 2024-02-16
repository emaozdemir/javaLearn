package j08_Loops.Loop01_FoorLopp.Bireysel;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {

        //1 den girilen sayiya kadar girilen dahil 7 ile bölünen sayıları yazdırın;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz: ");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //kullanıcıdan bas ve bitiş alın . aralarındaki sayıların toplamını  yazdırın eğer bitiş başlangıctan kücükse uyarı yazdırın.
        System.out.println("Lütfen baslangıc ve bitiş giriniz:");
        int bas = scan.nextInt();
        int bitis = scan.nextInt();

        if (bitis > bas) {
            int toplam = 0;
            for (int i = bas; i <= bitis; i++) {
                toplam += i;

            }
            System.out.println("toplam=" + toplam);

        } else System.out.println("Bitiş sayısı  baslangıçtan küçük ve esit olamaz.");


        System.out.println();
        // kullanıcıdan baslangıc ve bitiş değeri olarak pozitif sayılar alın.
        //sınırlar dahil olarak aralarındaki tüm sayıların toplamını yazdırın.
        //bitiş değeri baslangıc değerinden küçük olsada programı calıstırın.
        System.out.println("Lütfen baslangıc ve bitiş giriniz:");
        int baslangıc = scan.nextInt();
        int bitim = scan.nextInt();

        int toplam = 0;
        if (baslangıc < bitim) {

            for (int i = baslangıc; i <= bitim; i++) {
                toplam += i;

            }

        } else {//bitim<=baslangıc
            for (int i = bitim; i <= baslangıc; i++) {
                toplam += i;
            }

        }
        System.out.println("toplam=" + toplam);


        System.out.println();

        //1 kullanıcıdan 20 den kucuk bir sayi alıp bu sayının faktoriyel değerini hesaplayın.örnek 6!=6*5*4*3*2*1=720
        Scanner scn = new Scanner(System.in);
        System.out.println("lütfen 20 den kucuk bir sayı giriniz: ");
        int num = scn.nextInt();
        int carpim = 1;
        if (num > 1 && num <= 20) {
            for (int i = num; i >= 1; i--) {
                carpim *= i;
            }
        } else {
            System.out.println("lütfen 20 den kucuk bir sayı giriniz: ");
        }
        System.out.println(num + "! = "+carpim);

        System.out.println();



    }
}
