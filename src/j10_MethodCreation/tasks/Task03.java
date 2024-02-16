package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
        Scanner scan= new Scanner(System.in);
        System.out.println("cevrilecek birimi giriniz : -> saat/mil/kg");
        String birim= scan.next().toLowerCase();
        System.out.println("cevrilecek birimin miktarini giriniz: ");
        double miktar= scan.nextDouble();
        donustur(birim,miktar);


    }//main sonu

    private static void donustur(String birim, double miktar) {
        switch (birim) {
            case "saat":
                System.out.println("girdiğin " + miktar+ " saatin saniye değeri= "+ (miktar*3600) );
                break;
            case "mil":
                System.out.println("girdiğin " + miktar+ "milin km değeri= "+ (miktar*1.6) );
                break;
            case "kg":
                System.out.println("girdiğin " + miktar+ "kgin  gr değeri= "+ (miktar*1000) );
                break;
                default:
                    System.out.println("hatali birim girdiniz..");
        }
    }


}// Class sonu
