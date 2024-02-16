package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task13 {
    //Task-> Girilen   4 harfli bir kelimeyi tersten print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir metin giriniz: ");
        String text = input.nextLine();
        if (text.length()==4){
            System.out.println(text.substring(text.length()-1)+text.substring(2,3)+text.substring(1,2)+text.substring(0,1));
        }

        for (int i = text.length() - 1; i<=0 ; i--) {
            System.out.println(text.charAt(i));
        }
        //       Scanner scan = new Scanner(System.in);
        //       System.out.println("4 harfli bir kelime giriniz: ");
 //       String text = scan.next();
//        if (text.length() <= 4) {
//            System.out.println(("" + text.charAt(text.length() - 1) +
//                    text.charAt(text.length() - 2) +
//                    text.charAt(text.length() - 3) +
//                    text.charAt(text.length() - 4)));
//        } else System.out.println("4 harften büyük girdin...");





    }
}

