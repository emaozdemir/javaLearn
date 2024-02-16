package j99_codeChallange.Challange01;

import java.util.Scanner;

public class Task07_ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" lütfen 1 tane sayı giriniz : ");
        int sayi1= sc.nextInt();

        System.out.println(" lütfen 1 tane sayı daha giriniz : ");
        int sayi2= sc.nextInt();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);




    }
}
