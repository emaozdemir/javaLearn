package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz.");
        int yas = scan.nextInt();
        if (yas >= 18) {
            //System.out.println("yasınız oy kullanmaya uygun");
            if (yas >= 18 && yas < 50) {
                System.out.println("bir kez oy kullanabilirsin..");
            } else if (yas >= 50 && yas < 70) {
                System.out.println("iki kez oy kullanabilirsin..");
            } else System.out.println("üç kez oy kullanabilirsin..");

        } else System.out.println("oy kullanamazsın yasın kücük.");






   /*      if (yas>=18){
            System.out.println("oy kullanmaya uygun");
        }else if (yas>50 && yas>=18){
            System.out.println("bir kez oy kullanabilirsin..");
        }else if (yas>70 && yas>=50){
            System.out.println("iki kez oy kullanabilirsin..");
        }else if (yas >= 70) {
            System.out.println("üç kez oy kullanabilirsin..");
        }else System.out.println("oy kullanamazsın yasın kücük.");*/


    }// main sonu
}



