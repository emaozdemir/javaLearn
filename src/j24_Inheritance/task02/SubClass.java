package j24_Inheritance.task02;

public class SubClass extends SuperClass {

    int sayi = 17;

    @Override
    public String ebikGabik() {
        return "Agam SubClass'dan selam dewamkeee. ";
    }


    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.javaCan();//obj ile non static method call edildi.
        //javaCan meth non static oldugu için maine doğrudan call edilemez.

    }

    public void javaCan() {
        System.out.println("super.ebikGabik() = " + super.ebikGabik());
        System.out.println("this.ebikGabık() = " + this.ebikGabik());
        System.out.println("super.sayi = " + super.sayi);
        System.out.println("this.sayi = " + this.sayi);

    }

}//Class sonu
