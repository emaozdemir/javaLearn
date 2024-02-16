package j08_Loops.Loop03_DoWhileLoop.bireysel;

import java.util.Scanner;

public class S04_loops {
    public static void main(String[] args) {
        // kullanicidan bir pozitif tam girilenSayi isteyin sayinin tam kare olup olmadıgını bulunuz.
        //tam kare ise true değilse false yazdırın.16->true

        Scanner scanner = new Scanner(System.in);
        System.out.println("tam kare kontrolu için pozitif tam girilenSayi girin: ");
        int girilenSayi = scanner.nextInt();
        boolean tamKareMi=false;
        //for ile;
        for (int i = 1; i*i<=girilenSayi; i++) {
            if (i*i==girilenSayi){
                tamKareMi=true;
            }
        }
        System.out.println(girilenSayi + " girilenSayi için sonuc : "+tamKareMi);
        //while ile;
        tamKareMi=false;
        int sayi=1; // girilen sayiyi kastediyoruz (hata alıyoruz yukarıda var dıye)
        while (sayi*sayi<=girilenSayi){
            if (sayi*sayi==girilenSayi){
                tamKareMi=true;
            }
            sayi++;
        }
        System.out.println(girilenSayi + " girilenSayi için sonuc : "+tamKareMi);
        //do while ile;
        tamKareMi=false;
        sayi=1;
        do {
            if (sayi*sayi==girilenSayi){
                tamKareMi=true;
            }
            sayi++;
        }while (sayi*sayi<=girilenSayi);
        System.out.println(girilenSayi + " girilenSayi için sonuc : "+tamKareMi);




    }
}
