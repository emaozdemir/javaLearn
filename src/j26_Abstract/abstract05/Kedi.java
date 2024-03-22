package j26_Abstract.abstract05;

public class Kedi extends Hayvan {

//    public Kedi() {
//    }

    @Override
    public void yiyecegi() {
        System.out.println("Kedi, kuru mama ve balık yiyebilir.");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("Kedi, günlük olarak belirli bir miktar yemelidir.");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("Kedi, günde ortalama 12-16 saat uyur.");
    }

    @Override
    public void sesi() {
        System.out.println("Kedi, miyav sesi çıkarır.");
    }
}
