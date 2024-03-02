package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */
        System.out.println("mailControl() = " + mailControl());


    }//main sonu

    private static boolean mailControl() {
        System.out.println("lütfen mailinizi giriniz:  ");
        String mail = input.nextLine();
        if (mail.contains("@") && mail.contains(".") && !mail.startsWith("@")) {
            return true;
        } else
            return false;


    }


}//Class sonu
