package j23_Encapsulation.encapsulation2;

public class Kisi {
    /* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */
    //1.adım fields
    private String ad;
    private String soyad;
    private String password;
    private int yas;
    //2.step cons


    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        //  this.yas = yas;
        //  this.yas = Math.abs(yas);// negatif değer girmeye karsı
        setYas(yas);// 2.yol negatif değer girmeye karsı
    }

    public Kisi() {
    }
    //3.adım getter setter

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPassword() {
        return password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        // this.yas = yas;
        this.yas = Math.abs(yas);

    }
    //4.adım toString

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                        ", soyad='" + soyad + '\'' +
                        ", password='" + password + '\'' +
                        ", yas=" + yas +
                        '}';
    }
}
