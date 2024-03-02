package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

        //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int girilenSayi = input.nextInt();
        System.out.println("faktoriyelHesap(girilenSayi) = " + faktoriyelHesap(girilenSayi));

    }

    private static int faktoriyelHesap(int sayi) {
        int carpim = 1;
        for (int i = 1; i <= sayi; i++) {
            carpim *= i;
        }
        return carpim;
    }


}
