package j08_Loops.Loop02_WhileLoop.Bireysel;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        // task04->girilen ifadeyi tersten  print eden code create ediniz
        System.out.println("task04");
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = scan.nextLine();
        int index=str.length()-1;
        while (index>=0){
            System.out.print(str.charAt(index));
            index--;
        }
        System.out.println("\n"+str);

        System.out.println();

        // Task->0-255 e kadar olan sayıların karakter değerini print eden code create ediniz...
            System.out.println("for loop ");
            for (int i =0;i<255;i++) {
                System.out.println((char)i);
            }

            System.out.println();
        int sayı=0;
        while (sayı<=255){
            System.out.print((char)(sayı)+" " );
            sayı++;
        }


    }
}
