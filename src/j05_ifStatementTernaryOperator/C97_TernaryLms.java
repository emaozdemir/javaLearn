package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C97_TernaryLms {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sınav sonucunuzu giriniz: ");
        int not=scan.nextInt();
        String durum= " ";
        durum =not>50? "gecti" : "kaldı";
        System.out.println("durum = " + durum);

        System.out.println("**** ternary örneğidir*****");

        int sonuc= 40;
        String durum2="";
        durum2 =sonuc>50? "gecti" : "kaldı";
        System.out.println("durum2 = " + durum2);

        System.out.println("****nested ternary örneğidir****");
        // durum= not>50 ? () : (); bu sekildedir yazimi.
        int notum=40;
        String durum3 = "";
        durum3 = notum>50 ? (notum>70 ? "iyi" : "orta")  : ("kötü")  ;
        System.out.println("durum3 = " + durum3);

    }
}
