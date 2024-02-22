package j11_Arrays.Tasks;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */



        String str = "ade1r4d3";
        String[] strArr=str.split("");
        System.out.println(Arrays.toString(strArr));
        topla(strArr);
        System.out.println(topla(strArr));
        System.out.println(toplam(strArr));

    }
    public static int topla(String[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {  // dizi elemanının bir rakam olup olmadığını kontrol eder.
               sum += Integer.valueOf(arr[i]);//string olan strArr[i] ifadesinin Integer.valueOf() metodu ile integer'a çevrilmesi gerekir.
            }
        }
        return sum;

    }

    //if (Character.isDigit(arr[i].charAt(0))) koşulu ile,
    // Character.isDigit() metodu ile karakterin bir rakam olup olmadığı kontrol edilir.
    public static int toplam(String[] strArr) { //2.yol
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            char c = strArr[i].charAt(0);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        return sum;

    }
}

