package j25_Exceptions;
import java.util.Date;
public class C11_CheckMemory {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("total memory = "+rt.totalMemory());
        System.out.println("loop oncesi free memory = "+rt.freeMemory());
        Date dt=null;
        for (int i = 0; i <100 ; i++) {//obj create eden loop tanimlandi-> memory yuklemesi yapildi
            dt=new Date(i);//1000 adet obj create edildi
            dt=null;

        }
        System.out.println("rt.freeMemory() = " + rt.freeMemory());
        rt.gc();//rt obj ile garbege collector JVM de silmesi için gc() meth call edildi.
        System.out.println("gc (silme) sonrasi free Memory = " + rt.freeMemory());
        // GC tum olusturalan objeleri silmeyi garanti etmedigi icin After GC Free Memory farkliliklar gosterebilir.

    }

}
