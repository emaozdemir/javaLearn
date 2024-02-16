package j10_MethodCreation.bireysel;

public class S02_TamBolenSayisiniYazdiran {

    public static void main(String[] args) {
        /*
        verilen pozitif tamsayinin pozitif tam bölen sayisini yazdıran bir method olusturun
        ornek : PTBS input ->20 ->output -> 6  (1,2,4,5,10,20)
         */
        tamBolenSayisi(20);

    }

    public static void tamBolenSayisi(int sayi) {
        int tam = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tam++;
            }

        }
        System.out.println("girilen " + sayi+ " sayisinda "+tam+" tane PTBS var");
    }

}
