package j20_StaticKeyword.Task02;

public class ElektrikHesabi {


    int toplamTuketim;
    double oran = 0.7;
    double fatura;


    public double odenecekTutar() {
        return fatura = toplamTuketim * oran;//ayni
    }

    public void tuketimEkle(int tuketim) {
        toplamTuketim += tuketim;
    }


}
