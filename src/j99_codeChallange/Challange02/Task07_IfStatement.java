package j99_codeChallange.Challange02;

import java.util.Scanner;

public class Task07_IfStatement {
    public static void main(String[] args) {
         /*

task->
Kullanicinın  yas ve kilo bilgileri için
18 yasindan kucuk ise kan bagisi yapamaz.
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
print eden code create ediniz.

 */

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz : ");
        int yas = sc.nextInt();

        if (yas>=18 ){
            System.out.println("lütfen kilonuzu giriniz : ");
            int kilo = sc.nextInt();
            if (kilo>=50){
                System.out.println("bağıs yapabilirsin");
            }else System.out.println("bağıs yapacak kiloya sahip değilsin");

         }else System.out.println("yasınız uygun değil bağıs yapamazsın");


    }
}
