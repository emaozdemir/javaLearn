package j08_Loops.Loop02_WhileLoop.task;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */
        Random rdm= new Random();
        int rastgeleSayi=rdm.nextInt(100);//burasi 100 den kucuk rastgele sayi üretir.

        Scanner input = new Scanner(System.in);
       // System.out.println(rastgeleSayi); // böyle yazıp bastan baktım.
        int count=0;
        int sayi=0;
        while(sayi!=rastgeleSayi){
            System.out.println("1 ile 100 arasında sayi gir");
            sayi=input.nextInt();
            if (rastgeleSayi>sayi){
                System.out.println("daha buyuk bir sayi gir");
            }else if (rastgeleSayi<sayi){
                System.out.println("daha küçük bir sayi gir");
            }else System.out.println("tebrikler doğru tahmin!");
            count++;
        }
        System.out.println(rastgeleSayi);
        System.out.println(count+".denemede sayiyi doğru tahmin ettin.");





    }

}
