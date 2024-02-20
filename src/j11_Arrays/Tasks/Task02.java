package j11_Arrays.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı bir array istersin: ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("lutfen istediğiniz elemanları giriniz: ");
        int sum=0;
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);


    }
}
