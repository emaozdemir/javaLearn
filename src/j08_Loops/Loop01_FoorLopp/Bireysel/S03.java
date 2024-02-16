package j08_Loops.Loop01_FoorLopp.Bireysel;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir tam sayı alıp rakamlar toplamını yazdırın.
        Scanner scn = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz: ");
        int girilen = scn.nextInt();

        int sayi=girilen;
        int birlerBasamagı=0;
        int rakamlarToplamı=0;

        //işlemi basamak sayısı kadar tekrar ettirmeliyiz.

        int basamakSayısı=(sayi+"").length();//hiçlikle toplayarak string methodunu getirebilirdik.

        for (int i =1;i<=basamakSayısı;i++){

            birlerBasamagı=sayi%10;
            rakamlarToplamı+=birlerBasamagı; // burda 1 i aldık toplama ekledik alttaki satırla
            sayi/=10;//1 den kurtulduk her defasında birler basamagına gelene aynı işlemi yaptık.
        }

        System.out.println("rakamlarToplamı = " + rakamlarToplamı);
    }
}
