package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */
        hackerca();
        //2.yol 
      //  hackerLanguageConverter();


    }//main sonu

/*    private static void hackerLanguageConverter() {
        System.out.println("Bir metin giriniz");
        String text = input.nextLine();
        String hackerText = "";
        for (int i = 0; i < text.length() - 1; i++) {
            switch (text.charAt(i)) {
               case 'a':
                    hackerText += '7';
                    break;
                case 'v':
                    hackerText += '1';
                    break;
               case 'c':
                   hackerText += '-4';
                   break;
                case 'e':
                    hackerText += '2';
                    break;
                default:
                    hackerText += text.charAt(i);
           }
        }
            System.out.println(hackerText);
   }

        }

 */

    private static void hackerca() {
        System.out.println("metin giriniz:  ");
        String metin = input.nextLine();
        metin = metin.replaceAll("a", "7").replaceAll("v", "1").
                replaceAll("c", "-4").replaceAll("e", "2");
        System.out.println("metin = " + metin);
    }


}//Class sonu
