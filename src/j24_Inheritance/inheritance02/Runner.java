package j24_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
        //data type    obj =  const
        Kedi           k1 = new Kedi();//kedi class data type obj create edildi.
        System.out.println("k1.a = " + k1.a);//0
        System.out.println("k1.c = " + k1.c);//2
        System.out.println("k1.d = " + k1.d);//7
        System.out.println("k1.m = " + k1.m);//1

        Memeliler k2 = new Kedi("beyaz");
        System.out.println("k2.a = " + k2.a);//0
        System.out.println("k2.c = " + k2.c);//4
        // System.out.println("k2.d = " + k2.d);//CTE datatype memeliler classda ve parent(hayvanlar) d variable tanımlı olmadıgı için
        System.out.println("k2.m = " + k2.m);//1

        Hayvalar k3 = new Kedi("poncik");//hayvanlar datatype den obje create edildi new kedide variable değil method varsa meth e ulasırdık
        System.out.println("k3.a = " + k3.a);//0
        System.out.println("k3.m = " + k3.m);//3
        // System.out.println("k3.c = " + k3.c);//CTE datatype memeliler classda ve parent(hayvanlar) d variable tanımlı olmadıgı için
        //  System.out.println("k3.d = " + k3.d);//CTE datatype memeliler classda ve parent(hayvanlar) d variable tanımlı olmadıgı için

        /*
      Ahan da trick köşesinde böğün->inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
      Variable araştırmaya data type Class'dan başlanıp parentlere gidilir.
*/


    }
}
