package j09_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
    /*
   Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
   atlar ve loop'un bir sonraki değerinden devam eder.
   */
        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.
        // ebik gabık@cimeyıl.com
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir mail hesabı giriniz");
        String mail=scan.next();
        String yenimail="";
        for (int i = 0; i <=mail.length()-1; i++) {  //mailin indexi kadar calısacak.
            if (mail.charAt(i)==' '){  //tekrardan gelen her karakterin ' ' esit olma durumu kontrol edildi.
                continue; //if true oldugu zaman dongu bir sonraki indexe atlayıp devam edecek.
            }
            yenimail+=mail.charAt(i);
        }
        System.out.println("yenimail = " + yenimail);


    }
}
