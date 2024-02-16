package j08_Loops.Loop01_FoorLopp.Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("metin giriniz");
        String metin = scanner.nextLine();
        for (int i = 0; i < metin.length(); i++) {
          char ch = metin.charAt(i);
          if (metin.charAt(i) ==i){
              System.out.print(ch);
          }

        }

        //2.yol
        String str = "aabbccccddddaaa";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!newStr.contains(String.valueOf(str.charAt(i)))) {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);

    }
}
