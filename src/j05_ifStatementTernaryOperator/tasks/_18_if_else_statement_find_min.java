package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
       /* int enDüşük = i1;
        if (i2 < enDüşük) {
            enDüşük = i2;
        }
        if (i3 < enDüşük) {
            enDüşük = i3;
        }
        System.out.println("en düşük sayı = " + enDüşük);*/

        if (i1<i2 && i1<i3 ){
            System.out.println("en küçük sayı = " + i1);
        }
        else if (i2<i1 && i2<i3){
            System.out.println("en küçük sayı = " + i2);
        }
        System.out.println("en kücük sayi = " + i3);





    }
}
