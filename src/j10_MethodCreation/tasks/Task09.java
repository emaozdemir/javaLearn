package j10_MethodCreation.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task09 {


    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz
    */
        double saniye = saat();
        System.out.println(saniye);
    }//main sonu

    private static double saatSaniyeCevir(double saat) {
        return saat * 3600;
    }

    public static double saat() {

        Scanner scan = new Scanner(System.in);
        System.out.println("kaç saati saniyeye cevirmek istiyorsunuz ? ");
        double girilenSaat = scan.nextInt();
        double saniye = saatSaniyeCevir(girilenSaat);
        return saniye;

    }

}// Class sonu
