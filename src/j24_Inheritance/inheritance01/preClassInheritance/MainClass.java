package j24_Inheritance.inheritance01.preClassInheritance;

public class MainClass {

    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen();
        System.out.println("ogretmen = " + ogretmen);

        Ogretmen ogretmen1 = new Ogretmen("fizik", "12aa");
        System.out.println("ogretmen1 = " + ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("aslan", "12342", 22, "kimya", "123aass");
        System.out.println("ogretmen2 = " + ogretmen2);

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setOgrenciNo(12);
        ogrenci.setSinif("9");
        System.out.println("ogrenci = " + ogrenci);

        Ogrenci ogrenci1 = new Ogrenci("ali", "12345", 24, "12.", 1234);
        System.out.println("ogrenci1 = " + ogrenci1);

    }

}
