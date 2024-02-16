package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz: ");
        String metin = sc.nextLine();
        //System.out.println(metin.substring(1));

        System.out.println(metin.substring(0,metin.length()-1));



    }
}
