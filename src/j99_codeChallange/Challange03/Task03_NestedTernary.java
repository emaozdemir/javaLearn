package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task03_NestedTernary {

    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir final harfinizi  giriniz.");
        char harf = scan.next().toUpperCase().charAt(0);
        System.out.println(harf=='A'? "gayet Basarili" : harf=='B'? "Basarili" : harf=='C'? "Ha gayret" : "diğerleri");
        //String sonuc = (harf=='A')? "gayet Basarili" : (harf=='B')? "Basarili" : (harf=='C')? "Ha gayret" : "diğerleri";

        //System.out.println(sonuc);



    }

}
