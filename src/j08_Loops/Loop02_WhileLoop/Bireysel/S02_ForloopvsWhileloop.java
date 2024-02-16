package j08_Loops.Loop02_WhileLoop.Bireysel;

public class S02_ForloopvsWhileloop {
    public static void main(String[] args) {
        //1 den 10 kadar olan sayilari yan yana yaz.
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i +" ");
        }
        System.out.println("");
        //baslangıc ve bitis değeri belliyse ve ya işlemi kaç kez yapacağımızı biliyorsak for yaparız.


        System.out.println("while loop");
        int sayi=1;
        while(sayi<=10){
            System.out.print(sayi+" ");
            sayi++;
        }
    }
}
