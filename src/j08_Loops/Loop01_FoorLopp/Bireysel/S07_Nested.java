package j08_Loops.Loop01_FoorLopp.Bireysel;

import java.util.Scanner;

public class S07_Nested {
    public static void main(String[] args) {
        /* kullanıcıdan sayı al ve aşağıdaki şekli oluştur.

        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16
         for loopla
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("lütfen sayı giriniz: ");
        int sayi=sc.nextInt();

        for (int i=1; i<=sayi; i++){
            for (int j=1; j<=sayi; j++){
                System.out.print(i*j+ "  ");
            }
            System.out.println();
        }

        for (int i=0; i<100; i++){ // for un içinde de tanımlayabiliriz.
            if (i>=10 && i%2 !=0 ){
                System.out.print(i+" ");
            }
        }
    }
}
