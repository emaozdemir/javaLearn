package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz.");
        String kelime1 = sc.nextLine();
        System.out.println("lütfen bir kelime daha giriniz");
        String kelime2 = sc.nextLine();

        System.out.println(kelime1+kelime2);//1.yol
        System.out.println(kelime1.concat(kelime2));//2.yol


        System.out.println(kelime1.substring(1)+kelime2.substring(1));
        System.out.println((kelime1.substring(1).concat(kelime2.substring(1))));


    }

}
