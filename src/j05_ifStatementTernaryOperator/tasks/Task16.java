package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz: ");
        int sayi=scan.nextInt();
        if (sayi>0){
            if (sayi>=10){
                System.out.println("buyuksun!");
            }else System.out.println("normal");
        }else if (sayi<0){
            if (sayi>-10){
                System.out.println("negatif");
            }else System.out.println("cok negatifsin!");
        }else System.out.println("girilen sayı nötrdür = "+sayi);




    }
}
