package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz:");
        String metin = sc.nextLine();
        if (metin.contains(" ")){
            System.out.println("girilen metinde boşluk karakteri var");
        }else System.out.println("girilen metinde boşluk karakteri yok");


    }
}

