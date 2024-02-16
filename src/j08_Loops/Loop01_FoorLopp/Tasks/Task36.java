package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.

        Scanner sc = new Scanner(System.in);
        System.out.print(" Sayi giriniz: ");
        int sayi = sc.nextInt();

        double toplam=0;
        for (int i = 1; i <= sayi; i++) {
            toplam = 1/i;
            System.out.println(toplam+ " ");
        }

    }
}
