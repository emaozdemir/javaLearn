package j19_Constructor;

import j01_Variables.C01_HelloWorld;

public class C01_Constructor {//class level
    /*
N e D e N  --> OOP <--  k U l L a N ı L ı R...
 Nesne Yönelimli Programlamanın(oop) Faydaları
 1- Obj oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe imkan sağlar.
 2- Class'ların 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar ile çalıştırılabilir.
 3- Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
 4- Object'ler birbirinden bağımsız olduğundan data güvenliği konusunda avantaj sağlar.
 5- Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir Class'da değişiklik yapılıp tüm projelerde çalışması sağlanır.
Bu zaman kaybını büyük ölçüde azaltır.
 */
// fields-> obj variable => obj değerlerin aldıgı alan özellikler

    String str;//class levelde obj bariable (initial edilmemiş default deger alan) tanimlandi.

    String selam = "Herkese selamlar bolca offerlar";//class levalda obje variable (initial edilmiş) tanimlandi.
    //   C01_Constructor obj1 = new C01_Constructor();//class levalda parametresiz const create edildi.
    C01_HelloWorld obj99 = new C01_HelloWorld();//HARİCTEN BİR PARAMETRESİZ BİR OBJ CREATE EDİLDİ.
    /*
    1- consturctor ismi Calss name ile aynı olmalı.Cons. name Buyuk harf ile başlamalı
    2- constructor create edilirken name den sonra () {} mutlaka kullanılmalı.
    3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
    4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
    5- Class tanımlandığında java default(p'siz) cons. kendi create eder.
    6- Fields-> obj'nin uretilirken alacagı değer instance variables
    7- bir class'da bir den çok cons. tanımlanabilir.
     */


    public static void main(String[] args) {//main level
        String maindekiVariable = "mainden selamlar";//main scope ta variable create edildi.
        //classIsmi     objName=new keywordle constructor call -> obj create etmek için.
        C01_Constructor obj1 = new C01_Constructor();//FARKLI SCOPETA AYNİ İSİMDE OBJ CREATE EDİLDİ.
        //C01_Constructor obj1=new C01_Constructor();//Ayni scopta ayni isimde obje create edilemez.
        C01_Constructor obj2 = new C01_Constructor();//Ayni scopta farkli isimde istenilen kadar obje create edilebilir.
        C01_Constructor obj3 = new C01_Constructor();

        obj1.str = "JavaNazz";
        obj3.str = "JavaHAN";
        //maindekiVariable main içinde oldugu için obj olmadan cağırılabilir.
        //selam -> class levelda olan bir variable obj olmadan cağırılamaz.

        obj2.selam = "devam edelim";
        System.out.println("obj1.selam = " + obj1.selam);//Herkese selamlar bolca offerlar
        System.out.println("obj2.str = " + obj2.str);//null
        System.out.println("obj2.selam = " + obj2.selam);//devam edelim
        System.out.println("obj3.str = " + obj3.str);//JavaHAN

        staticMeth();//gunes olan her gezegene erisebilen meth call edildi.
        //nonStaticMeth obj yardimi olmadan static olan methlarda call edilemez.
        obj3.nonStaticMeth();//obj ile nonStaticMeth call edildi.

    }//main sonu

    private static void staticMeth() {//parametresiz static(gunes -> her gezegene erisebilir)meth
        System.out.println("Static meth'den selamlar");
    }

    public void nonStaticMeth() {
        System.out.println("NonStatic meth'ten selamlar");
    }


}//class sonu
