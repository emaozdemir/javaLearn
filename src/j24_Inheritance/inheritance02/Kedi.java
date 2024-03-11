package j24_Inheritance.inheritance02;

public class Kedi extends Memeliler {//parent (super) Memeliler classtan extends edilen child(sub) class
    int c = 2;//initial int type variable
    int d = 7;//initial int type variable

    public Kedi() {//p siz default const
        super();//parent(Memeliler)clastaki psiz const call edildi
        System.out.println("kediler class p siz const call edildi.");
    }

    public Kedi(String str) {//1 p li const
        this();//bu clastaki default p siz const call edildi.
        // this("str");//CTE -> PARAMETRELİ CONST İÇİNDE YİNE KENDİSİNİ ÇAĞIRAMAYIZ!!recursive const call edilemez.
        System.out.println("super.c = " + super.c);//parent(Memeliler) classdaki c variable call edildi
        System.out.println("kediler class 1 p li const call edildi.");
    }

    @Override//annotation-> dipnot-> overriden (ezilen)meth ile override (ezen) meth ,l,şk,lendirildi.
    public void mC() {
        System.out.println("mC-> Kedi class meth call edildi");
        //super.mC();
    }

    @Override
    public String toString() {
        return
                "c=" + c +
                ", d=" + d + super.toString();
    }
}
