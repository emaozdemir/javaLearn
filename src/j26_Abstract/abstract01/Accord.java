package j26_Abstract.abstract01;

public class Accord extends Honda {//concrete child class
    @Override
    public void motor() {
        System.out.println("2.0 motor ok.");
    }

    @Override
    void koltuk() {
        System.out.println("koltuk guzel.");
    }

    @Override
    void kapi() {
        System.out.println("4 kapili araba");
    }

    @Override
    void sunroof() {
        System.out.println("sunroof olması cok guzel");
    }
}
