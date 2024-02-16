package j02_DataType_WrapperClass;

public class C02_DataTypes {
    /*
         Java'da  2 farkli data type tanımlanır.
         1)Primitive Data Type (8 tane)
           a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar
           b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
                her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
                char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.
           c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
                byte variable -> memory'de 8 bitlik alan kaplar.
           d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
                short variable -> memory'de 16 bıt alan kaplar.
           e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
                int variable -> memory'de 32 bit alan kaplar.
           f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
                long variable -> memory'de 64 bit alan kaplar.
           g)float : ondalikli sayilar icin kullanilır.
                float variable -> memory'de 32 bit kullanir.
                float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
                0.1234567
                Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.
           h)double : ondalikli sayilar icin kullanılır.
                double variable -> memory'de 64 bit kullanir.
                double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
                0.1234567890123456
         2)Non-Primitive Data Type
            String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
         */
            /*
        1)Java'da iki turlu "memory" vardır.
            i)Stack Memory: -> gömlek cebi
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory: -> cüzdan
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference)
         Stack Memory'yde depolanır. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" çalışır.
     */
        /*
        PRIMITIVE DATA TYPE - NON-PRIMITIVE  DATA TYPE  FARKLARI...
        1)primitive'de tum harfler kucuk; non-primitive'de ilk harf buyuk kullanılır.
        2)primitive data typelarini Java olusturmustur, biz primitive data typelarini olusturamayiz.
        ama non-primitive data type larini Java programcilari tarafindan istenildigi kadar olusturulabilir.
        3)primitive data typelarin memoryde kapladigi yer degisirken; non-primitivelerin memoryde kapladigi yer hep aynidir
        4)primitive data typelarinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir.
        non-primitive'lerde ise degeri ve methodlari vardir.
        5)primitive 'ler renklenirken mavi renklenirken ; non-primitiveler renklenmez.Or: String siyah kalir
     */

    public static void main(String[] args) {
        //hap bilgi->bir variableye değer ataması yapılırken data type uygun değer veya value atanmalı aksi
        // taktirde CTE hatası alırız.

        String isim ="Can Yucel";
        String unvan= "Team Lead";
        int yaş=25;
        String yas= "25"; //stringde tırnaksız sayı yazarsak kabul etmez CTE hatası verir.
        double maas=40000;
        //double maas1="40000";  doubleyi string gibi "" yapamayız.CTE hatası verir.
         //int yas1= false; -> CTE hatası verir.
        boolean acemi=true;
        //boolean emekli= "true"; -> CTE hatası verir.
        char ch1= '$';
        char ch2= '&';
        String str = "";
        //char ch3= '';->CTE hatası verir.
        char ch4 = ' ';
        //char ch5 = ' a';CTE hatası verir.Tek karakterlidir char bosluk olunca iki karakter olur. hata verir.
// Task-> 1999 yılında doğan kisinin yasını print eden code create ediniz...
        int dt=1997;
        int bt=2024;
        System.out.println("yaş: "+(bt-dt));
        System.out.println(ch1+ch2);
        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplam farkını print ediniz
        double a =20;
        int b=20;
        System.out.println(a+b);
        System.out.println(a-b);

        //Task -> tamsayı ve ondalıklı sayı tanımlayıp toplam  print ediniz
        double d =20.8;
        int e=20;
        System.out.println(d+e);
        System.out.println(d-e);
        int x = 20;
        double y = 20;
        float z = (float) (x + y);
        //Task -> tamsayı ve char data type iki variable  tanımlayıp toplam  print ediniz
        int f=20;
        char g='a';
        System.out.println(f+g);//gidip ascii tablosundaki değerini alır gelir toplanır.
        // Task -> ad ve soyadınızı ve yasınızı print ediniz.
        String ad="sema ";
        String soyad="özdemir ";
        int yası=27 ;
        System.out.println(ad+soyad+yası);
    }
}
