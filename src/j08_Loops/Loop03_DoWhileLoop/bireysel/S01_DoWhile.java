package j08_Loops.Loop03_DoWhileLoop.bireysel;

import java.util.Scanner;

public class S01_DoWhile {
    public static void main(String[] args) {
         /*kullanicdan toplanmak üzere pozitif tam sayilar isteyin.
        kullaniciya bitirmek istediğinde 0 a basmasını soyleyin.
        kullanici bitirmek istediğinde toplam kac adet pozitif tam sayi girdiğini ve
        bunların toplamının kac oldugunu yazdırın.
        kullanıcı negatif sayi girerse negatif sayi kullanilmaz yazdırın .
        bu negatif sayiyi adede ve toplama eklemeyin
         */
        Scanner scanner = new Scanner(System.in);

        int girilenSayi=0;
        int pSToplami=0;
        int pSAdedi=0;

        do {
            System.out.println("toplanmasını istediğiniz tam sayiları girin: ");
            girilenSayi = scanner.nextInt();
            if (girilenSayi>0){
                pSToplami+=girilenSayi;
                pSAdedi++;
            }else if (girilenSayi<0){
                System.out.println("negatif sayi kullanımı yasak!");
            }
        }while (girilenSayi!=0);
        System.out.println("toplam: "+pSToplami+"\npozitif tam sayi adedi= "+pSAdedi);
    }
}
