package j26_Abstract.abstract06;

public class BOA extends Bank{

    public BOA(double balance) {
        super(balance);
    }

    @Override
    public void openAccount(String imza, String kimlik) {
        // BOA'ya özel hesap açma işlemi
    }

    @Override
    public void closeAccount(String imza, String kimlik, boolean hesapKontrol) {
        // BOA'ya özel hesap kapatma işlemi
    }

    @Override
    public String withdraw(double gidenPara) {
        // BOA'ya özel para çekme işlemi
        return "BOA: " + gidenPara + " para hesaptan çekildi.";
    }

    @Override
    public String deposit(double gelenPara) {
        // BOA'ya özel para yatırma işlemi
        return "BOA: " + gelenPara + " para hesaba yatırıldı.";
    }

    @Override
    public String loan() {
        // BOA'ya özel kredi başvurusu işlemi
        return "BOA: Kredi başvurusu yapıldı.";
    }
}
