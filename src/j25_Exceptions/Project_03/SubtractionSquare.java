package j25_Exceptions.Project_03;

import java.util.Scanner;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /* TASK ->
    Girilen iki tamsayı değerine kadar olan sayıların topamının karalerinin toplamını return eden substSquare
    method create ediniz.

   Örnek:

    int 1 = 10; -> (1+2+3+...+10)^2=3025

    int 2 = 5;  -> (1+2+3+...+5)^2=225

    3025 + 225 = 3250
    return 3250
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayı : ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayı : ");
        int num2 = scanner.nextInt();

        int sonuc = substSquare(num1, num2);
        System.out.println(sonuc);
    }

    public static int getSumOfSquares(int n) {


        return 0;

    }

    public static int substSquare(int num1, int num2) {

        return 0;

    }
}
