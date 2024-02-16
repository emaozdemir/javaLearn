package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */
        Scanner sc = new Scanner(System.in);
        System.out.print(" Sayi giriniz: ");
        int sayi = sc.nextInt();
        for (int i = 1; i <= sayi; i++) {
            System.out.println("IT: " + i);

            for (int j = 1; j <=3; j++) {
                System.out.println("\tQA: " + j);

            }
            System.out.println("\t.....");
        }




    }
}
