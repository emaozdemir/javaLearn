package j20_StaticKeyword.Task02;

public class Runner {
    /*
    Task 02 ->
     ElektirikHesap Class:  fields : toplamTuketim(int), oran(double),
     fatura(double)

    Müşteriye ait tüketilen enerjiyi toplamTuketim'e
     toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak
     fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası
     print eden code create ediniz

     */


    public static void main(String[] args) {
        Musteri musteriObjesi=new Musteri();
        musteriObjesi.name="sema";
        ElektrikHesabi hesap=new ElektrikHesabi();
        musteriObjesi.elektrikHesabi=hesap;
        musteriObjesi.elektrikHesabi.tuketimEkle(100);
        musteriObjesi.elektrikHesabi.tuketimEkle(150);
        System.out.println("toplam tuketim : "+musteriObjesi.elektrikHesabi.toplamTuketim);
        System.out.println("odenecek miktar : "+musteriObjesi.elektrikHesabi.odenecekTutar());//1 yöntem cagırma
        System.out.println("odenecek miktar : "+musteriObjesi.elektrikHesabi.fatura);//2 yöntem cagırma
        System.out.println("musteriObjesi = " + musteriObjesi);

        Musteri obj2=new Musteri();
        obj2.name="Safvet bey";
        obj2.elektrikHesabi=new ElektrikHesabi();
        obj2.elektrikHesabi.tuketimEkle(250);
        obj2.elektrikHesabi.tuketimEkle(200);
        obj2.elektrikHesabi.odenecekTutar();
        System.out.println("obj2 = " + obj2);


    }
}
