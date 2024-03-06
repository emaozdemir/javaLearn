package j20_StaticKeyword.Task02;

public class Musteri {


    String name;

    ElektrikHesabi elektrikHesabi;//ElektrikHesabı data turunden bir elektirikHesabı obj create ed,ldi
    //ElektrikHesabi ->non primitif bit data turu

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", elektrikHesabi=" + elektrikHesabi;
    }
}


