package j26_Abstract.abstract01;

public class Crv extends Honda {

    @Override
    public void motor() {
        System.out.println("2.3 motor cok yakmaz mi");

    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk yaz ayında terletir");
    }

    @Override
    void kapi() {//zorunlu
        System.out.println("kapinin elektirik tamirini yapalim");
    }

    @Override
    void sunroof() {//keyfi
        System.out.println("sunroof olmadan lux olmaz");
    }
}
