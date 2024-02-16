package j07_StringManipulation.tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        //1.yol
/*        Scanner input=new Scanner(System.in);
        System.out.println("Bir password giriniz");
        String password = input.nextLine();
        if (( password.charAt(0)>='A'&& password.charAt(0)<='Z') && (password.charAt(password.length()-1) >='0') &&
                (password.charAt(password.length()-1)<='9')&& (password.length()>=6)){
            System.out.println("Geçerlidir");
        }else System.out.println("Geçersizdir.");
*/


        //2.yol
        Scanner scan = new Scanner(System.in);
        System.out.println("password giriniz: ");
        String pass = scan.nextLine();

        if (pass.length() >= 6) {
            if (Character.isUpperCase(pass.charAt(0))) {
                if (Character.isDigit(pass.charAt(pass.length() - 1))) {
                    System.out.println("şifre uygundur.");
                } else {
                    System.out.println("son karakter sayı değil...");
                }
            } else {
                System.out.println("ilk karakter büyük değil....");
            }
        } else {
            System.out.println("şifre 6 karakterden kısa....");
        }

    }


}
