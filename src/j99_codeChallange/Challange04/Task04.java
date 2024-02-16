package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task04 {

    /* Task->
     * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana  degil ise girilen kelimeyi print eden code create ediniz.
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = scan.nextLine();

        if (kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2)+kelime.substring(kelime.length()-2));
          String a = (kelime.substring(kelime.length()-2));
          System.out.println(a.concat(a).concat(a));//1.yol
            System.out.println(a+a+a);//2.yol
          }else System.out.println(kelime);

//System.out.println(a*3); sor doğukan hocaya


    }
}
