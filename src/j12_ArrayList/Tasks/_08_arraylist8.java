package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(5,3,4,6,7));
        System.out.println("secondMax(sayilar) = " + secondMax(sayilar));

    }

    private static int secondMax(List<Integer> yeniList) {
        Collections.sort(yeniList);
        Collections.reverse(yeniList);
        System.out.println(yeniList);
        int ikinciBuyuk=yeniList.get(1);
        return ikinciBuyuk;

    }
}
