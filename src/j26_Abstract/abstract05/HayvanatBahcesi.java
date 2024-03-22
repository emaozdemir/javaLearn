package j26_Abstract.abstract05;


import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        // Kedi nesnesi oluşturulması ve özelliklerinin belirlenmesi
        Kedi kedi = new Kedi();
        kedi.setId(1);
        kedi.setIsim("Minnoş");
        kedi.setVahsi(false);
        kedi.setDogumTarihi(LocalDate.of(2018, 5, 15));

        // Kedi'nin özelliklerinin ve davranışlarının gösterilmesi
        System.out.println("Kedi Bilgileri:");
        System.out.println("ID: " + kedi.getId());
        System.out.println("İsim: " + kedi.getIsim());
        System.out.println("Vahşi: " + kedi.isVahsi());
        System.out.println("Doğum Tarihi: " + kedi.getDogumTarihi());
        kedi.yiyecegi();
        kedi.yemekMiktari();
        kedi.gunlukUykuSuresi();
        kedi.sesi();
        System.out.println("******************************************************");

        // Kartal nesnesi oluşturulması ve özelliklerinin belirlenmesi
        Kartal kartal = new Kartal();
        kartal.setId(2);
        kartal.setIsim("Şahin");
        kartal.setVahsi(true);
        kartal.setDogumTarihi(LocalDate.of(2015, 10, 20));

        // Kartal'ın özelliklerinin ve davranışlarının gösterilmesi
        System.out.println("Kartal Bilgileri:");
        System.out.println("ID: " + kartal.getId());
        System.out.println("İsim: " + kartal.getIsim());
        System.out.println("Vahşi: " + kartal.isVahsi());
        System.out.println("Doğum Tarihi: " + kartal.getDogumTarihi());
        kartal.yiyecegi();
        kartal.yemekMiktari();
        kartal.gunlukUykuSuresi();
        kartal.sesi();
    }
}
