package j10_MethodCreation.bireysel;

public class S05_IsmiDuzenlekaydet {

    public static void main(String[] args) {
       /*
        verilen isim soyisim ve kk numarasını asağidaki  formatta döndüren method olusturun.
        ornek : input ->Ali,Kayali,1234567890123456 ->output -> A**, K*****, **** **** ****  3456
         */
        String isim = "Ali";
        String soyisim = "Kayali";
        String kkNo = "1234567890123456";

        String duzenlenmisHali = "";
        ismiDuzenleKaydet(isim, soyisim, kkNo);
        //15 satirda yani yukarıdaki method calısır ve duzenlenmıs halini bize getirir.
        // ama bu duzenlenmis halini ya kaydetmeli yada direk yazdırmalıyız yoksa calısır ve hiçbişey olmamıs sanırız .
        //ya soutla yzdrırız;
        System.out.println("ismiDuzenleKaydet(isim,soyisim,kkNo) = " + ismiDuzenleKaydet(isim, soyisim, kkNo));

        // duzenlenmis haldeki tum * ları # yapın :  // yani asağıda yazdırarak gördük ki biz Ali yi atama yapıp değiştirmedik sadece soutla yukarıda  yazdırdık
        System.out.println("isim = " + isim);  // yıldızları görebildik ama sadece o soutta . şuan Ali hala Ali * olmadıkaydet yapmak içinn asağıdaki gibi ->

        duzenlenmisHali = ismiDuzenleKaydet(isim, soyisim, kkNo);
        System.out.println("duzenlenmisHali = " + duzenlenmisHali);

        duzenlenmisHali = duzenlenmisHali.replace("*", "#"); // İŞTE ŞİMDİ * LAR # OLUR HATTA BU SEKİLDE KAYDETMİŞ OLDUK = YAPARAK.
        System.out.println("duzenlenmisHali = " + duzenlenmisHali);


    }

    public static String ismiDuzenleKaydet(String isim, String soyisim, String kkNo) {
        String duzenlenmisHali = isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w", "*") +
                soyisim.toUpperCase().charAt(0) + soyisim.substring(1).replaceAll("\\w", "*") +
                ",**** **** **** " + kkNo.substring(kkNo.length() - 4);
        return duzenlenmisHali;


    }


}
