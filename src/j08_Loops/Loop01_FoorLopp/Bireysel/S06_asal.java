package j08_Loops.Loop01_FoorLopp.Bireysel;

import java.util.Scanner;

public class S06_asal {
    public static void main(String[] args) {
        // kullanıcıdan sayı al asal olup olmadıgını kontrol et sonucu yaazdır.(1 ve kendisine bölünür)
        Scanner sc= new Scanner(System.in);
        System.out.println("lütfen sayı giriniz: ");
        int sayi=sc.nextInt();

        for (int i=2; i<=sayi; i++){
            if (i==sayi){
                System.out.println("asal");

            }else if (sayi%i==0){
                System.out.println("asal değil");
                break;
            }
        }
        /*
        */
        System.out.println(((10>7) ? (10<10 ? 14:30):""));


    }
}
