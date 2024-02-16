package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        Scanner sc = new Scanner(System.in);
        System.out.print(" Sayi giriniz: ");
        int sayi = sc.nextInt();

        int faktoriyel = 1;

        if (sayi >= 1) {
            for (int i = sayi; i >= 1; i--) {

                faktoriyel *= i;
            }
            System.out.println("faktoriyel = " + faktoriyel);
        }else {
            System.out.println("Lutfen 0`dan buyuk bir sayi giriniz!!!");
        }

    }
}
