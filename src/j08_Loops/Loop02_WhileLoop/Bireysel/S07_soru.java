package j08_Loops.Loop02_WhileLoop.Bireysel;

import java.util.Scanner;
public class S07_soru {
    public static void main(String[] args) {
        /*kullanicdan toplanmak üzere pozitif tam sayilar isteyin.
        kullaniciya bitirmek istediğinde 0 a basmasını soyleyin.
        kullanici bitirmek istediğinde toplam kac adet pozitif tam sayi girdiğini ve
        bunların toplamının kac oldugunu yazdırın.
        kullanıcı negatif sayi girerse negatif sayi kullanilmaz yazdırın .
        bu negatif sayiyi adede ve toplama eklemeyin
         */
        Scanner scanner = new Scanner(System.in);

        int girilenSayi=1;
        int pSToplami=0;
        int pSAdedi=0;
        /* while loop kullandığımızda dikkat etmemiz gereken en önemli konu:
        normalde kullanicidan almayı dusundugumuz "girilenSayi"variable ına
        basta rastgele bir değer atadık.
        verdiğimiz bu ilk deger while loop bodynin calısmasına engel olmamalıdır!!
        ve bu sorunu while ile değilde do whille rahatca cözeriz..
         */

        while (girilenSayi!=0){
            System.out.println("toplanmasını istediğiniz tam sayiları girin: ");
            girilenSayi = scanner.nextInt();
            if (girilenSayi>0){
                pSToplami+=girilenSayi;
                pSAdedi++;
            }else if (girilenSayi<0){
                System.out.println("negatif sayi kullanımı yasak!");
            }
        }
        System.out.println("toplam: "+pSToplami+"\npozitif tam sayi adedi= "+pSAdedi);



    }
}
