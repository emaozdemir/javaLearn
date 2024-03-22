package j26_Abstract.abstract01;

public abstract class Lastik extends Honda {//abs honda classtan extend child abs class

    // abs Class'larda parent - child ise meth. implement zorunluluğu yoktur.(isterse override edebilir)
    // (aynı zamanda ikiside abst oldugu ıcın overri gerek yok isterse yapabilir.)
    public abstract void lastikEbat();//abs meth->implement zorunlu

    public void kisLastik() {
        System.out.println("aralik 1 den sonra kis lastigi takmak zorundasın.");
    }

}
