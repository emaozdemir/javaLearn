package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        //Kodu aşağıya  yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz: ");
        String ad = scan.nextLine();
        System.out.println("ad = "+ad);



    }
}
