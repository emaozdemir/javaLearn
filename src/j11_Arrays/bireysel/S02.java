package j11_Arrays.bireysel;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class S02 {
    /*
    bir arraydeki tum elementleri ayni isleme tabi tutacaksak bir for loop olusturup
    arr[i] uzerinden tum elementlere yapmak istediğimiz işlem,i yapabiliriz.
     */

    public static void main(String[] args) {
        // verilen bir int arraydeki tum elementleri toplayıp yazdırın.
        int[] arr1 = {1, 2, 3, 4, 5, 6};

        int toplam=0;
        for (int i = 0; i < arr1.length; i++) {
            toplam+=arr1[i];
        }
        System.out.println(toplam);

        //carpimini yazdırın;
        int carpim=1;
        for (int i = 0; i < arr1.length; i++) {
            carpim*=arr1[i];
        }
        System.out.println(carpim);

        //verilen arraydeki tum elemanları 3 arttırın.
        System.out.println("verilen array= "+ Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]+=3;
        }
        System.out.println("verilen arrayin 3 arttırılmıs hali= "+ Arrays.toString(arr1));

        //verilen arraydeki 7 den buyuk sayıları iki azaltıp 7 ve kucuk sayıları 2 arttıran code yazın;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 7) {
                arr1[i]-=2;
            } else if (arr1[i] <=7) {
                arr1[i]+= 2;
            }
        }
        System.out.println(Arrays.toString(arr1));






    }
}
