package j20_StaticKeyword.Task02;

public class ElektrikHesabi {
    int toplamTuketim;
    double oran=0.7;
    double fatura;

    public void tuketimEkle(int tuketim){
        toplamTuketim+=tuketim;//Ayni class icerisinde static olmayan variable static olmaya meth obj olmadan call edilebilir
    }
    public double odenecekTutar(){
        fatura=oran*toplamTuketim;
        return fatura;
    }

    @Override
    public String toString() {
        return
                "toplamTuketim=" + toplamTuketim +
                        ", fatura=" + fatura;
    }
}



