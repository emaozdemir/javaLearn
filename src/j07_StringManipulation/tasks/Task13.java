package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz : ");
        String metin = sc.nextLine();
        System.out.println(metin.replace(" ","").length());

    }
}
