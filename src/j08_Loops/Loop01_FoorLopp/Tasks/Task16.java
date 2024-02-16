package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir ");
        int sayi= scan.nextInt();
        int asal=0;
        for (int i = 1; i <=sayi; i++) {
            if (sayi==2 || sayi%i==1){
                System.out.println("asal");
                break;
            }
            System.out.println();
            asal++;
        }



    }
}
