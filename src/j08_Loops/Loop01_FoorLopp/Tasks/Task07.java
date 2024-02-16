package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */
    /*    Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }

     */

        Scanner scn=new Scanner(System.in);
        System.out.println("Bir boyut giriniz");
        int boyut= scn.nextInt();
        for (int kat = 1; kat <=boyut ; kat++) {
            for (int daire = 1; daire <=boyut ; daire++) {
//                if (kat==daire){
//                    System.out.print("1 ");
//                }else System.out.print("0 ");
                System.out.print(kat==daire?"1 ":"0 ");
            }
            System.out.println();
        }
    }
}
