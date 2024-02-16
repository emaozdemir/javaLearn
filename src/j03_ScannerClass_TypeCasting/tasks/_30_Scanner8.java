package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        //Kodu aşağıya yazınız.
        /* byte a;
        System.out.print("Kg cinsinden bir ağırlık giriniz = ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextByte();
        System.out.println(a);*/

        Scanner sc = new Scanner(System.in);
        byte b;
        System.out.println("Lütfen kg cinsinden bir ağırlık yazınız: ");
        b = sc.nextByte();
        System.out.println("Ağırlık = "+b);




    }
}
