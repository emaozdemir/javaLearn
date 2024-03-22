package j26_Abstract.abstract06;

public class WellsFargo extends Bank {
    public WellsFargo(double balance) {
        super(balance);
    }

    @Override
    public void openAccount(String imza, String kimlik) {
        // Wells Fargo'ya özel hesap açma işlemi
    }

    @Override
    public void closeAccount(String imza, String kimlik, boolean hesapKontrol) {
        // Wells Fargo'ya özel hesap kapatma işlemi
    }

    @Override
    public String withdraw(double gidenPara) {
        // Wells Fargo'ya özel para çekme işlemi
        return "Wells Fargo: " + gidenPara + " para hesaptan çekildi.";
    }

    @Override
    public String deposit(double gelenPara) {
        // Wells Fargo'ya özel para yatırma işlemi
        return "Wells Fargo: " + gelenPara + " para hesaba yatırıldı.";
    }

    @Override
    public String loan() {
        // Wells Fargo'ya özel kredi başvurusu işlemi
        return "Wells Fargo: Kredi başvurusu yapıldı.";
    }

}
