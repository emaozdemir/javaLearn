package j08_Loops.Loop01_FoorLopp.Bireysel;

import java.util.Scanner;

public class S01 {

    public static void main(String[] args) {
        //1 den 10 kadar yazdır
        for (int i =1;i<=10;i++){
            System.out.print(i+" ");
        }
          System.out.println();

        //10 den 100 kadar yazdır
        for (int i=10; i<100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        //190dan 0 a kadar yazdır
        for(int i=190;i>=0;i-=5){
            System.out.print(i+" ");
        }
        System.out.println();
        //3 basamaklı 17 ye bölünebilen
        for(int i=100; i<=999; i++){
            if (i %17==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //123 ile 789 dahil arasındaki sayiların toplamı
        int toplam=0;
        for(int i=123; i<=789; i++){
            toplam+=i;
        }
        System.out.println(toplam);
        System.out.println();
        //897 ile 1345 dahil arasındaki 7 ye bölünebilen sayiların toplamı
        toplam=0;
        for (int i=897; i<=1345;i++){
            if (i %7==0){
                //System.out.print(i+" ");
                toplam+=i;
            }
        }
        System.out.println("\n"+toplam);

        System.out.println();
        //23-45 Aradaki sayiların toplamı
        int bas =23;
        int bitis =45;
        int toplam2=0;
        for (int i=bas; i<=bitis;i++){
            toplam2+=i;
        }
        System.out.println(toplam2);




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






    }
}
