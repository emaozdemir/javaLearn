package j11_Arrays.Tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        //  int outerr[][]={{27},{},{18}};

        // output->? int arr3[][]={{8,10},{13,15},{18}};

        for (int i = 0; i < (arr1.length > arr2.length ? arr2.length : arr1.length); i++) {
            for (int j = 0; j < (arr1[i].length < arr2[i].length ? arr1[i].length : arr2[i].length); j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");

            }

        }
        for (int i = 0; i < (Math.min(arr1.length, arr2.length)); i++) {
            for (int j = 0; j < Math.min(arr1[i].length, arr2[i].length); j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }



            // Yeni çok boyutlu dizinin boyutlarını belirleme
            // Yeni çok boyutlu dizinin boyutlarını belirleme
            // Yeni çok boyutlu dizinin boyutlarını belirleme
   /*      int maxRows = Math.max(arr1.length, arr2.length);
        int[][] resultArray = new int[maxRows][];

        for (int i = 0; i < maxRows; i++) {
            int maxLength = Math.max(arr1[i].length, arr2[i].length);
            resultArray[i] = new int[maxLength];

            // Alt dizilerin elemanlarını toplama
            for (int j = 0; j < maxLength; j++) {
                int value1 = (i < arr1.length && j < arr1[i].length) ? arr1[i][j] : 0;
                int value2 = (i < arr2.length && j < arr2[i].length) ? arr2[i][j] : 0;
                resultArray[i][j] = value1 + value2;
            }
        }

        // Sonucu ekrana yazdırma

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
*/
        }
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) { // 1. Arrayi geziyor

            for (int k = 0; k < arr2.length; k++) { // 2. Arrayi geziyor

                if (i == k) // 1. Array ile 2. Arrayin dis array indexleri esit ise calisiyor

                    for (int j = 0; j < arr1[i].length; j++) { // 1. Arrayin ic arraylerini geziyor

                        for (int l = 0; l < arr2[k].length; l++) { // 2. Arrayin ic arraylerini geziyor

                            if (j == l) { // ic arraylerin indexleri esit ise calisan if blogu

                                sum = sum + arr1[i][j] + arr2[k][l];  // ayni index'e sahip elemanlari topluyor
                            }
                        }
                    }
            }
        }
        System.out.println(sum);
    }
    }



