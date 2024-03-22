package j27_Interface.Task_Tofask;

public class Sahin extends Tofask implements DisDonanim, IcDonanim, Lastik {
    @Override
    public void kapi() {
        System.out.println("4 KAPİ sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("akordion KAPORTA");
    }

    @Override
    public void koltuk() {
        System.out.println("deri KOLTUK yazin sikinti");
    }

    @Override
    public void klima() {
        System.out.println("KLİMA için cam neyine yetmiyor");
    }

    @Override
    public void ebatLastik() {
        System.out.println("LASTİK gibi sundurme");
    }

    @Override
    public void jant() {
        System.out.println("Jilet ahmet JANTİ giyinir");
    }

    @Override
    public void motor() {
        System.out.println("1.6 MOTOR az yakar cok kacar");
    }

    @Override
    public void yakit() {
        System.out.println("TUP yoksa ates");
    }
}
