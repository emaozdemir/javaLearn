package j11_Arrays.Tasks;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
        Trick-> String split ile arraya atanmalı
         */
        String str = "Hello World";
        String[] strArr= str.split("");

        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i]);
        }


        //string ile
        for (int i = str.length()-1; i >= 0;i--) {
            System.out.print(str.charAt(i));
        }



    }
}