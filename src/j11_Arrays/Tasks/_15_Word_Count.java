package j11_Arrays.Tasks;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.


        //Kodu aşağıya yazınız.
        //harf sayisi
        String str ="Removes white space from both ends of a string";
        String[] arr = str.replaceAll(" ","").split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
*/
        //kelime sayısı
        String str = "Removes white space from both ends of a string";

        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);


    }
}