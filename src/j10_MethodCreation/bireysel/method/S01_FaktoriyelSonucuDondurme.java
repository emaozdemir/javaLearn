package j10_MethodCreation.bireysel.method;

import j10_MethodCreation.bireysel.S02_TamBolenSayisiniYazdiran;

public class S01_FaktoriyelSonucuDondurme {
    public static void main(String[] args) {
        //verilen pozitif bir tamsayinin faktoriyel değerini döndüren bir method olusturun.


        //10 sayisinin faktoriyel değerini hesaplayın
        // buldugunuz sonucun kaç tane pozitif tam böleni oldugunu yazdirin.
        int onFaktoriyel = faktoriyelHesapla(10);// soru bizden 10 nun faktöriyel,ini görmek istememiş onun bölenlerinin adedini görmek istemiş.
        S02_TamBolenSayisiniYazdiran.tamBolenSayisi(onFaktoriyel);




    }

    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;

        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;
        }
        return faktoriyel;

    }

}
