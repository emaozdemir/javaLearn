package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task9 {
    /* Task-> Girilen bir metinde istenen bir harfin tekrar sayısını print eden code create ediniz

     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e

     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("metin giriniz: ");
        String str = input.nextLine();
        System.out.println("hangi harfi istersin? ");
        char c = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("girilen metindeki istenen harf harf ve sayisi ->> "+c +"," +count);

    }

}
