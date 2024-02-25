package j12_ArrayList.bireysel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S05_VerilenListedenIstenmeyenHarfisil {
    public static void main(String[] args) {
        //verilen string bir listede istenmeyen harfi içeren isimleri silin task1
        //task2 verilen string bir listede istenmeyen harfi içeren isimleri silip son halini bize döndüren
        //bir method olusturun.

        List<String> isimler = new ArrayList<>(Arrays.asList("ali", "veli", "can", "kemal", "ayse", "cemre"));
        System.out.println(isimler);
        String istenmeyenHarf = "e";

   /*     for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i));//siler ve liste sola doğru kayar bu yuzden atlamalar olur indexlerde.
            }
        }
        System.out.println(isimler);//[ali, can, ayse]
*/
        //bu yuzden;
        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains(istenmeyenHarf)) {
                isimler.remove(isimler.get(i));//bu atlamaların önüne gecmek için;
                i--;//bunu yapmak zorundayızzz!!
            }
        }
        System.out.println(isimler);//[ali, can]
        //2.task;
        System.out.println("istenmeyenHarfTemizle(isimler,istenmeyenHarf) = " + istenmeyenHarfTemizle(isimler, istenmeyenHarf));
        System.out.println("istenmeyenHarfTemizle(isimler,\"s\") = " + istenmeyenHarfTemizle(isimler, "s"));


    }

    //task2;
    public static List<String> istenmeyenHarfTemizle(List<String> isimler, String istenmeyenHarf) {
        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains(istenmeyenHarf)) {
                isimler.remove(isimler.get(i));//bu atlamaların önüne gecmek için;
                i--;//bunu yapmak zorundayızzz!!

            }

        }
        return isimler;
    }
}
