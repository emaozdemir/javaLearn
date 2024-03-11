package j24_Inheritance.inheritance01.preClassInheritance;

public class Ogrenci extends Kisi {
    private String sinif;
    private int ogrenciNo;

    public Ogrenci() {
    }

    public Ogrenci(String sinif, int ogrenciNo) {
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(String isim, String kimlikNo, int yas, String sinif, int ogrenciNo) {
        super(isim, kimlikNo, yas);
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" + super.toString() +
                "sinif='" + sinif + '\'' +
                ", ogrenciNo=" + ogrenciNo +
                '}';
    }
}
