package j21_Scope;

public class C02_StaticVariable {
    static String firmaIsim = "clarusway";//initial edilmiş static variable
    static int firmaId;//initial edilmemiş variable
    static boolean firmaIt;//initial edilmemiş variable

    public static void main(String[] args) {
        /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
   ogrenci notlari veya ogretmen branslari gibi bir objeye ait bir variable'in son degerini
    bulmak icin sadece o objeyi dikkate alınır

  Static variabler ise class variable olarak tanimlanir
  ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
  eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

*/
        System.out.println("firmaIt = " + firmaIt);//static variable doğrudan call edildi.
        firmaIt = true;//static variable value atandı.
        System.out.println("firmaIt = " + firmaIt);//true
        System.out.println("C02_StaticVariable.firmaIsim = " + C02_StaticVariable.firmaIsim);//class name ile static variable call edildi.//clarusway
        staticMeth();
        System.out.println("C02_StaticVariable.firmaIsim = " + C02_StaticVariable.firmaIsim);//QA Tester
        // nonStaticMeth();//NON STATİC METH doğrudan call edilemez ->CTE
    }

    public static void staticMeth() {
        System.out.println("static meth run edildi..");
        firmaId = 1001;
        C02_StaticVariable obj = new C02_StaticVariable();
        obj.nonStaticMeth();//obj ile nonStatic meth static scope call edildi

    }

    public void nonStaticMeth() {
        firmaIsim = "QA Tester";//static variable nonStatic scopta doğrudan call edildi.
        System.out.println("non static meth run edildi.");
        //  staticMeth();//staticMeth nonstatic scope ta doğrudan call edilebilir.
    }
}
