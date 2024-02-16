package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task19 {

    /*
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        int yil = sc.nextInt();
        if (yil % 12 == 0) {
            System.out.println("Maymun");
        }else if (yil % 12 == 1) {
            System.out.println("Horoz");
        }else if (yil % 12 ==2){
            System.out.println("köpek");
        }else if (yil % 12 == 3){
            System.out.println("domuz");
        }else if (yil % 12 == 4){
            System.out.println("fare");
        }else if (yil % 12 == 5){
            System.out.println("öküz");
        } else if (yil % 12 == 6) {
            System.out.println("kaplan");
        }else if (yil % 12 == 7) {
            System.out.println("tavşan");
        }else if (yil % 12 == 8) {
            System.out.println("ejderha");
        }else if (yil % 12 == 9) {
            System.out.println("yılan");
        } else if (yil % 12 == 10) {
            System.out.println("at");
        }else if (yil % 12 == 11) {
            System.out.println("koyun");
        }else System.out.println("hata! tekrar deneyiniz");


    }
}
