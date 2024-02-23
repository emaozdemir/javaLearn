package j11_Arrays.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */

        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        System.out.println("array için istediğiniz elemanlari giriniz= ");
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i]%3==0) {
                count++;
            }
        }
        System.out.println("girilen arrayde 3 ile bölünebilen sayi adedi toplami--> "+count);


    }

}
