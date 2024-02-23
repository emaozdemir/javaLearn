package j12_ArrayList.bireysel;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class S04_ArraydenTekrarEdenSayilariSilmek {
    public static void main(String[] args) {
        /*
        verilen bir arraydeki tekrar eden sayilari silip arrayi unique sayilardan olusan bir
        array haline getiren bir code create ediniz.
        {3, 4, 5, 6, 7, 8, 9, 1,3, 2, 4, 5, 6, 7, 8, 9, 1,3, 2, 4}
        silip ekleme arrayde kolay olmadıgı için bos list olusturup kullanacağız.
         */
        int[] sayilar = {3, 4, 5, 6, 7, 8, 9, 1, 3, 2, 4, 5, 6, 7, 8, 9, 1, 3, 2, 4};

        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            if (!tekrarsizList.contains(sayilar[i])) {
                tekrarsizList.add(sayilar[i]);
            }
        }
        System.out.println(tekrarsizList); //şimdi uniqleştirdik bu listti arraye atmamız lazım;[3, 4, 5, 6, 7, 8, 9, 1, 2]

        sayilar=new int[tekrarsizList.size()];//[0,0,0,0,0,0,0,0,0]
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=tekrarsizList.get(i);
        }
        System.out.println(Arrays.toString(sayilar)); //[3, 4, 5, 6, 7, 8, 9, 1, 2]


    }
}
