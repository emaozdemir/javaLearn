package j27_Interface.Tasks.Task01;

public class Cember implements Sekil {

    @Override
    public int cevre(int... kenar) {
        return (int) (2 * PI * kenar[0]);
    }

    @Override
    public int alan(int... kenar) {//array gibi algılıyor java bizde o yuzden inex kullanıyoruz
        return (int) (PI * kenar[0] * kenar[0]);
    }
}