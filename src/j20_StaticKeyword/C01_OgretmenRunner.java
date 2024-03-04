package j20_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
        C01_Ogretmen t1 = new C01_Ogretmen("Sema",11);
        System.out.println("t1.isim = " + t1.isim);//obj ile instance variable call edildi->Sema
        System.out.println("t1.tecrube = " + t1.tecrube);//obj ile instance variable call edildi->11
        t1.evlilikTebrikEt();//obj ile non static meth call edildi->baska derdin mi yoktu arkadasım.
        t1.maasHesapla();//obj ile static meth call edildi -> BAD PRACTİCE->Maasın hayırlı olsun ilk maasin ile ne ismarliyorsun.
        C01_Ogretmen.maasHesapla();//Classname ile static meth call edildi.->Maasın hayırlı olsun ilk maasin ile ne ismarliyorsun.
        System.out.println("C01_Ogretmen.okulIsmi = " + C01_Ogretmen.okulIsmi);//CLASSNAME ile static variable call edildi->Sivas Lisesi
        C01_Ogretmen.okulIsmi="Sivas Anadolu Lisesi";//classname ile static variable update edildi.
        System.out.println("C01_Ogretmen.okulIsmi = " + C01_Ogretmen.okulIsmi);//Sivas Anadolu Lisesi
        C01_Ogretmen t2=new C01_Ogretmen("Merve",13);
        System.out.println("t2.tecrube = " + t2.tecrube);//13
        System.out.println("t2.isim = " + t2.isim);//Merve
        System.out.println("t2.okulIsmi = " + t2.okulIsmi);//Sivas Anadolu Lisesi
        C01_Ogretmen t3=new C01_Ogretmen();
        System.out.println("t3.isim = " + t3.isim);//null
        System.out.println("t3.tecrube = " + t3.tecrube);//0

    }
}
