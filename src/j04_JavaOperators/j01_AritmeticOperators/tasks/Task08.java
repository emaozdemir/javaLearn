package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*Task->
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("saniye giriniz: ");
        int saniye =scan.nextInt();

        int saat = saniye / 3600;
        int dakika = (saniye % 3600);
        int saniye2 = dakika / 60;
        int saniye3 = dakika % 60;
        System.out.println(saniye + " ->" + saat + " saat " + dakika + " dakika " + saniye3 + " saniye");





    }
}
