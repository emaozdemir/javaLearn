package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
      /*
       Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
       Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir.
       Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur.
        */

    public static void main(String[] args) {
        // Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.
        Scanner scan = new Scanner(System.in);

        System.out.println("Tamsayı giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.println("****If else ile****");
        if (sayi1%2==0){
            System.out.println(sayi1+" sayisi CIFT");
        }else {
            System.out.println(sayi1+" sayisi TEK");
        }

        System.out.println("****Ternary ile*****");
        // condition(şart)  ? (if-ise) sart True için ACTION-> if body : (else-değilse) sart False için ACTION -> else body;
//        String sonuc=sayi1%2==0?sayi1+" sayisi CIFT":sayi1+" sayisi TEK";
//        System.out.println(sonuc);
        System.out.println(sayi1%2==0 ? "çift" : "tek");
        System.out.println(sayi1%2==0 ? sayi1+" sayisi CIFT": sayi1+  "sayisi TEK");//bu sekilde içine metin de yazabiliriz.


        System.out.println("Task02");
        // Task02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.
        System.out.println("Bir sayi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println(sayi2>0? "pozitif" : "negatif");

        /*
        trick: ternary operator action sonucu true veya false  göre verecği output(çıktı) eğer
        data type uygun bir variable(container->kutu) a atnamzsa CTE verir.
        Çözüm olarak teranry çıktısı ya bir variable atanmalaı yada sout gibi doğrudan bir action'da kullanılmalı
         */

        System.out.println("Task03");
        // Task03-> girilen iki tamsayının buyugunu print eden code create ediniz.
        System.out.println("Buyuk sayi = "+(sayi1>sayi2?sayi1:sayi2));

        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.
        Object sonuc = sayi1*sayi2<0 ? sayi1+sayi2 : "Agam DEVAMKEEE";
        System.out.println("sonuc = " + sonuc);
        //hap bilgi -> Ternary ciktisi farkli data type'lardan(int,String,boolean vb) tanimlanmissa
        //tum data type atasi olan Hz.Adem classina(Object) atanir









    }

}
