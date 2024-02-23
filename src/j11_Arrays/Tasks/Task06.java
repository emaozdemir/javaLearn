package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
        int[] arr = {14, 19, 5, 21, 9};
        int[] siralanmisArray = (arr);
        System.out.println(Arrays.toString(siralanmisArray));


    }

    private static int[] sirala(int[] array) {
        Arrays.sort(array);
        int[] yeniArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            yeniArr[i] = array[array.length - i - 1];
        }
        return yeniArr;
    }
}
