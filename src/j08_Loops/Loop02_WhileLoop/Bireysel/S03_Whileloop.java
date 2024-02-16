package j08_Loops.Loop02_WhileLoop.Bireysel;

import java.util.Scanner;

public class S03_Whileloop {
    public static void main(String[] args) {
        /*tekrar sayisi belli olmayan ve bitme sarti asıl değişkene bağlı değilse while tercih edilir.

         */

        //kullanicidan toplanmak üzere sayilar alin girilen sayilarin toplami 500 oldugunda
        //kac sayi girildiğini ve toplamin kaç oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);

        int girilenSayi=0;
        int sayilarinToplami=0;
        int girilenSayiAdedi=0;
        while (sayilarinToplami<500){
            System.out.println("toplanmasını istediğiniz sayilari giriniz");
            girilenSayi=scan.nextInt();
            sayilarinToplami+=girilenSayi;
            girilenSayiAdedi++;

        }
        System.out.println("sayilarin toplamı: "+sayilarinToplami+"\n "+ "girilen sayilarin adedi: "+girilenSayiAdedi);


    }
}
