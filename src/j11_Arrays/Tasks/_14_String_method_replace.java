package j11_Arrays.Tasks;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        //Stringle çözümü
        String str = "Hello World";
      //  str = str.replace("o", "K");
      //  System.out.println(str);

        //arrayle çözümü
        String []arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace("o", "K");
        }
        String result = String.join("", arr);//String.join() metodu bu öğeleri birleştirir ve bir string oluşturur.
        System.out.println(result); // HellK WKrld


        String str1 = "";
        String arr2[]= str.split("");
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i].equals("o")){
                str1 += "K";
            }else{
                str1 += arr2[i];
            }
        }
        System.out.println(str1);


    }
}