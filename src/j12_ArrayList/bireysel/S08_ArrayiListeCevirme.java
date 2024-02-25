package j12_ArrayList.bireysel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S08_ArrayiListeCevirme {
    public static void main(String[] args) {
        Integer []arr={14, 19, 5, 21, 9};//Integer yazan yerde normalde int yazarız.ama 3.yöntemi kullanmamız içinbuyutmemiz gerekir.
        //bu arrayi 3 sekilde list e cevirebiliriz

        //1. loop ile;

        List<Integer>sayilar1=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar1.add(arr[i]);
        }
        System.out.println(sayilar1);//[14, 19, 5, 21, 9]
        sayilar1.add(10);
        sayilar1.remove(0);
        System.out.println(sayilar1);//[19, 5, 21, 9, 10]

        //2.yöntem arr deki degerleri direk list olarak olusturabilirim;

        List<Integer>sayilar2=new ArrayList<>(Arrays.asList(14, 19, 5, 21, 9,22,33));
        System.out.println(sayilar2);//[14, 19, 5, 21, 9, 22, 33]
        sayilar2.add(20);
        sayilar2.remove(1);
        System.out.println(sayilar2);//[14, 5, 21, 9, 22, 33, 20]

        //3yöntem direk arryi liste cevirebiliriz;ancak bu yöntemin 2 buyuk yan etkisi var;
        //ekleme silme gibi metotlar kullanilamaz.
        //bu yöntemle atama yapıldıgında java arrayla Listi ilişkilendirir.birinde yapilan değişiklik
        // otomatik olarak ötekine de islenir.

        List<Integer>sayilar3=Arrays.asList(arr);
        System.out.println(sayilar3);//[14, 19, 5, 21, 9]
       // sayilar3.add(30);//UnsupportedOperationException
       // sayilar3.remove(2);//UnsupportedOperationException
      //  System.out.println(sayilar3);//UnsupportedOperationException

        //arr in ilk elemanin degerini 20 yapalim;
        arr[0]=20;
        System.out.println("arrayde değişiklik yaptıktan sonra sayilar3: "+sayilar3);//[20, 19, 5, 21, 9]
        //listeye atama yapmasakta arrye yapinca burda da yapılmıs oluyor o yuzden bu yöntem tercih edilmiyor.



    }
}
