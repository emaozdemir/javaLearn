package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz: ");
        int sayi = sc.nextInt();
        int onlarBasamagı = ((sayi / 10) % 10);


        switch (onlarBasamagı) {
            case 0:
                System.out.println("onlar basamagı 0");
                break;
            case 1:
                System.out.println("onlar basamagı 1");
                break;
            case 2:
                System.out.println("onlar basamagı 2");
                break;
            case 3:
                System.out.println("onlar basamagı 3");
                break;
            case 4:
                System.out.println("onlar basamagı 4");
                break;
            case 5:
                System.out.println("onlar basamagı 5");
                break;
            case 6:
                System.out.println("onlar basamagı 6");
                break;
            case 7:
                System.out.println("onlar basamagı 7");
                break;
            case 8:
                System.out.println("onlar basamagı 8");
                break;
            case 9:
                System.out.println("onlar basamagı 9");
                break;
            default:
                System.out.println("lütfen rakam giriniz");
        }







    }
}
