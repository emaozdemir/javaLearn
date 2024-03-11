package j24_Inheritance.inheritance01.preClassInheritance;

public class Ogretmen extends Kisi{
    private  String brans;
    private  String sicil;

    public Ogretmen(String brans, String sicil) {
        this.brans = brans;
        this.sicil = sicil;
    }

    public Ogretmen(String isim, String kimlikNo, int yas, String brans, String sicil) {
        super(isim, kimlikNo, yas);
        this.brans = brans;
        this.sicil = sicil;
    }

    public Ogretmen() {
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSicil() {
        return sicil;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }

    @Override
    public String toString() {
        return "Ogretmen{" + super.toString()+
                "brans='" + brans + '\'' +
                ", sicil='" + sicil + '\'' +
                '}';
    }
}
