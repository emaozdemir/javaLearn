package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task02_Ternary {
    /* Task->
     * Girilen fiyat için
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * print eden code create ediniz
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("lütfen fiyat giriniz: ");
         int fiyat = scan.nextInt();
         if (fiyat < 10) {
             System.out.println("ucuz");
         }else if (fiyat>=10 && fiyat<20) {
             System.out.println("normal");
         }else System.out.println(fiyat+ " pahalı");

        System.out.println("ternary ile");
        System.out.println(fiyat<10 ? "ucuz": (fiyat<20 ? "normal": fiyat +" pahalı"));




    }
}
