package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz: ");
        int girilenSayi= scan.nextInt();
        List<Integer> fibbonacciListesi = new ArrayList<>();//[]

        if (girilenSayi <= 0) {
            System.out.println("sayi pozitif olmadiğindan bos bir liste döndürüyorum");
        } else if (girilenSayi==1) {
            fibbonacciListesi.add(0);
        } else if (girilenSayi==2) {
            fibbonacciListesi.add(0);
            fibbonacciListesi.add(1);
        }else{
            fibbonacciListesi.add(0);
            fibbonacciListesi.add(1);
            for (int i = 2; i <girilenSayi ; i++) {
                fibbonacciListesi.add(fibbonacciListesi.get(i-2)+fibbonacciListesi.get(i-1));
            }
        }
        System.out.println(fibbonacciListesi);



    }
}
