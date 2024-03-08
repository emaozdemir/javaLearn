package j20_StaticKeyword.Task03;

public class Lesson {
  private   String name;
   private int credit;

    public Lesson(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }
    public Lesson() {
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", credit=" + credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}