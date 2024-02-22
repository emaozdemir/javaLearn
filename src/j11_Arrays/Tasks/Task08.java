package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı bir array istersin: ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("lutfen istediğiniz elemanları giriniz: ");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arrayLength; i++) {
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+" ");
            }
        }



    }
}
