package j08_Loops.Loop02_WhileLoop.task;

import java.util.Map;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz
        Scanner input = new Scanner(System.in);
        int count = 0;
        int enBuyuk = 0;
        while (count < 5) {
            System.out.print("lütfen sayi girin= ");
            int sayi = input.nextInt();
            count++;
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
        }
        System.out.println("girilen 5 sayının en buyugu " + enBuyuk);


    }
}
