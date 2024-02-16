package j08_Loops.Loop02_WhileLoop.task;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80
        Scanner sc = new Scanner(System.in);
   /*     System.out.println("Please enter a number");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j ) );

            }
            System.out.println();
        }
*/
        System.out.println("**** While Loop ****");
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        int i = 1;
        while (i <= 10) {

            System.out.println(i + "x" + num + "=" + (i * num));
            i++;
        }
        System.out.println();

    }
}
