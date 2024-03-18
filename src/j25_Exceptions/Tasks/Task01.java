package j25_Exceptions.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
  Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("sifrenizi giriniz: ");
        String sifre = input.nextLine();
        try {
            if (!(sifre.length() >= 6 && sifre.length() <= 10)) {
                throw new IllegalArgumentException("tekrar deneyin.Girilen password'un 6 karakterden az 10 karakterden fazla olmamali");

            } else {
                System.out.println("tebrikler dogru!");
            }

            System.out.println("Bu mesaji okuyorsan try sorunsuz calisti");
        } catch (IllegalArgumentException e) {
            System.out.println("e.getMessage() = " + e.getMessage() + " şifren kurallara uymuyor");
            System.out.println("from catch");
        }

        System.out.println("Bu mesaji okuyorsan app sorunsuz calisti");


    }
}
