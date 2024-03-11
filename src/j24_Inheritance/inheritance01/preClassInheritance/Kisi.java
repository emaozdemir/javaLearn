package j24_Inheritance.inheritance01.preClassInheritance;

public class Kisi {
    private String isim;
    private String kimlikNo;
    private int yas;

    public Kisi(String isim, String kimlikNo, int yas) {
        this.isim = isim;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
