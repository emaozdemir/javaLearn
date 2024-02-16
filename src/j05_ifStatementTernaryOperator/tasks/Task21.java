package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        /* Task->
        a) Son basamak 5 ‘e esit ve 5 den buyukse, yuvarlama islemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”
         */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        double sayi = sc.nextDouble();
        double sonBasamak= 0;
        if (sonBasamak >= 5){}*/

        int sayi= 1453;
         /*
        1453 -> 1450
        1456 -> 1460
         */

        if (sayi %10>=5){

            int birler = sayi % 10;

            System.out.println("sayi = "+(sayi +(10-birler)));

        }else {
            int birler = sayi%10;
            System.out.println("sayi = "+(sayi-birler));
        }




    }

}
