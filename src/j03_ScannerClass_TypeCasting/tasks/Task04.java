package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz : ");
        String isimSoyisim = sc.nextLine();
        System.out.println("yaş giriniz: ");
        int yaş = sc.nextInt();
        System.out.println("kilo ve boy giriniz: ");
        int kiloBoy = sc.nextInt();
        System.out.println("kaç ay devam etmek istersiniz? ");
        int ay = sc.nextInt();
        System.out.println( ay + " fiyat toplamı = " + (ay * 20));




    }
}
