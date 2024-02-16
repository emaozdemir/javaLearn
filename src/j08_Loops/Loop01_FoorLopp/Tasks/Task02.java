package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin=scan.nextLine();
        String tersMetin="";//bos bir String tanimlandi
        System.out.println("Girilen metin = " + metin);

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);//metnin i. index elemanini tersMetn'e ekledik
        }

        System.out.println("Girilen metnin tersi = "+tersMetin);

//        if (metin.equalsIgnoreCase(tersMetin)){
//            System.out.println("Girilen metin PALINDROM'dur");
//        }else System.out.println("Girilen metin PALINDROM degildir");

        System.out.println(metin.equalsIgnoreCase(tersMetin)?"Girilen metin PALINDROM'dur":"Girilen metin PALINDROM degildir");
        //En son sartimizi ele aldik


  /*     Scanner scan = new Scanner(System.in);

        System.out.print("bir ifade giriniz: ");
        String text = scan.nextLine();
        int sayac = 0;

        for (int i = 0; (i <= (text.length() / 2)); i++) {
            if (text.charAt(i) != text.charAt((text.length() - 1) - i)) sayac++;
        }

        if (sayac == 0) System.out.println("polindrom kelime");
        else System.out.println("polindrom kelime değil");
*/


    }
}
