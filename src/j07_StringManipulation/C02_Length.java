package j07_StringManipulation;

public class C02_Length {
    /*
length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
butun karakterleri(boşluk vs) sayıp adedini verir.
 */
    public static void main(String[] args) {
        String str1="Hayattan bir saat calmak :)";
        System.out.println("str1.length() = " + str1.length());//27
        String str2= " ";
        System.out.println("str2.length() = " + str2.length());//1
        String str3= "";
        System.out.println("str3.length() = " + str3.length());//0
        String str4= null;
        //System.out.println("str4.length() = " + str4.length());//1 //RTE->para var ama ekmek yok.
        //CET ->PARA YOK
        System.out.println("geldin mi sözüme");//RTE hatası verdi üst kodda o yüzden yazdırmaz kendisinde sonrakini yazdırmaz.

        /*
        hap Bilgi-> null atanan String variable herhangi bir methodu call etmez.
        null-> case sensitive NULL != null !=Null
        null->dutluk:arsa değeri olmayan arazi sadece hiçliği gösteren pointer(işaretci)
         */
        String str5;//tanımlanmıs ama değer atanmamıs bos variable kutu
        //System.out.println("str5 = " + str5);//CTE ->değer atanmamıs variable hiçbir aksiyona tabi tutulamaz.


    }

}
