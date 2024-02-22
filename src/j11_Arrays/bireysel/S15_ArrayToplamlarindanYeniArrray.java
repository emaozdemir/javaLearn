package j11_Arrays.bireysel;

import java.util.Arrays;

public class S15_ArrayToplamlarindanYeniArrray {
    public static void main(String[] args) {
        /*verilen 2 katlı bir arrayde her bir ic arraydeki elementleri toplayip
        yeni olusturacağimiz tek katlı bir arraye bu toplamlari atayin.
        input -> int[][] arr = {{3, 4, 5}, {2,3,6,7},{10},{1,8,2,2}};
        output ->                      [12,18,10,13]

         */
        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}, {10}, {1, 8, 2, 2}};
        System.out.println(Arrays.deepToString(arr));

        int yeniArrayLength = arr.length;
        int[] yeniArray = new int[yeniArrayLength];//[0,0,0,0]
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            yeniArray[i] = toplam;
            toplam = 0;
        }
        System.out.println(Arrays.toString(yeniArray));

    }
}
