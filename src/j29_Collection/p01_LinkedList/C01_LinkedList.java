package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {
         /*
LinkedList .....
1- LinkedList'de elemanlar "data" ve "adress"(next) olmak uzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır.
2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran "head" node tanımlanmıştır.
3- LinkedList'te son node adres kısmı null olan sadece data bulunduran "tail" node tanımlanmıştır.
4- ArrayList searching LinkedList node ekleme(add) ve silmede(remove) daha avantıjlıdır.
5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
    Ancak obj DataType olarak parent interface tanımlanabilir.
7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
 */
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
        //LinkedList print
        System.out.println("ll1 = " + ll1);//ll1 = [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        //LinkedList add
        ll1.add("keskin tava");
        System.out.println("ll1 add sonrasi :  " + ll1);// [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, keskin tava]
        //basa ekleme addFirst
        ll1.addFirst("büryan kebab");
        System.out.println("ll1 addFirst sonrasi :  " + ll1);//[büryan kebab, balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, keskin tava]
        //sona ekleme addLast
        ll1.addLast("beyti");
        System.out.println("ll1 addLast sonrasi :  " + ll1);//[büryan kebab, balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, keskin tava, beyti]
        //indexli add
        ll1.add(3, "etli ekmek");
        System.out.println("ll1 indexli adden  sonrasi :  " + ll1);//[büryan kebab, balcanKebap, Cüger, etli ekmek, haşhaşKebap, guzuGerdan, incik, küşşşleme, keskin tava, beyti]


        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("trileçe", "künefix", "sübye", "suMuhallebi", "kerebis", "ayva"));
        ll1.addAll(ll2);
        System.out.println("ll1 addAll  sonrasi :  " + ll1);//[büryan kebab, balcanKebap, Cüger, etli ekmek, haşhaşKebap, guzuGerdan, incik, küşşşleme, keskin tava, beyti, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva]
        ll2.addAll(1, ll2);
        System.out.println("ll1 addAll indexli hali  sonrasi :  " + ll2);//[trileçe, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva, künefix, sübye, suMuhallebi, kerebis, ayva]
       // ll2.addAll("cennet camuru");//CTE , meth parametre coll olmalı
//        List<String> list=new ArrayList<>();
//        list.



    }
}
