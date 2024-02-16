package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task09 {
    /* Task->
      Girilen bir kelimede  tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri print eden code create ediniz.
      */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = scan.nextLine().toLowerCase();
        if (kelime.length()%2 !=0 && kelime.length()>=3){
            System.out.println(kelime.charAt(kelime.length()/2));
        }else System.out.println("tekrar deneyin..");

        System.out.println((kelime.length()%2 !=0 && kelime.length()>=3) ?kelime.charAt(kelime.length()/2) : "tekrar deneyin..");


    }
}
