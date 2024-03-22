package j26_Abstract.abstract02;

public abstract class Personal {//abs parent class
    String name;

    abstract void maasHesapla();//soyut/abs meth
    abstract void maasBilgisi();//soyut/abs meth

    void sigorta() {// somut metod concrete meth
        System.out.println("from abstract class Personal ");
    }


}
