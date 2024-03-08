package j20_StaticKeyword.Task03;

public class Lesson {
    private String name;
    private int credit;

    public Lesson(String name, int credit) {
        this.name = name;
        if (credit >= 1 && credit <= 10) {
            this.credit = credit;
        } else {
            throw new IllegalArgumentException("Kredi 1 ile 10 arasında olmalıdır.");
        }
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }
}