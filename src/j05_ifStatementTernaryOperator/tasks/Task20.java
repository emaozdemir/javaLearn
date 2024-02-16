package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task20 {
    /*
    etkinlik öneren program
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Etkinlik önerme programına hosgeldiğiniz..\nLütfen sıcaklık derecesini giriniz: ");
        int sicaklik = sc.nextInt();
        if (sicaklik<5) {
            System.out.println("Kayak");
        }else if (sicaklik>= 5 && sicaklik<15) {
            System.out.println("Sinema");
        }else if (sicaklik>= 15 && sicaklik<=25){
            System.out.println("Piknik");
        }else System.out.println("yüzme");

    }
}
