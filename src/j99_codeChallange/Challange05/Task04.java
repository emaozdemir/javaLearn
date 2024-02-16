package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task04 {
   /* task-> girilen sayıdan 1'e kadar olan tamsıyalrın karelerinin toplamını print eden code create ediniz..
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam hele bir sayı giresen : ");
        int sayi = input.nextInt();
        int kareToplam = 0;
        for (int i = sayi; i >= 1; i--) {//girilen sayıdan 1'e kadar tekrar tanımlandı
            kareToplam += i * i;//tekrardaki her bir sayının karesi toplama eklendi

        }
        System.out.println("Agam giridiğin sayıların kareleri toplamı : " + kareToplam);


        System.out.println("deneme");
        int sayi1 = 4;
        int toplam = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println(i + " ");
            toplam += i * i;
        }
        System.out.println("Kareler toplamı=" + toplam);


    }// main sonu
}// class sonu

