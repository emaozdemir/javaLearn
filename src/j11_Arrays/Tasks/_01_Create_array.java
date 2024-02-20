package j11_Arrays.Tasks;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String[] meyveler = {"Apple", "Orange", "Banana", "Kiwi"};
        System.out.println(meyveler);//[Ljava.lang.String;@19dfb72a
        //array data turundeki variable ler direk yazdırılmaz.
        //direk yazdırmak istediğinizde stack memorydeki refenrasi size yazdırır.
        // arrayı içindeki elemanlarla yazdırmak istersek ; toString yazmalıyız.

        System.out.println(Arrays.toString(meyveler));//[Apple, Orange, Banana, Kiwi]



    }
}
