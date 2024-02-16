package j08_Loops.Loop02_WhileLoop.task;

import java.util.Scanner;

public class Task14 {

    //Task-> Girilen iki sayının EBOB ve EKOK değerlerini "While Döngüsü" prnt eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1.sayiyi giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi giriniz: ");
        int sayi2 = input.nextInt();

        int sayac = 1;
        int ebob = 0;
        int ekok = 0;

        while (sayac <= sayi1) {
            if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {

                ebob = sayac;
            }


            sayac++;
        }


    }
}
