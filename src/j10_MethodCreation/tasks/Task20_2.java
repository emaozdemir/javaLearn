package j10_MethodCreation.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task20_2 {
    static Scanner scan = new Scanner(System.in);
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {
        String str = "$1 $12 €34 €56 $45 €78";

        euroDollarSum(str);
    }

    private static void euroDollarSum(String money) {

        List<String> arrListOfStr = List.of(money.split(" "));
        System.out.println("arrListOfStr = " + arrListOfStr);
        int euroSum = 0;
        int dollarSum = 0;

        for (int i = 0; i < arrListOfStr.size(); i++) {
            if (arrListOfStr.get(i).contains("$")) {
                dollarSum += Integer.parseInt(arrListOfStr.get(i).replace("$", ""));
            } else if (arrListOfStr.get(i).contains("€")) {
                euroSum += Integer.parseInt(arrListOfStr.get(i).replace("€", ""));
            }
        }
        System.out.println("dollarSum = " + dollarSum);
        System.out.println("euroSum = " + euroSum);

    }
}