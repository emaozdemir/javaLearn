package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task17_Stringle {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        System.out.println(stringReverse(num));

    }

    private static String stringReverse(int num) {
        String str=String.valueOf(num);
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }



    }





