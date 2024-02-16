package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    Bir String oluştur.
          Konsol'a 10 sene önceki yaşadığın şehri yazın.
          Bu String'i yazdırın.   */

        //Kodu aşağıya  yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 10 sene önce yaşadığın şehrin ismini giriniz: ");
        String sehir = scan.nextLine();
        System.out.println("sehir = "+sehir);




    }
}
