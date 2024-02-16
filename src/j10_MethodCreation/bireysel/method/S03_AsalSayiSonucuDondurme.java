package j10_MethodCreation.bireysel.method;


import j10_MethodCreation.bireysel.S01_AsalClass;

import java.util.Scanner;

public class S03_AsalSayiSonucuDondurme {
    public static void main(String[] args) {
        //verilen sayi asal sayi ise true, değilse false donduren bir method olusturun.
        S01_AsalClass.asalSayiMi(20);//20 asal değil , kaydetmedik sadece yazdırdık eski methodlarımla

        System.out.println("isAsal(20) = " + isAsal(20));//false


    }

    public static boolean isAsal(int sayi) {
        boolean sonuc= false;

        for (int i = 2; i <= sayi; i++) {
            if (i == sayi) {
                sonuc=true;
            } else if (sayi % i == 0) {
               sonuc=false;
                break;
            }
        }
        return sonuc;

    }


}
