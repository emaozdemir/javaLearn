package j11_Arrays.Tasks;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int[] arr = {14, 19, 5, 21};
        //1.yol:
        Arrays.sort(arr);
        System.out.println(arr[0]);

        //2.yol (method ile):
        System.out.println(min(arr));
    }

    private static int min(int[] sayi) {
        int min = sayi[0];
        for (int i = 1; i < sayi.length; i++) {
            if (sayi[i] < min) {
                min = sayi[i];
            }
        }
        return min;
    }
}

