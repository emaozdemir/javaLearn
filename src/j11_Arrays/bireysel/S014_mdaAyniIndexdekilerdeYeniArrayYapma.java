package j11_Arrays.bireysel;

import java.util.Arrays;

public class S014_mdaAyniIndexdekilerdeYeniArrayYapma {
    public static void main(String[] args) {
        /*2 katlı ve 2 inner arraye sahip bir arrayde ayni indexe sahip elementleri toplayip,yeni
        yeni olusturacağimiz tek katlı bir arraye bu toplamları atayin.
           input -> int[][] arr = {{3, 4, 5}, {2,3,6,7}};
           output ->                      [5,7,9]
         */
        // yani biz en kısa olan inneri bulmalıyız önce..

        int[][] arr = {{3, 4, 5}, {2,3,6,7}};

        int yeniArrayLength = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        int[] yeniArr = new int[yeniArrayLength]; //[0,0,0]

        for (int i = 0; i < yeniArrayLength; i++) {
            yeniArr[i] = arr[0][i] + arr[1][i];

        }
        System.out.println(Arrays.toString(yeniArr));


    }
}
