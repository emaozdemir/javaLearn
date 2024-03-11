package j24_Inheritance.inheritance01;

public class Hayvanlar {
    public Hayvanlar() {
        System.out.println("P'siz hayvanlar const call edildi");
    }

    public void hareket() {//meth
        System.out.println("hayvanlar hareket eder");
    }

    public void beslenme() {//meth
        System.out.println("Hayvanlar tok iken yemek yemez");
    }

    public void icme() {//meth
        System.out.println("Hayvanlar su icer");
    }
}