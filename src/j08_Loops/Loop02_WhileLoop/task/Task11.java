package j08_Loops.Loop02_WhileLoop.task;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner sc=new Scanner(System.in);

        int sayilarinToplami=0;
        int girilenSayiAdedi=0;


        while (true) {
            System.out.println("bir sayi gir");
            int girilenSayi=sc.nextInt();
            if(girilenSayi==0){
                break;
            }
            sayilarinToplami+=girilenSayi;
            girilenSayiAdedi++;

        }
        System.out.println("girilenSayiAdedi = " + girilenSayiAdedi+"\n12girilenSayiToplami = " + sayilarinToplami);
        System.out.println("\n2.yol");


        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi=input.nextInt();
        int count=1;
        int toplam=0;
        while(sayi!= 0) {
            toplam+=sayi;
            count++;
            //System.out.println("Bir sayı daha giriniz");
            sayi=input.nextInt();


        }
        System.out.println("Girdiğiniz sayıların toplamı: " + toplam);
        System.out.println("Girdiğiniz sayıların adedi: " +count);


    }
}
