package j08_Loops.Loop01_FoorLopp.Bireysel;

import java.util.Scanner;

public class S04_FizzBuzz {
    public static void main(String[] args) {
        // kullanıcıdan bir pozitif sayı alın.1 den baslayarak tüm tam sayıları yazdırın,sira
        //3 ile bölünebilen bir sayiya gelirse sayı yerine fizz
        //5 ile bölünebilen bir sayiya gelirse sayı yerine buzz yazdırın.
        // hem 3 hem 5 ile bölünense fizzbuzz yazdır.

        Scanner scn = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz: ");
        int sayi = scn.nextInt();

        for (int i=1; i<=sayi;i++){

            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz ");
            } else if (i%3==0) {
                System.out.print("fizz ");
            }else if (i%5==0){
                System.out.print("buzz ");
            }else {
                System.out.print(i +" " );
            }
        }
    }
}
