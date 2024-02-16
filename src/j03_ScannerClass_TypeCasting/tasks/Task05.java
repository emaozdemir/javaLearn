package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.
        Scanner sc = new Scanner(System.in);

        System.out.println("2 tam sayi giriniz: ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("(a+b) = " + (a + b));
        System.out.println("(a-b) = " + (a - b));
        System.out.println("(a*b) = " + (a * b));
        System.out.println("(a/b) = " + (a / b));
        System.out.println("(a%b) = " + (a % b));






    }

}
