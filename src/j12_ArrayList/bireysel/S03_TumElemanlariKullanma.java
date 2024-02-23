package j12_ArrayList.bireysel;

import java.util.ArrayList;

public class S03_TumElemanlariKullanma {
    public static void main(String[] args) {
        //her defasinda add ile eklemek yerine;bir array olusturup sonra for loopla olusturdugumuz
        // bos bir ArrayList e atayabiliriz.

        int[] arr = {10, 20, 30, 40, 50, 60, 7, 27, 15, 3, 1};
        ArrayList<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);

        //sayilar listesindeki elemanları toplayıp yazdirin;
        int toplam = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam += sayilar.get(i);
        }
        System.out.println("toplamTek = " + toplam);

        //listedeki cift sayi adedini yazdirin.
        int count = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i) % 2 == 0) {
                count++;
            }
        }
        System.out.println("cift sayilarin adedi = " + count);

        //listedeki tek sayilarin ortalamasını ondalikli olarak yazin;
        double toplamTek = 0;
        int sayac = 0;
        double ort;
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i) % 2 != 0) {
                toplamTek += sayilar.get(i);
                sayac++;
            }
        }
        ort = toplamTek / sayac;
        System.out.println("toplamTek = " + toplamTek);
        System.out.println(sayac);
        System.out.println("ortalama = " + ort);

        //listedeki 5 ten kucuk sayıların carpimini yazin;
        int carpim = 1;
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i) < 5) {
                carpim *= sayilar.get(i);

            }
        }
        System.out.println(carpim);


    }
}
