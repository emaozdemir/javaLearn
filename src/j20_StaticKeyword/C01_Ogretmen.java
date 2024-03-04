package j20_StaticKeyword;

public class C01_Ogretmen {
    /*
    => Class'in icinde methodlarin disinda olusturulan variable'lara "instance variable" denir.
    => Class'in icinde methodlarin disinda olusturulan static variable'lara "Class variable" denir.
    => Instance variable'lar gibi Class variable(Static variable)'lar initial edilmezse(ilk değere ataması) default value ataması yapılır
    => Static variable'lar call etmek  icin object olusturmaya gerek yoktur.
    => Bulunduğu  class icinden static yapılara  ulasilabilir.Farklı class'lardan ClassName.staticYapı class name ile call edilir.
         farklı class'da obj name ile değil class name ile call edilir.
    => Instance variable(Object Variable)'lar call etmek icin object create edilmesi zorunludur.Object olusturmadan
       instance variable'a ulasilamaz.
    => Static variable'lara object ile call edilebilir ama tavsiye edilmez.
    => Eger static variable'lara object ile call edilirse Java  sari alt cizgi ikaz eder->.BAD PRACTICE
    =>  static keyword hafıza opt. için kullanılır ve memory'de 1 kez oluşturulur

         bir obj static variable değeri değişirse tüm obj variable değeri değişir
         static obj den bağımsızdır class'a bağımlı Class'ın malıdır.

         Trick-> bir variable, methoda doğrudan calss name ile obj olmadan call etmek için static olmalıdır..
*/
    //fields variable (diğer ayni isimleri ->obj variable ve instance variable )

    String isim;
    int tecrube;
    //class variable -> static variable
    static String okulIsmi = "Sivas Lisesi";

    public C01_Ogretmen(String isim, int tecrube) {//full p'li const.
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public static void maasHesapla() {//static meth
        System.out.println("Maasın hayırlı olsun ilk maasin ile ne ismarliyorsun.");
    }

    public void evlilikTebrikEt() {
        System.out.println("baska derdin mi yoktu arkadasım.");
    }

    public C01_Ogretmen() {
    }
}
