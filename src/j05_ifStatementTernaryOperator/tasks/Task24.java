package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task24 { public static void main(String[] args) {
        /*
        *Java ile gidilen kilometre verisine göre taksimetre tutarını  print eden code create ediniz.
        *Taksimetre kilometre başına 2.20 TL tutmaktadır.
        *Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
          Scanner scan= new Scanner(System.in);
          System.out.println("gideceğiniz kilometreyi girin biz size taksimetre tutarını biz hesaplayalım :) ");
          double km = scan.nextDouble();
          double herKmParasi = 2.20;
          double kısaMesafeParasi = 20; // km= 9.09..
          double acılısParasi =10;

    System.out.println(km<=9 ? "ödenecek tutar = "+ kısaMesafeParasi : "ödenecek tutar= " + ((km*herKmParasi+acılısParasi)));;






}
}
