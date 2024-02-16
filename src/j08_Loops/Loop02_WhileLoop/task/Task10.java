package j08_Loops.Loop02_WhileLoop.task;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int sayi = input.nextInt();
        int count=0;
        int i=1;
        while (i<=sayi){
            System.out.print(i+" ");
            i+=2;
            count++;
        }
        System.out.println("\ngirdiğiniz sayiya kadar olan tek sayi adedi  --> " +count);


    }
}
