package j19_Constructor;

public class C05_AracRunner {
    public static void main(String[] args) {
        C05_Arac a1=new C05_Arac("toros");
        C05_Arac a2=new C05_Arac("tosbik",250);
        C05_Arac a3=new C05_Arac();
        a3.model="Brodway";
        a3.maxHiz=150;
        a2.model="vosvos";
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a1 = " + a1);
    }
}
