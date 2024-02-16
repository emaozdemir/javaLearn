package j08_Loops.Loop02_WhileLoop.task;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan =  new Scanner(System.in);

       System.out.println("**for ile**");
        System.out.println("lütfen arasında hangi sayiların oldugunu görmek istediğiniz iki tam sayi giriniz: ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
       int baslangıc= (sayi1 < sayi2 ? sayi1 : sayi2);
       int bitis=(sayi1>sayi2 ? sayi1 : sayi2);

        for (int i =baslangıc ; i < bitis; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

         System.out.println("**while ile**");
         int i =baslangıc;
         while (i<bitis){
             System.out.print(i+" ");
             i++;
         }

























     /*   System.out.println("Please enter a number");
        int first = scanner.nextInt();
        System.out.println("Please enter another number");
        int second = scanner.nextInt();

        for (int i = (first < second ? first : second) + 1; i < (first > second ? first : second); i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("**** While Loop ****");

        int i = (first < second ? first : second) + 1;
        while (i < (first > second ? first : second)) {
            System.out.print(i + " ");
            i++;
        }

*/




    }
}
