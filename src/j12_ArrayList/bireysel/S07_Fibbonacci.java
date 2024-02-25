package j12_ArrayList.bireysel;

import java.util.ArrayList;
import java.util.List;

public class S07_Fibbonacci {
    public static void main(String[] args) {
        /*verilen pozitif bir n tamsayisini alarak,
        bize ilk n tane fibbonacci sayisini bir list olarak donduren bir method olustur.
        fibbonacci-> 0 1 1 2 3 5 8 13 21 34...
         */
        System.out.println(fibbonacciListOlusturma(5));
        System.out.println(fibbonacciListOlusturma(10));


    }

    public static List<Integer> fibbonacciListOlusturma(int sayiAdedi) {
        List<Integer> fibbonacciListesi = new ArrayList<>();//[]
        if (sayiAdedi <= 0) {
            System.out.println("sayi adedi pozitif olmadiğindan bos bir liste döndürüyorum");
        } else if (sayiAdedi == 1) {
            fibbonacciListesi.add(0);
        } else if (sayiAdedi == 2) {
            fibbonacciListesi.add(0);
            fibbonacciListesi.add(1);
        } else { //sayiadedi>2 yanii
            fibbonacciListesi.add(0);
            fibbonacciListesi.add(1);
            for (int i = 2; i < sayiAdedi; i++) {
                fibbonacciListesi.add(fibbonacciListesi.get(i - 2) + fibbonacciListesi.get(i - 1));
            }

        }
        return fibbonacciListesi;

    }
}

