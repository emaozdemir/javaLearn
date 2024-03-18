package j26_Abstract.abstract01;

public abstract class Lastik extends Honda{//abs honda classtan extend chield abs class
    // abs Class'larda parent - child ise meth. implement zorunluluğu yoktur.(isterse override edebilir)
    public abstract void lastikEbat();//abs meth->implement zorunlu
    public void kisLastik(){
        System.out.println("ekim ayindan sonra kis lastigi takmak zorundasın.");
    }

}
