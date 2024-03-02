package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz: ");
        String metin = scan.nextLine();
        //1.
        System.out.println("tekrarlariSil(metin) = " + tekrarlariSil(metin));
        //2.
        tekrarsiz(metin);


    }//main sonu

    private static void tekrarsiz(String metin) {
        String yeniMetin = "";
        for (int i = 0; i < metin.length(); i++) {
            if (!yeniMetin.contains(metin.substring(i, i + 1))) {
                yeniMetin += metin.charAt(i);
            }

        }
        System.out.print("2.yol soutu " + yeniMetin);
    }

    private static String tekrarlariSil(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!newStr.contains("" + str.charAt(i))) {
                newStr += str.charAt(i);
            }

        }
        return newStr;
    }


}
