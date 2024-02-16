package j08_Loops.Loop03_DoWhileLoop.task;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("lütden iki tane karakter girin: ");
        char karakter1 = input.next().charAt(0);
        char karakter2 = input.next().charAt(0);
        char enBuyuk= (karakter1>karakter2)? karakter1:karakter2;

       do {
           System.out.print(karakter1+ " ");
           karakter1++;

       }while (karakter1<=enBuyuk);


    }
}
