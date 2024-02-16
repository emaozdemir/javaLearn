package j10_MethodCreation.bireysel.method;

import java.util.Scanner;

public class S04_Soru {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir sayi isteyin girilen sayı asalsa 3 katını yazdır.
        //girilen sayi asal değilse 2 katını yazdır .

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scanner.nextInt();

        if (S03_AsalSayiSonucuDondurme.isAsal(sayi)) {
            System.out.println(sayi*3);
        }else System.out.println(sayi*2);








    }
}
