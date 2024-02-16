package j07_StringManipulation;

import java.util.Scanner;

public class C14_Practice {
    /*
Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
1-en az 8 karakter uzunlugunda,
2-ilk harf buyuk,
3-son harf kucuk,
4-boşluk içermemeli
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("password giriniz");
        String password = scan.nextLine();
        //System.out.println((password.length()>=8) && (password.charAt(0)>='A'&& password.charAt(0)<='Z')&& (password.charAt(password.length()-1)));

        if (password.length()>=8//passwordun uzunlugu sarti kontrol edildi
                &&Character.isUpperCase(password.charAt(0))//ilk harf buyuk harf mi kontrolu yapildi
                &&Character.isLowerCase(password.charAt(password.length()-1))//son harf kucuk harf mi kontrolu yapildi
                &&!password.contains(" ")){//bosluk icermeme kontrolu yapildi
            System.out.println("gayet başarılı DEWAMKEEE :)");
        }else System.out.println("Çok başarısız :( agam yeni paaword giresen");
    }
}
