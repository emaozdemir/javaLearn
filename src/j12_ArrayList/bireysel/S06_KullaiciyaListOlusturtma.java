package j12_ArrayList.bireysel;

import java.util.List;
import java.util.Scanner;

public class S06_KullaiciyaListOlusturtma {
    public static void main(String[] args) {
        //kullanicidan istediği kadar isimi alarak bir list olusturun liste girişini bitirmek için q ya basmalı.
        //kullanicidan listeyi aldıktan sonra kullaniciya istemediği harfi sorun.
        //kullanici 1 harften uzun bir metin girerse hata mesaji verip yeniden harf isteyin
        //listede kullanicinin girdiği harfi buyuk veya kucuk harf olarak barindıran tum islemleri silip
        //kalan listei kaydedin.

        List<String> isimler = S04_KullaniciyaListeOlusturtma.isimListesiOlusur();

        Scanner scan = new Scanner(System.in);
        String istenmeyenHarf = "";
        while (istenmeyenHarf.length() != 1) {
            System.out.println("istenmeyen harfi hangisidir? ");
            istenmeyenHarf = scan.nextLine();
            if (istenmeyenHarf.length() != 1) {
                System.out.println("istenmeyen harf tek bir harf olmalıdır.tekrar deneyin.");
            }
        }
       isimler= S05_VerilenListedenIstenmeyenHarfisil.istenmeyenHarfTemizle(isimler,istenmeyenHarf.toLowerCase());

        isimler=S05_VerilenListedenIstenmeyenHarfisil.istenmeyenHarfTemizle(isimler,istenmeyenHarf.toUpperCase());

        System.out.println("listenin son hali "+isimler);



    }
}
