package j11_Arrays.Tasks;

import java.util.Arrays;



public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..
        int [] arr = {25, 30, 30, 35, 100};
        System.out.println(Arrays.toString(arr));
        toplami(arr);

    }

    private static void toplami(int[] arr) {
        int toplam=0;
        for (int each:arr){
            toplam+=each;
        }
        System.out.println("toplam = "+toplam);

        //2.yol
        int toplam2=0;
        for (int i = 0; i < arr.length; i++) {
            toplam2+=arr[i];
        }
        System.out.println(toplam2);
    }


}