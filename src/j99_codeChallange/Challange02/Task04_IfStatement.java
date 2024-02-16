package j99_codeChallange.Challange02;

import java.util.Scanner;

public class Task04_IfStatement {
    public static void main(String[] args) {
        /* Task ->
         * Girilen Y/N  degerlerini
         * print eden code create ediniz..
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen Y ya da N giriniz: ");

       /* System.out.println(" char çözümüyle ");
        char karakter = sc.next().charAt(0);
        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("YES");
        }
        else if (karakter == 'N' || karakter == 'n') {
            System.out.println("NO");
        }else System.out.println("hata ! lütfen sadece N veya Y giriniz:");*/

        /*String karakter = sc.next();
        if (karakter== "Y"|| karakter=="y") {
            System.out.println("YES");
        }
        else if (karakter== "N"|| karakter=="n") {
            System.out.println("NO");
        }else System.out.println("hata ! lütfen sadece N veya Y giriniz:");*/

        String karakter = sc.next();
        if (karakter.equalsIgnoreCase("y"));{
            System.out.println("YES");
        }
       //else if (karakter.equalsIgnoreCase("n"));{
            System.out.println("NO");
       // }else System.out.println("hata! lütfen sadece N veya Y giriniz:");






    }
}
