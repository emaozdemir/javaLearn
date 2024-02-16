package j08_Loops.Loop03_DoWhileLoop.task;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        do {
            System.out.println("Sayı giriniz: ");
            sayi = input.nextInt();
            toplam += sayi;

        } while (sayi != 0);
        System.out.print(sayi + " " + "\ngirilen sayilarin toplami --> " + toplam);


    }
}
