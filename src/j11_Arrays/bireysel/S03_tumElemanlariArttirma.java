package j11_Arrays.bireysel;

import java.util.Arrays;

public class S03_tumElemanlariArttirma {
    public static void main(String[] args) {
        // verilen bir  int array in tüm elemanlarini istenen sayi kadar  artırıp bize döndüren
        // bir method olusturun. eski arrayi yeni haliyle kaydedin.

        int[] arr = {5, 7, 9, 10};

        //2 arttırınca methodsuz çözüm
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
        System.out.println(Arrays.toString(arr));


        // yeni haline kaydetmek için atama yaparız.
        arr = elemanlariAttir(arr, 10);
        System.out.println("10 arttırıncaki hali " + Arrays.toString(arr));


    }

    public static int[] elemanlariAttir(int[] arr, int artisMiktari) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += artisMiktari;
        }
        return arr;

    }


}
