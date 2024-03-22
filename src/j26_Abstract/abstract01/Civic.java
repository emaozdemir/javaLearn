package j26_Abstract.abstract01;

public class Civic extends Lastik {//concrete child class. (grand parenttan gelecek)
    /*
  extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
  java CTE verdi
  çözüm:
  ya
  a) Unımplemented (uyarlanmamış) method implement edilmeli ya
  b)parent Honda class'dan abstarct keyword kaldırılmalı ya da
  c)concrete olan child Civic class abstract tanımlanmalı
*/


    //concrete child Class abs. meth tanımlanır mı? nayır nolamazzzz
    //public  abstract void absMeth();
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli


    @Override
    public void motor() {
        System.out.println("1.6 motor olsun");
    }

    @Override
    void koltuk() {
        System.out.println("biraz ucuz olsun kumas koltuk olsun");
    }

    @Override
    void kapi() {
        System.out.println("yavas kapat kapiyi");
    }

    @Override
    public void lastikEbat() {
        System.out.println("18 inc lastik yeterli");
    }

    //polymorphizim-> obj cok biçimlilik(farkli data type ve farkli const)
//    Civic obj=new Civic();//civic concrete child class data type
//    //Honda obj2=new Honda();// obje olusturamayız böyle
//    Honda obj2=new Civic();// //honda abs class data type obj

}
