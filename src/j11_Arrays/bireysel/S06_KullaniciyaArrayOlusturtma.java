package j11_Arrays.bireysel;

import java.util.Arrays;
import java.util.Scanner;

public class S06_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {
        // kullanicidan arrayin boyutunu ve elementlerini alip,
        // arrayi olusturan ve bize donduren bir method olusturun.
        int [] arrayim = kullaniciyaArrayOlusturtma();
        System.out.println(Arrays.toString(arrayim));

    }
    public static int[] kullaniciyaArrayOlusturtma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("kac elemanli bir array olusturmak istersin: ");
        int arrayBoyut = scan.nextInt();
        int[] arr = new int[arrayBoyut];
        for (int i = 0; i < arrayBoyut; i++) {
            System.out.println(i + ". index için bir tamsayi giriniz: ");
            arr[i] = scan.nextInt();

        }
        return arr;


    }
}
