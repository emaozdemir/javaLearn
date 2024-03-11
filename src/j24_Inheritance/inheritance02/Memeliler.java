package j24_Inheritance.inheritance02;

public class Memeliler extends Hayvalar {//grand preantten (Hayvanlar) extends edilen parent class
    int m=1;//initial int type variable
    int c=4;//initial int type variable

    public Memeliler() {// default parametresiz constructor
        this('H');//bu classtaki p li const call edildi
        System.out.println("memeliler class parametresiz const call edildi");
    }
    public Memeliler(char y) {// default parametresiz constructor
        super(34);//parent classtaki p li const call edildi
        System.out.println("memeliler class 1 parametreli const call edildi");
    }
    public void mC(){
        System.out.println("mC-> memeliler class meth call edildi");
    }
    @Override
    public void methM(){
        System.out.println("methM -> Memeliler class meth call edildi");
    }

}
