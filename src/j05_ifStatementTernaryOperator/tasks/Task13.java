package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("lütfen bir sayı daha giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("lütfen bu sayılarla yapmak istediğiniz işlemi seçiniz:  (+, -, *, /) ");
        char islem = scan.next().charAt(0);
        int sonuc = 0;
        if (islem == '+'){
            System.out.println(sonuc = sayi1 + sayi2);
        }else if (islem == '-'){
            System.out.println(sonuc = sayi1 - sayi2);
        }else if (islem == '*'){
            System.out.println(sonuc = sayi1 * sayi2);
        }else if (islem == '/'){
            System.out.println(sonuc = sayi1 / sayi2);
        }else System.out.println("hata!");

    }
}
