package j21_Scope;

import j20_StaticKeyword.C03_StaticKeyword;

public class CO4_Scope {
    public static void main(String[] args) {
        C01_InstanceVariable obj1=new C01_InstanceVariable();//istenilen classtan constructor call edilerek obj create edilebilir.
        C03_StaticKeyword obj2=new C03_StaticKeyword();
        obj1.nonStatiMethod();//obj ile nonstatic meth call edildi
        System.out.println("obj1.developer = " + obj1.developer);//obj ile obj variable call edildi
        C01_InstanceVariable.statiMethod();//class name ile static meth call edildi.
        //obj2.

    }
}
