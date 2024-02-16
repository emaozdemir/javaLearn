package j08_Loops.Loop03_DoWhileLoop.task;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //task-> kullanıcıdan alınan bir cümlenin büyük harfle başlayıp nokta ile bittiğini kontrol eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle = scan.next();
        char first = cumle.charAt(0);
        char last = cumle.charAt(cumle.length() - 1);

        do {
            if (cumle.length() > 0) {
                if (first >= 'A' && first <= 'Z' && last >= '.') {
                    System.out.println("girilen cumle büyük harf ile başlayıp nokta ile bitiyor-> " + cumle);
                }
            }

        } while (false);

    }
}
