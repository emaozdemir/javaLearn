package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını print eden code create ediniz.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inek sayısını giriniz: ");
        int inek = scan.nextInt();

        System.out.println("koyun sayısını giriniz: ");
        int koyun = scan.nextInt();

        System.out.println("tavuk sayısını giriniz: ");
        int tavuk = scan.nextInt();

        System.out.println("toplam ayak sayisi: " + ((inek*4) + (koyun*4) + (tavuk*2)));






    }

}
