package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir ");
        int sayi= scan.nextInt();
         //1.yol
        char ch = 'A';

        for (int i = 1; i <=sayi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++; // Move to the next character for the next row
        }



        //2.yol
        int harf =65;

        for (int i = 0; i <6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(harf+i )+ " ");
            }
            System.out.println("");

        }

        //3.yol
        // int harf = 65;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A'+i) + " ");

            }
            System.out.println("");
        }





    }
}
