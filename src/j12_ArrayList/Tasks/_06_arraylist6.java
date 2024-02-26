package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer> sayilar1 = new ArrayList<>(Arrays.asList(5,4,6,2,1));
        System.out.println(sayilar1);
        int sayi=hillNum(sayilar1);
        System.out.println(sayi);

    }

    private static int hillNum(ArrayList<Integer> arrList ) {
        int ozelSayi=0;

        for (int i = 1; i <arrList.size()-1 ; i++) {
            if((arrList.get(i)< arrList.get(i-1)) && (arrList.get(i)>arrList.get(i+1))){
               ozelSayi=arrList.get(i);
            }

        }
        return ozelSayi;


    }

}
