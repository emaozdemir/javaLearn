package j12_ArrayList.bireysel;

import java.util.ArrayList;
import java.util.List;

public class S02_ArrayListMeth {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.size();//0
        sayilar.isEmpty();//true
        System.out.println(sayilar.isEmpty());
        //eklemeyi tek tek ve add ile ypariz.
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(10);
        sayilar.add(8);//ayni eleman birden cok defa liste eklenebilir
        System.out.println(sayilar.size());//5
        System.out.println(sayilar.isEmpty());//false
        //bu listede 3 var mı ?
        sayilar.contains(3);//true
        System.out.println(sayilar.contains(3));//true

        // ilk indexteki elemani yazdir;
        System.out.println(sayilar.get(0));//10
        System.out.println(sayilar.get(sayilar.size()-1));//8

    }
}
