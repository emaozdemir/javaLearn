package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("tamsayi giriniz:  ");
        int girilenSayi = scan.nextInt();
        fiboHseapla(girilenSayi);

    }

    private static void fiboHseapla(int sayi) {
        int fib1=0;
        int fib2=1;

        if (sayi<=0){
            System.out.println("negatif sayinin fibbonaci dizi hesaplamaz.");
        } else if (sayi==1) {
            System.out.println("0");
        } else if (sayi==2) {
            System.out.print("0");
            System.out.print("1");
        }else {
            System.out.print("0 ");
            System.out.print("1 ");
            /*
             for (int i = 2; i < sayi; i++) {
        System.out.print((i-2)+(i-1)+" ");
        }
             */
            for (int i = 2; i <sayi ; i++) {
                int yeniFib=fib1+fib2;
                System.out.print(yeniFib+" ");
                fib1=fib2;//fib1, fib2'ye ve fib2, yeniFib'e atanıyor
                fib2=yeniFib;
            }
            System.out.println();

        }

    }


}
