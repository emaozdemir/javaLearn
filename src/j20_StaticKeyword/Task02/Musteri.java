package j20_StaticKeyword.Task02;

public class Musteri {
    String name;
    ElektrikHesabi elektrikHesabi;
//olusturulan her class non primitif bir data tipidir o yuzden buyuk harle cll

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", elektrikHesabi=" + elektrikHesabi;
    }
}