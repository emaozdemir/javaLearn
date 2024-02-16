package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen karakter giriniz: ");
        char karakter = scan.next().charAt(0);
        if ((karakter >= 'a' && karakter<= 'z') || (karakter>='A' && karakter<='Z')){
            System.out.println("girilen karakter harftir : "+ karakter);
        }else System.out.println("girilen karakter harf değildir: "+ karakter);

    }
}
