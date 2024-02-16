package j09_Break_Continue;

import java.util.Scanner;

public class CO4_PinControl {
    public static void main(String[] args) {
        // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen pin giriniz: ");
        String pin = "girisHakki";
        int girisHakki = 3;
        while (true){
            System.out.println("Pin kodunu giriniz");
            String kulPin= sc.next();
            if (kulPin.equals(pin)){
                System.out.println("Pin gecerli HOSGELDINIZ");
                break;
            }else {
                girisHakki--;
                if (girisHakki==0){
                    System.out.println("Hakkin kalmadi telefoncuya git");
                    break;
                }
                System.out.println("hatali pin girdiniz. Tekrar deneyin");
                System.out.println(girisHakki+" tane deneme hakkin kaldi");
            }
        }






    }
}
