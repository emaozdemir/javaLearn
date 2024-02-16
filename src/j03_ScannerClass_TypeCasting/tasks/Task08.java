package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("1.vize notunuzu giriniz: ");
        int vize1 = sc.nextInt();

        System.out.println("2.vize notunuzu giriniz: ");
        int vize2 = sc.nextInt();

        System.out.println("final notunuzu giriniz: ");
        int finalNot = sc.nextInt();

        double gecmeNot = ((vize1 + vize2)/2)*0.3 + finalNot*0.7;

        System.out.println("gecmeNot = " + gecmeNot);


    }
}
