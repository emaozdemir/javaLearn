package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı bir array istersin: ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("lutfen istediğiniz elemanları giriniz: ");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));




    }
}
