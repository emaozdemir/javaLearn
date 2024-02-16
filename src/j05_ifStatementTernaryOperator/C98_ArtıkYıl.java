package j05_ifStatementTernaryOperator;

import java.util.Scanner;
public class C98_ArtıkYıl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yil = sc.nextInt();
        if (yil % 4 ==0) {

            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println("artık yıl");
                } else {
                    System.out.println("artık yıl değildir");
                }
            } else System.out.println("artık yıl ");

        } else {
            System.out.println("artık yıl değildir.");
        }



    }
}
