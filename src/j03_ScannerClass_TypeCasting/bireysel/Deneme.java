package j03_ScannerClass_TypeCasting.bireysel;

public class Deneme {

    public static void main(String[] args) {
        double a =22.4;
        int sayi = (int) a;
        System.out.println(sayi);

        short b = 22;
        long sayi1 = b;
        System.out.println(sayi1);

        int c = 128;
        byte d = (byte) c;  //(-128 -> 127)
        System.out.println(d);

        byte e = (byte) 140;
        System.out.println(e);

    }
}
