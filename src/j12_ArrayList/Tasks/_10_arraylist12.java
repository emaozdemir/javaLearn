package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));
        int min = 20;
        int max = 30;
        rangeBtw(sayilar, min, max);
        System.out.println("rangeBtw(sayilar, min, max) = " + rangeBtw(sayilar, min, max));

    }

    private static int rangeBtw(List<Integer> list, int sayi1, int sayi2) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (sayi1 <= list.get(i) && sayi2 >= list.get(i)) {
                count++;
            }
        }
        return count;
    }
}