package j10_MethodCreation.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        esitlikControl();

    }//main sonu

    public static void esitlikControl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int num = sc.nextInt();
        System.out.println("sayi giriniz");
        int num1 = sc.nextInt();
        if (num == num1) {
            System.out.println("eşit");
        } else System.out.println("esit değil");


    }


}//class sonu
