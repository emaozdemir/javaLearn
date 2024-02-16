package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi>=100 && sayi<1000){
            System.out.println("3 basamakli");
        }else if (sayi>=10 && sayi<100){
            System.out.println("2 basamakli");
        }else System.out.println("ikisi de degil!");


    }
}
