package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task08 {


   /*
   Task-> Girilen iki tamsayı arasındaki sayıların toplamını print eden code create ediniz.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen sayi girin: ");
        int sayi1 = input.nextInt();
        System.out.println("lütfen sayi girin: ");
        int sayi2 = input.nextInt();

     int toplam=0;

     for (int i = (sayi1<sayi2? sayi1: sayi2);i<=(sayi1<sayi2?sayi2:sayi1);i++)   {

            System.out.print(i + " ");
            toplam+=i;
        }
     System.out.println("toplamları= "+ toplam );

    }


}
