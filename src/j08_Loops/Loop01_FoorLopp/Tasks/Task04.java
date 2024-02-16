package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...
       // int sayi1 = 0;
        //int sayi2 = 0;

        /*Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin");
        sayi1 = scan.nextInt();
        System.out.println("bir sayi girin");
        sayi2 = scan.nextInt();

        if (sayi1 > sayi2) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        for (int i =sayi1; i <= sayi2; i++) {

                if (i % 2 == 0 ) {
                    System.out.print(i + "," );

            }
        }*/

        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2= scan.nextInt();
        for (int i = (sayi1<sayi2?sayi1:sayi2); i <=(sayi1>sayi2?sayi1:sayi2) ; i++) {
            if (i%2==0){
                System.out.print(i+" ,");
            }
        }


    }
}
