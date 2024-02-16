package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print eden code create ediniz
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("günde kaç saat uyuduğunuzu giriniz = ");
        double saat = sc.nextDouble();
        System.out.println("1 ayda : "+ (saat*30)/24 + " gün");

        System.out.println("1 Yılda: "+(saat*365)/24 +" gün");

        System.out.println("40 yılda : "+(((saat*365)/24)*40) +" gün");


        /*System.out.println("Gunde kac saat uyuyorsunuz?: ");
        int saat = scan.nextInt();

        int ayda = (saat * 30)/24;
        int yilda = (saat * 365)/24;
        int kirkYilda = ((saat * 365 * 40)/24);

        System.out.println("Ayda " + ayda + ", yilda " + yilda + ", kirk yilda " + kirkYilda + " gununuz uykuda geciyor.");*/




    }
}
