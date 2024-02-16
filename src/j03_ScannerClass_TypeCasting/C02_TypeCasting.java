package j03_ScannerClass_TypeCasting;

public class C02_TypeCasting {
    /*
       Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                     byte < short < int < long < float < double
       Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
       Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
   */
    public static void main(String[] args) {

        boolean basarili =true;
        System.out.println("basarili="+ basarili);
        //String success=basarili; doğal uyum olmadığı için CTE.
        String success=String.valueOf(basarili);//Warepper class
        System.out.println("success="+ success);

        double sayı1=49;
        System.out.println("sayı1="+ sayı1);//AW->49.0

        int sayı2=74;
        int sayı3=12;
        double sonuc= sayı2 / sayı3;
        System.out.println("sonuc= "+ sonuc);

        byte b =15;
        int num= b;
        System.out.println("num= "+num);
        int i=1453;
        double d=i;
        System.out.println("d= "+d);
        double d1=d/sayı2;
        System.out.println("d1= "+d1);
        // HAP BİLGİ iki farklı data type isleme girerse AW(kucuk data buyuk dataya casting(cevrilir).
        // veri kaybını önlemek için.

        double d2=14.53;
        System.out.println("d2= "+d2);

        //int num2=d2;//Expc. narrow->B-->K
        int num2= (int) d2;
        System.out.println("num2= "+num2);

        double d3=571.622;

        System.out.println("d3= "+d3);
        long l=(long) d3;
        System.out.println("l= "+l);

        int num3= 129;

        byte b2= (byte) num3;
        System.out.println("b2= "+b2);







        /*double a =22.4;
        int sayi = (int) a;
        System.out.println(sayi);

        short b = 22;
        long sayi1 = b;
        System.out.println(sayi1);

        int c = 128;
        byte d = (byte) c;  //(-128 -> 127)
        System.out.println(d);

        byte e = (byte) 140;
        System.out.println(e);*/


    }


}
