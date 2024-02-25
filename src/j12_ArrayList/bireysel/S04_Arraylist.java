package j12_ArrayList.bireysel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S04_Arraylist {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("sema");
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("can");
        System.out.println(isimler);//[sema, ali, veli, can]
        isimler.add(2,"aslan");
        System.out.println(isimler);//[sema, ali, aslan, veli, can]

        //2.indexteki ismi furkan yapmak;
        isimler.set(2,"furkan");
        System.out.println(isimler);//[sema, ali, furkan, veli, can]
        System.out.println("isimler.set(3,\"mert\") = " + isimler.set(3, "mert"));//listeye metri ekler ve eski ismi döndürür.//veli
        System.out.println(isimler);//[sema, ali, furkan, mert, can]

        //ali yi sil.
        System.out.println("isimler.remove(\"ali\") = " + isimler.remove("ali"));//true
        System.out.println(isimler);//[sema, furkan, mert, can]
        //ceren i silin
        System.out.println("isimler.remove(\"ceren\") = " + isimler.remove("ceren"));//false
        System.out.println(isimler);//[sema, furkan, mert, can]

        //verilen isim listede varsa silsin yoksa verilen isim hatali listede bulunamadı yazdırsın.
        String silinecekIsim="kemal";
        if(isimler.contains(silinecekIsim)){
            System.out.println("isimler.remove(\"kemal\") = " + isimler.remove("kemal"));
        }else{
            System.out.println(silinecekIsim+ " ismi hatali listede bulunamadi..");
        }
        //2.yol
        if(!isimler.remove(silinecekIsim)){
            System.out.println(silinecekIsim+" ismi hatali listede yok");
        }

        System.out.println(isimler);//[sema, furkan, mert, can]
        System.out.println("isimler.remove(1) = " + isimler.remove(1));//furkan
        System.out.println(isimler);//[sema, mert, can]
        //olmayan ismi remove yaparsak ındexofbound hatası verir.

        List<Integer>sayilar=new ArrayList<>();
        List<Integer>sayilar1=new ArrayList<>(Arrays.asList(3,4,3,5,6,7,9));//kısayol
        System.out.println(sayilar1);//[3, 4, 3, 5, 6, 7, 9]
        sayilar1.remove(3);
        System.out.println(sayilar1);//[3, 4, 3, 6, 7, 9]

        //sayilar1.remove(9);//IndexOutOfBoundsException
        //listemiz sayilardan olusuyorsa,bir sayi yazdiğimizda obje mi index mi?
        //diye suphe olmaması için java otomatik olarak girilen sayiyi index kabul eder .
        //eger siz obje olarak 9 u silmek isterseniz
        //önce bir variable olarak olusturmalıyız.
        Integer silineceksayi=9;
        sayilar1.remove(silineceksayi);
        System.out.println(sayilar1);//[3, 4, 3, 6, 7]
        Integer silineceksayi1=3;
        sayilar1.remove(silineceksayi1);
        System.out.println(sayilar1);//[4, 3, 6, 7] //gitti ilk gördüğü üçü sildi.



    }
}
