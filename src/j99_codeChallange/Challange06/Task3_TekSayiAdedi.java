package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task3_TekSayiAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();
        int count=0;
        for (int i =1; i <=sayi; i+=2) {
            System.out.print(i+" ");
            count++;
        }
        System.out.println("\n"+count + " adet tek sayı vardır.");

        //2.yol
    /*    Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı giresen : ");
        int sayi = input.nextInt();//1453
        int tekSayiAdedi = 0;
        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");//loop dan gelen tek sayı print edildi
                tekSayiAdedi++;//loop dan gelen tek sayı adedi 1 artırıldı
            }
        }
        System.out.println();
        System.out.println("tekSayisi = " + tekSayiAdedi);
    }
*/

    }

}
