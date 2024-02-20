package j11_Arrays.bireysel;

import java.util.Arrays;

public class S08_arrayeElemanEkleme {
    public static void main(String[] args) {
        // verilen bir arraya istenen bir elemani ekleyip bize donduren bir method yazin.
        // eski arraye yeni değeri atayin.
        //methodsuz çözüm:
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int[] yeniArr = {1, 2, 3, 4, 5, 6};
        arr = yeniArr;
        System.out.println(Arrays.toString(arr));

        //methodlu çözüm:
        int[] yeniArr2 = yeniArray(arr, 10);
        System.out.println(Arrays.toString(yeniArr2));


    }

    public static int[] yeniArray(int[] eskiArr, int eklenen) {
        int[] yeniArr = new int[eskiArr.length + 1];
        for (int i = 0; i < eskiArr.length; i++) {
            yeniArr[i] = eskiArr[i];
        }
        yeniArr[yeniArr.length - 1] = eklenen;
        return yeniArr;

    }
}
