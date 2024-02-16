package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task17_gelismis {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();
        System.out.println("forReverse(num) = " + forReverse(num));

    }

    private static int forReverse(int num) {
        int reversed=0;
        for (; num!=0 ; num/=10) {
            int digit=num%10;
            reversed=reversed*10+digit;
        }
        return reversed;
    }

}

