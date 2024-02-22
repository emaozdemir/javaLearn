package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen sayi girin= ");
        int sayi = input.nextInt();
        System.out.println(sayi);
        String str = Integer.toString(sayi);//stringe bu şekilde cevirebilirim.
        System.out.println(str);
        // String[] arr = Integer.toString(sayi).split("");//2.yol stringe cevirmek için aynı zamanda split ile bölmüş oldum ve arraye atadım.
        //System.out.println(Arrays.toString(arr));
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }


    }

}
