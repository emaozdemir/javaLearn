package j26_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci isci = new Isci();
        isci.name = "Ahmet";
        System.out.println("isci.name = " + isci.name);
        isci.maasHesapla();
        isci.maasBilgisi();
        isci.sigorta();
        System.out.println("*******");

        IdariPersonel idariPersonel = new IdariPersonel();
        idariPersonel.name = "Ayşe";
        System.out.println("idariPersonel.name = " + idariPersonel.name);
        idariPersonel.maasHesapla();
        idariPersonel.maasBilgisi();
        idariPersonel.sigorta();
    }
}
