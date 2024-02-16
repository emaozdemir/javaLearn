package j10_MethodCreation.tasks;


import java.util.Scanner;



public class Task03ungelismishali {
  static Scanner scan= new Scanner(System.in);//herkes ulassın diye method ustu class levela tanımlandı
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.

        donustur(birimVer(),miktarVer());


    }//main sonu

    private static void donustur(String birim, double miktar) {
        switch (birim) {
            case "saat":
             saatSaniye(miktar);
                break;
            case "mil":
                milKm(miktar);
                break;
            case "kg":
              kgGr (miktar);
                break;
                default:
                    System.out.println("hatali birim girdiniz..");
        }
    }

    private static void kgGr(double miktar) {
        System.out.println("girdiğin " + miktar+ "kgin  gr değeri= "+ (miktar*1000) );
    }

    private static void milKm(double miktar) {
        System.out.println("girdiğin " + miktar+ "milin km değeri= "+ (miktar*1.6) );
    }

    private static void saatSaniye(double miktar) {
        System.out.println("girdiğin " + miktar+ " saatin saniye değeri= "+ (miktar*3600) );
    }

    public static String birimVer(){
        System.out.println("cevrilecek birimi giriniz : -> saat/mil/kg");
        String birim= scan.next().toLowerCase();
        return birim;

    }
    public static double miktarVer(){
        System.out.println("cevrilecek birimin miktarini giriniz: ");
        double miktar= scan.nextDouble();
        return miktar;
    }


}// Class sonu
