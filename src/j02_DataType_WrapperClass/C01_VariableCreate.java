package j02_DataType_WrapperClass;

public class C01_VariableCreate {
    /*Variable
 bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
 Variable icinde deger saklayan bir container'dir
 bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
*** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
*/
    public static void main(String[] args) {
        //variable create(değişken oluşturma) için ...
        //1- data type(değişken türü)...2- variable name(değişken ismi)...3-'='  variable value (değişken değeri);
           int                                selimYas                  = 35;//memory de int type selimYas isminde 35 değerinde bir variable oluştu.
        //declaration(tanımlama)                                                   =assagnment(atama);

        //1.yol ->best practice(recommended ->tavsiye edilen)
        int yas = 33;
        int maas=100000;
        System.out.println(yas);
        System.out.println("yas");

        System.out.println("selimYas = " + selimYas);
        System.out.println("Yucel bey maas = " + maas);

        //2.yol
        int boy;//int data type boy adında bir variable  oluşturuldu. ->declaration.
        //system.out.println(boy);
        boy = 190;//öncesinde declare edilen variableye değer ataması (assaigment)yapıldı.
        System.out.println(boy);
        //3.yol
        int yevmiye,kilo,tecrübe;//birden cok ayni türden variable declaration edildi.
        yevmiye = 400;
        kilo = 90;
        tecrübe = 7;//öncesinde declare edilen variableye değer ataması (assaigment)yapıldı.
        //cincix kod
        int gunluk=550,agırlık=88,experiance=10;//birden cok aynı turde variable tanımlandı=>declarion ve değer atandi.
        System.out.println("gunluk = "+gunluk+ " agirlik = "+ agırlık+" tecrube = "+experiance);

        //hata-> oncesinden tanımlanmıs bir variable tekrar tanımlanamaz.->CTE
        // int yas=58;//CTE ->alreadey exists daha once tanimlanmis
        //yas=58;//tanimlanmis olan bir varible yeniden deger atamasi yapildi -> deger degisti
        //
    }
}
