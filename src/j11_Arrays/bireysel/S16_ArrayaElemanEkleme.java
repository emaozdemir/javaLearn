package j11_Arrays.bireysel;

import java.util.Arrays;

public class S16_ArrayaElemanEkleme {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8};
        //arr ye 4.eleman olarak 20 ekleyin;
        //arr[3]=20;//ArrayIndexOutOfBoundsException
        //böyle yapınca hata alıyoruz . yani arraye eleman eklemek istersek böyle yapmamız lazım:
        //önce yeni bir array olusturup 20 ekleyip eski arraye yeni arrayi kopyalar gibi aktarabiliriz;
        System.out.println(Arrays.toString(arr));//[3, 5, 8]
        int[] yeniArr = {3, 5, 8, 20};
        arr = yeniArr;  // bu şekilde yani.
        System.out.println(Arrays.toString(arr));//[3, 5, 8, 20]

        // bu arrayden 5 i silip 3 elemanli hale getiremeyiz arrayle. yine yeni arr2 olusturup 5 i koymadan sonra kopyalama ile;
        int[] yeniArr2 = {3, 8, 20};
        arr = yeniArr2;
        System.out.println(Arrays.toString(arr));//[3, 8, 20]

        //arrayler ekleme ve silmeye uygun değildir. bu yuzdenn ARRAyLİST yapisini olusturmustur java.


    }
}
