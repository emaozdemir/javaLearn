package j08_Loops.Loop03_DoWhileLoop.task;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        //task-> Girilen ismin ilk harfinin buyuk olmasını kontrol eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isim giriniz: ");
        String isim= scan.next();
        char first=isim.charAt(0);

        do {
            if (first >= 'A' && first <= 'Z'){
                System.out.println("girilen isim buyuk harf ile baslıyor..");

            }else System.out.println("Girilen isim buyuk harf ile baslamıyor..");
            break;

        }while (!(first >= 'A' && first <= 'Z')); //false de yazabilirz.




    }
}
