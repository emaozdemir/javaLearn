package j13_ForEachLoop.bireysel;

import java.util.ArrayList;
import java.util.List;

public class S03_KelimeleriDuzenle {
    public static void main(String[] args) {
        /*
        verilen string arraydeki her bir elementi kontrol edip,
        kelimenin uzunlugu cift sayi ise ilk yarisini,-kelimenin uzunlugu tek sayi ise
        ortadahi harf dahil ikinci yarisini yeni bir listeye ekleyip yazdirin.
         */
        String[] isimler = {"bugra", "Veli", "selcuk", "Fatma", "Omer", "sema", "aslan"};
        List<String> duzenlenmisHali = new ArrayList<>();

        for(String each:isimler){
            if((each.length()%2)==0){
                duzenlenmisHali.add(each.substring(0,each.length()/2));
            }else {
                duzenlenmisHali.add(each.substring(each.length()/2, each.length()));
            }
        }
        System.out.println(duzenlenmisHali);//[gra, Ve, sel, tma, Om, se, lan]

    }
}
