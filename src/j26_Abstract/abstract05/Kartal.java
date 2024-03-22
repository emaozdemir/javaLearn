package j26_Abstract.abstract05;

public class Kartal extends Hayvan{

//    public Kartal() {
//    }

    public void yiyecegi() {
        System.out.println("Kartal, et ve balık yiyebilir.");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("Kartal, günlük olarak belirli bir miktar yemelidir.");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("Kartal, gündüzleri aktifken, gece uyur.");
    }

    @Override
    public void sesi() {
        System.out.println("Kartal, tırtıllar gibi çıtırtılar çıkarır.");
    }
}
