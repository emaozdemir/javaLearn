package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task1 {
    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.
    public static void main(String[] args) {
        //başi ve sonu tekrarı belli olmayan ,durumla ilgili olunca while ile çözmeliyiz.


       /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sayı giriniz: ");
        int girilenSayi = scan.nextInt();
        int birlerbas=0;
        int rakamlarToplamı=0;

        System.out.println("for ile çözümü");
        int basamakSayısı=(girilenSayi+"").length();
        System.out.println();
        for (int i =1;i<=basamakSayısı;i++){
            birlerbas=girilenSayi%10;
            rakamlarToplamı+=birlerbas;
            girilenSayi/=10;
        }
        System.out.println("Rakamlar Toplamı = " + rakamlarToplamı);

        System.out.println("while ile çözümü");
*/

        // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("agam bi sayı giresen : ");
        int sayi = input.nextInt();//1453
        int rakamToplami = 0;//loop dan gelen rakamların toplanacagı boş conteiner tanımlandı
        while (sayi > 0) {


            rakamToplami += sayi % 10;//birler basm rakam rakamToplamına atandı
            sayi = sayi / 10;//sayi=1453/10=145

        }
        System.out.println("Agam girilen sayının rakam topamı : " + rakamToplami);


    }

}
