package j21_Scope;

public class C01_InstanceVariable {
    /*                                   INSTANCE VARIABLE

    1) Main method'un ve urettiginiz diger methodlarin disinda  (ustunde veya altinda), class'in icinde
        olusturulan variable'lara non-Static Class level "instance variable" denir.
    2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
    3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
        Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
        Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
            "yas" variable'i initialize edildi, digerleri initialize edilmedi.
    4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
                byte, short, int, long icin default value 0'dir.
                float, double --> default value 0.0'dir.
                char --> default value ' ''dir.
                boolean --> default value false'dur.
                String --> default value "null" dir.

*/
    static String kurs = "Clarusway";//initial edilmiş class variable

    static String prLanguage;//initial edilmemiş variable
    int yas = 49;//initial edilmiş obj variable->0

    String isim;//initial edilmiş obj variable->null
    boolean developer;//initial edilmiş obj variable->false
    double boy;//initial edilmiş obj variable->0.0
    char unvan;//initial edilmiş obj variable' '


    public static void main(String[] args) {
       // static int kg = 99;//class level haricinde main veya baska bir methodda static class variable olusturulamaz.->CTE
        int kg=99;//initial edilmiş local variable.
        int id;//initial edilmemiş local variable.
        //System.out.println("id = " + id);//initial edilmemis local variable herhangi bir actiona tabi tutulamaz->CTE
        id=100;//local variable deger atandi.
        System.out.println("id scope içinde doğrudan call edildi: "+id);//value atanan lokal variable scope içinde doğrudan aksiyona tabi tutulabilir.
        //System.out.println("yas : "+yas);//obj variable ;obj olmadan doğrudan call edilemez.
        prLanguage="Java";
        System.out.println("prLanguage static variable oldugu için obj olmadan doğrudan call edilebilir. "+prLanguage);
        statiMethod();//static meth;static oldugu için doğrudan call edildi.
        //nonStatiMethod();//non-static meth main içinde doğrudan call edilemez.
        C01_InstanceVariable obj1 =new C01_InstanceVariable();//obj create edildi.
        obj1.nonStatiMethod();//non-static meth obj yardımı ile call edildi.
        System.out.println("obj1.boy = " + obj1.boy);//instance variable obj yardımı ile call edildi.
        System.out.println("obj1.kurs = " + obj1.kurs);//bad practice->obj yardimi ile static variable call edildi.
       // obj.id//obj yardimiyla local variable call edilemez
        System.out.println("id = " + id);


    }

    public static void statiMethod() {
        System.out.println("static method run edildi.");
    }

    public void nonStatiMethod() {
        System.out.println("non-static method run edildi.");
    }
}
