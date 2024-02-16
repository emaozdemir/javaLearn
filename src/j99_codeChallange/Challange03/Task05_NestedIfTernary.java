package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task05_NestedIfTernary {
/* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi >= 0 && sayi <= 9) {
            if (sayi==0) {
                System.out.println("zero");
            }else if (sayi==1) {
                System.out.println("one");
            }else if (sayi==2){
                System.out.println("two");
            } else if (sayi == 3) {
                System.out.println("three");
            }else if (sayi==4){
                System.out.println("four");
            }else if (sayi==5){
                System.out.println("five");
            }else if (sayi==6) {
                System.out.println("six");
            }else if (sayi==7) {
                System.out.println("seven");
            }else if (sayi==8) {
                System.out.println("eight");
            }else if (sayi==9) {
                System.out.println("nine");
            }
        } else System.out.println("Gecersiz");

        System.out.println(sayi==0 ? "zero": (sayi==1) ? "one": (sayi==2) ? "two":
                 (sayi==3) ? "three": (sayi==4) ? "four": (sayi==5) ? "five": (sayi==6)?"altı"
                : (sayi ==7)? "yedi": sayi==8 ? "sekiz":sayi==9 ? "dokuz": "gecersiz");














        /*String teile = (sayi >= 0 && sayi <= 9) ?
                (sayi == 0) ? "Zero" :
                        (sayi == 1) ? "One" :
                                (sayi == 2) ? "Two" :
                                        (sayi == 3) ? "Three" :
                                                (sayi == 4) ? "Four" :
                                                        (sayi == 5) ? "Five" :
                                                                (sayi == 6) ? "Six" :
                                                                        (sayi == 7) ? "Seven" :
                                                                                (sayi == 8) ? "Eight" :
                                                                                        (sayi == 9) ? "Nine" :""
                                                                                                :"Gecersiz";

        System.out.println(teile);*/








    }// main sonu
}
