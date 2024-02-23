package j11_Arrays.Tasks;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.
        int sayi = 123;

        int count = 0;
        for (int i = sayi; i >= 0; i--) {
            i = i / 10;
            count++;

        }
        System.out.println(count);
        String str = "";
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sayi % 10;
            sayi = sayi / 10;
            str += arr[i];
        }
        System.out.println((str).getClass());
        Integer a = Integer.parseInt(str);
        // int a=Integer.parseInt(str);
        System.out.println(a.getClass());//getclası Integer yaparak cagırabildik.

 /*int yeniSayı=0;
 for (int i = sayi; i > 0; i /= 10) {
     yeniSayı = yeniSayı * 10 + i % 10;
 }
 System.out.println("yeniSayı = " + yeniSayı);
 */






    }
}


