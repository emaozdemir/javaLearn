package j26_Abstract.abstract06;

public abstract class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public abstract void openAccount(String imza, String kimlik);
    public abstract void closeAccount(String imza, String kimlik, boolean hesapKontrol);
    public abstract String withdraw(double gidenPara);
    public abstract String deposit(double gelenPara);
    public abstract String loan();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank [balance=" + balance + "]";
    }
}
