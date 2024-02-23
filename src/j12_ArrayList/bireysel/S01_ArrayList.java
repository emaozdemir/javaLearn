package j12_ArrayList.bireysel;

import java.util.ArrayList;
import java.util.List;

public class S01_ArrayList {
    /*
    ArrayList Array altyapisini kullanir.ama ekleme ve silme yapmaya müsade eder.
    yani esnek yapidaki bir array gibidir.
    olustururken list ve baklava dilimi ve baklava içine datatipini ama int değil ->Integer(wrapper yaparız yani)
    AVANTAJİİ;boyutlandirilabilir bir array olamasıdır
     */
    public static void main(String[] args) {
        //bos bir ArrayList oluşturalim.
        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar);//[]
        //listte add ile tek tek eleman atayabiliyoruz.

        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);
        System.out.println(sayilar);//[5, 8, 3]
        //5 ile 8 arasina 4 ekleyelim;
        sayilar.add(1, 4);
        System.out.println(sayilar);

        //3 FARKLİ ŞEKİLDE LİST OLUSTURULABİLİR.
       // List<Integer>list1=new List<>(); böyle diyemeyiz ArrayList dememiz lazım.
        List<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<Integer>();

        sayilar.addAll(list2);
        System.out.println(sayilar);//[5, 8, 3, 10, 20]

        //list2 nin elementlerini sayilarin en basına ekleyelim.
        sayilar.addAll(0,list2);
        System.out.println(sayilar);//[10, 20, 5, 4, 8, 3, 10, 20]



    }
}
