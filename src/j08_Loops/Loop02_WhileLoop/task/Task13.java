package j08_Loops.Loop02_WhileLoop.task;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
       */
        Scanner scanner = new Scanner(System.in);

        boolean kosul = true;

        do {
            System.out.println("karakter giriniz: ");
            char karakter = scanner.next().charAt(0);
            if (karakter != 'x' && karakter != 'X') {
                System.out.println("javaCAN");

            } else {
                System.out.println("javaTAR");
                kosul = false;
            }
        } while (kosul);


        //.2yol
    /*    Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("karakter giriniz: ");
            char karakter = scanner.next().charAt(0);
            if (karakter != 'x' && karakter != 'X') {
                System.out.println("javaCAN");

            } else {
                System.out.println("javaTAR");
                break;
            }
        } while (kosul);

   */


    }
}
