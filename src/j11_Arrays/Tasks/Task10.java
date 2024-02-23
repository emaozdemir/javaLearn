package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int[] arr = {1, 2, -3, 4, -5, -6};
        System.out.println(Arrays.toString(arr));
        isaretDegistir(arr);
        //System.out.println("isaretDegistir(arr) = " + isaretDegistir(arr));
        arr = isaretDegistir(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static int[] isaretDegistir(int[] arr) {

        int[] yeniArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i] * -1;
        }
        return yeniArr;

    }
}
