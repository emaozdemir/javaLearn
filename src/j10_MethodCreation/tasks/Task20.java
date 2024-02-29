package j10_MethodCreation.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task20 {
    static Scanner scan = new Scanner(System.in);
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {
        String para = "$1 $12 €34 €56 $45 €78";
        // String [] arr= para.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(para.split(" ")));
        System.out.println(list);
        System.out.println("dolarToplami(list) = " + dolarToplami(list));
        System.out.println("euroToplami(list) = " + euroToplami(list));


    }

    private static int euroToplami(List<String> arrList) {
        int toplam = 0;
        for (int i = 0; i < arrList.size(); i++) {
            String item = arrList.get(i);
            if (item.contains("€")) {
                toplam += Integer.parseInt(item.replace("€", ""));
            }
        }
        return toplam;
    }

    private static int dolarToplami(List<String> arrList) {
        int toplam = 0;
        for (int i = 0; i < arrList.size(); i++) {
            String item = arrList.get(i);
            if (item.contains("$")) {
                toplam += Integer.parseInt(item.replace("$", ""));
            }
        }
        return toplam;
    }

    /*
arrList.contains("€") ifadesi, listenin içinde "€" işaretini içeren bir öğe olup
olmadığını kontrol eder. Ancak bu, listenin her bir öğesini tek tek kontrol etmez. Dolayısıyla, iç içe döngüler
kullanmaksızın her bir öğenin kontrol edilmesi gerekmektedir.

Şu anda, arrList.contains("€") ifadesi, listenin tamamını kontrol eder ve sadece bir tane "€" işareti
varsa true döndürür. Bu nedenle, her döngü adımında aynı şeyi tekrar eder ve yanlış sonuçlar elde edilir.
     */

}
