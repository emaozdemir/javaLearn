package j26_Abstract.abstract06;

public class ChaseBank extends Bank{
    public ChaseBank(double balance) {
        super(balance);
    }

    @Override
    public void openAccount(String imza, String kimlik) {
        // Chase Bank'a özel hesap açma işlemi
    }

    @Override
    public void closeAccount(String imza, String kimlik, boolean hesapKontrol) {
        // Chase Bank'a özel hesap kapatma işlemi
    }

    @Override
    public String withdraw(double gidenPara) {
        // Chase Bank'a özel para çekme işlemi
        return "Chase Bank: " + gidenPara + " para hesaptan çekildi.";
    }

    @Override
    public String deposit(double gelenPara) {
        // Chase Bank'a özel para yatırma işlemi
        return "Chase Bank: " + gelenPara + " para hesaba yatırıldı.";
    }

    @Override
    public String loan() {
        // Chase Bank'a özel kredi başvurusu işlemi
        return "Chase Bank: Kredi başvurusu yapıldı.";
    }
}