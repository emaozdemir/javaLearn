package j20_StaticKeyword.Task02;

public class Musteri {
    String name;
    ElektrikHesabi elektrikHesabi;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", elektrikHesabi=" + elektrikHesabi;
    }
}