package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı bir array istersin: ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("lutfen istediğiniz elemanları giriniz: ");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        for (int i =arr.length - 1; i >= 0; i--){
            System.out.print((arr[i] + " ").getClass());// getclassla clas kontrolu yaptık
        }
        System.out.println();

        int [] buyuktenKucuge = new int[arrayLength];
        int index = 0;
        for (int i =arr.length - 1; i >= 0; i--) {
           buyuktenKucuge[index]=(arr[i]);
            index++;

        }
        System.out.println(Arrays.toString(buyuktenKucuge));







      /*  int[] yeniarr = new int[arr.length];
       // int yeniSiralama = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "");

        }
        System.out.println(yeniarr);

       /* System.out.println("yeniArrElemanSayisi = " + yeniArrElemanSayisi);
        String [] yeniArr=new String[yeniArrElemanSayisi];
        int yeniIndex=0;
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length()<6){
                yeniArr[yeniIndex]=isimler[i];
                yeniIndex++;
            }
        }
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
*/

    }
}
