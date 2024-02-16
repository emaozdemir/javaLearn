package j08_Loops.Loop01_FoorLopp;

public class C01_ForLoop {

    public static void main(String[] args) {
        //for loop -> tekrarlayan sabit actionlar için tanımlanan cade bloğudur.
        // task-> 42 kere "maaşallah" prin eden code create ediniz.
        for (int i = 1; i <=41 ; i++) {
            System.out.println(i+".maşallah");//1. yol
        }

        for (int i=0;  i <41; i++) {
            System.out.println(i+1+".maşallah");//2.yol
        }
        System.out.println("javacanlara selam");//for kırıldı ve devamındaki kod satiri 1 defa calıstı.

        // task02-> 2 basamalı tek sayıları aynı satıra aralarında boşluk ile print eden code create ediniz.
        for (int i=11; i<100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("\n***");


        //int bas =4, bit =56;  //dışarda da tanımlayabiliriz.
        //for (int i=bas; i<bit; i++)
        for (int i=0; i<100; i++){ // for un içinde de tanımlayabiliriz.
            if (i>=10 && i%2 !=0 ){
                System.out.print(i+" ");
            }
        }
         /*
  Code standarts
1) Tekrar (Repetition) olmamalidir
2) Dynamic olmalidir
3) Tamir (Fix) ve update kolay yapilabilmelidir
 */




    }
}
