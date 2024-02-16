package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task10 {
    /*
        Task-> java ifadesni j*a*v*a olarak print eden code create ediniz..
         */
    public static void main(String[] args) {

        String str="";
        for (int i = 0; i <"java".length() ; i++) {
            str+="java".charAt(i) + "*";
        }
        System.out.println(str.substring(0, str.length()-1));

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz: ");
        int girilenSayi = scan.nextInt();
        int birlerbas=0;
        int rakamlarToplamı=0;

        int basamakSayısı=(girilenSayi+"").length();

        for (int i =1;i<=basamakSayısı;i++){
            birlerbas=girilenSayi%10;
            rakamlarToplamı+=birlerbas;
            girilenSayi/=10;
        }
        System.out.println("Rakamlar Toplamı = " + rakamlarToplamı);
    }
}
