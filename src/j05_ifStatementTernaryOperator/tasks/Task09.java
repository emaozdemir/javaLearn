package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
          /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner input = new Scanner(System.in);

        System.out.print("sayi giriniz : ");
        int sayi = input.nextInt();

        if (sayi>0) System.out.println(sayi + "sayı pozitiftir");
        else if (sayi<0) System.out.println(sayi + "sayı negatiftir");
        else System.out.println(sayi + "sayı nötr  dır ");
    }
}
