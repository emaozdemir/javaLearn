package j02_DataType_WrapperClass;

public class C04_WrapperClass {
    /*
       Note: Java primitive lere method'lar ekleyerek yeni bir
             yapi olusturdu, bu yapiya "Wrapper Class"
             Primitive         Wrapper
                byte     ==>    Byte
                short    ==>    Short
                ** int   ==>    Integer
                long     ==>    Long
                float    ==>    Float
                double   ==>    Double
                boolean  ==>    Boolean
                ** char  ==>    Character
    */
    public static void main(String[] args) {
        /*
        Java da bir degiskenin data type için getClass() metodunu ile veriyoruz.bu meth o nesne(obj)
        hangi classtan üretildiyse onu verir.
         */
        String str="JavaCAN";
        int yas=45;
        double pi=3.14;
        System.out.println(str.getClass());//class java.lang.String
        //System.out.println(yas.getClass());//CTE yas primitive oldugu için classı yoktur.
        //System.out.println(pi.getClass());//CTE yas primitive oldugu için classı yoktur

        /*
        Integer.valueOf(yas) veya Double.valueOf(pi) ifadeleri kullanılarak ilkel veri tipleri
        Wrapper clasa donusturulur getClass meth.kullanılabilir.
         */

        String isim="Safvet";
        System.out.println("isim= "+ isim);
        System.out.println("isim.toUpperCase()= "+ isim.toUpperCase());

        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
ancak primitive data turlerinin boyle bir ozelligi yoktur
primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
ara çözüm imkanı sunmuştur.
         */
        // task-> id ve tc String değerlerini toplamını print code create ediniz..
        String id="123456789";
        String tc="123456789";
        System.out.println(id+tc);//123456789123456789
        Integer yeniID=Integer.valueOf(id);// string olan ıd integera cevrildi.
        System.out.println("yeniID = " + yeniID);
        Integer yeniTC=Integer.valueOf(tc);// string olan tc integera cevrildi.
        System.out.println("yeniTC = " + yeniTC);
        System.out.println("Toplam = "+(yeniID+yeniTC));

        String okulNo="3435a";
        //int okulNosu=3435a;CTE hatası.
        //int yeniOkulNo=Integer.parseInt(okulNo);//okulNo integere atandı.ama Run time Exception(RTE)
        //System.out.println(yeniOkulNo);

        // task-> byte short int data type max ve min değerlerini print eden code create ediniz.
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short sMaxDeger=Short.MAX_VALUE;
        short sMinDeger=Short.MIN_VALUE;
        System.out.println("sMaxDeger = " + sMaxDeger);
        System.out.println("sMinDeger = " + sMinDeger);

        int iMaxDeger=Integer.MAX_VALUE;
        int iMinDeger=Integer.MIN_VALUE;
        System.out.println("iMaxDeger = " + iMaxDeger);
        System.out.println("iMinDeger = " + iMinDeger);





        String num= "12345";
        System.out.println(Integer.parseInt(num));





    }
}
