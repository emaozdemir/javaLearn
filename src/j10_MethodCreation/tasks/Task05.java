package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task05 {
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz
        System.out.println("birinci sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.println("ikinci sayiyi giriniz: ");
        int sayi2= scan.nextInt();
        System.out.println("yapacağiniz işlemi giriniz: ");
        char islem= scan.next().charAt(0);
        dortIslem(islem,sayi1,sayi2);


    }//main sonu

    private static void dortIslem(char islem, int sayi1, int sayi2) {
        switch (islem) {
            case '+':
                System.out.println(""+sayi1+islem+sayi2+ "= "+(sayi1+sayi2));
                break;
            case '-':
                System.out.println(""+sayi1+islem+sayi2+ "= "+(sayi1-sayi2));
                break;
            case '*':
                System.out.println(""+sayi1+islem+sayi2+ "= "+(sayi1*sayi2));
                break;
            case '/':
                System.out.println(""+sayi1+islem+sayi2+ "= "+(sayi1/sayi2));
                break;
                default:
                    System.out.println("hatali islem girdiniz..");
        }
    }

}//Class sonu
