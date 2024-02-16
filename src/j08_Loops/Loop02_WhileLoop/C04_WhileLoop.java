package j08_Loops.Loop02_WhileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz
        System.out.println("***For ile****");
        for (int i = 100; i < 1000; i+=4) {
            System.out.print(i+" ");
        }

        System.out.print("***While ile***");
        int bas=100;
        while (bas<1000){//100 ile 999 arasindaki sayilar loopa tanimlandi
            if (bas%4==0) System.out.println(bas+" ");//4'e tam bolunen sayilar yazdirildi
            bas++;//100 ile 999 arasi loop degisimi saglandi
        }




    }
}
