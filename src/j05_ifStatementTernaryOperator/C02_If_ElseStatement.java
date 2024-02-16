package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_If_ElseStatement {
    public static void main(String[] args) {
        // task-> girilen yasın 18 den buyulugunu kontrol eden code create ediniz..
        Scanner sc = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int yas = sc.nextInt();
        if (yas>18){
            System.out.println("yasiniz 18 den büyük!");
        }else System.out.println("yasiniz 18 den kücük!");


    }


}
