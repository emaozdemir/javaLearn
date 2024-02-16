package j10_MethodCreation.tasks;

import java.util.Arrays;
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
        dolarToplami(para);
        euroToplami(para);

    }

    private static int euroToplami(String para) {
        return 0;
    }

    private static int dolarToplami(String para) {
        return 0;
    }


}
