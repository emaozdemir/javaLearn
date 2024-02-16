package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /* Task->
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("3 basamaklı 1 sayi giriniz: ");
        int sayi = sc.nextInt();
        int birlerBas= sayi %10;
        int yuzlerBas= sayi %100;

        System.out.println("toplam = " + (birlerBas + yuzlerBas));
        System.out.println("toplam = " + (sayi%10 + sayi%100)); // eğer baska yerde kullanmayacaksak direk bu sekilde yaparız.







    }

}
