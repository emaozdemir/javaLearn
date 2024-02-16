package j10_MethodCreation.bireysel;

public class S04_FaktoriyelHesaplama {

    public static void main(String[] args) {
        /*
        verilen pozitif tamsayinin faktoriyel değerini yazdıran method olustur
        örnek input 5 output 120
         */
        faktoriyelDegeri(5);

    }

    public static void faktoriyelDegeri(int sayi) {
        int faktoriyel = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;
        }
        System.out.println(sayi + "! = " + faktoriyel);
    }


}
