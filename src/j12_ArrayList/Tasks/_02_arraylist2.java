package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(sayilar1);
        System.out.println("getSum(sayilar1) = " + getSum(sayilar1));

    }

    private static int getSum(List<Integer> arrayList) {

        int toplam = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            toplam += arrayList.get(i);
        }
        return toplam;

    }
}
