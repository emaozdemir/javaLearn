package j27_Interface.Task_Tofask;

public class Runner {
    public static void main(String[] args) {
        Sahin obj=new Sahin();
        obj.kapi();//4 KAPI sedan
        obj.motor();//1.6 MOTOR az yakar cok kacar
        obj.yakit();//TUP yoksa eve ates duser
        obj.kaporta();//Akordion KAPORTA
        obj.klima();//KLIMA icin cam neyine yetmiyor
        obj.jant();//Jilet Ahmet JANTi giyinir
        obj.ebatLastik();//LASTIK gibi sundurme
        obj.sunroof();//non-static concrete meth obj ile call edildi->Soguk havada sunroof usutur
        System.out.println(obj.sisLamp());//non-static concrete meth obj ile call edildi->Sisli havada Can kurtarir
        DisDonanim.anten();//static concrete meth interfaceName ile call edildi->Cekemeyen anten taksin
        System.out.println("DisDonanim.RENK = " + DisDonanim.RENK);//Kirmizi
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK);//Yavru agzi
        System.out.println("Lastik.RENK = " + Lastik.RENK);//Cingene pembasi
        System.out.println("IcDonanim.KUMAS = " + IcDonanim.KUMAS);//Kadife
        System.out.println("IcDonanim.MUSIC = " + IcDonanim.MUSIC);//Selvi boylum
    }
}
