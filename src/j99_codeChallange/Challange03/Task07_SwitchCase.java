package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task07_SwitchCase {

    //  Task-> Girilen 3 haneli bir sayının okunusunu print eden code create ediniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 3 basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();
        if (sayi>=100 && sayi<1000){
            System.out.print("girilen sayi 3 basamaklıdır.."+sayi);
            int birler=sayi%10;
            int onlar=(sayi/10)%10;
            int yüzler=sayi/100;

            switch (yüzler) {
                case 1: System.out.print("yüz"); break;
                case 2:System.out.print("iki yüz"); break;
                case 3:System.out.print("üç yüz"); break;
                case 4:System.out.print("dört yüz"); break;
                case 5:System.out.print("bes yüz"); break;
                case 6:System.out.print("altı yüz"); break;
                case 7:System.out.print("yedi yüz"); break;
                case 8:System.out.print("sekiz yüz"); break;
                case 9:System.out.print("dokuz yüz"); break;

            }
            switch (onlar){
                case 1: System.out.print("on"); break;
                case 2:System.out.print("yirmi "); break;
                case 3:System.out.print("otuz"); break;
                case 4:System.out.print("kırk "); break;
                case 5:System.out.print("elli "); break;
                case 6:System.out.print("atmıs "); break;
                case 7:System.out.print("yetmiş "); break;
                case 8:System.out.print("seksen "); break;
                case 9:System.out.print("doksan"); break;
            }
            switch (birler){
                case 1: System.out.print("on"); break;
                case 2:System.out.print("ik "); break;
                case 3:System.out.print("üç "); break;
                case 4:System.out.print("dört "); break;
                case 5:System.out.print("bes "); break;
                case 6:System.out.print("altı "); break;
                case 7:System.out.print("yedi "); break;
                case 8:System.out.print("sekiz "); break;
                case 9:System.out.print("dokuz "); break;
            }


        }else System.out.print("girilen sayi 3 basamaklı değildir.tekrar deneyin..");

        /* Scanner input = new Scanner(System.in);
        System.out.println("Agam hele 3 basamaklı bir sayi giresen : ");
        int sayi = input.nextInt();
        if (sayi<=999&&sayi>=100) {//sayi 3 basamaklı kontrolu
          switch (sayi/100) {//yuzler basamak kontrolu
              case 1:System.out.print("yüz");break;
              case 2:System.out.println("iki yüz");break;
              case 3:System.out.println("üç yüz");break;
              case 4:System.out.println("dört yüz");break;
              case 5:System.out.println("beş yüz");break;
              case 6:System.out.println("altı yüz");break;
              case 7:System.out.println("yedi yüz");break;
              case 8:System.out.println("seki yüz");break;
              case 9:System.out.println("dokuz yüz");break;
          }
            switch ((sayi/10)%10) {//onlar basamak kontrolu
                case 1:System.out.print("on");break;
                case 2:System.out.println("yirmi ");break;
                case 3:System.out.println("otuz ");break;
                case 4:System.out.println("kırk ");break;
                case 5:System.out.println("elli ");break;
                case 6:System.out.println("atmış ");break;
                case 7:System.out.println("yetmiş ");break;
                case 8:System.out.println("seksen ");break;
                case 9:System.out.println("doksan ");break;
            }
            switch (sayi%10) {//birler basamak kontrolu
                case 1:System.out.print("bir");break;
                case 2:System.out.println("iki");break;
                case 3:System.out.println("üç");break;
                case 4:System.out.println("dört");break;
                case 5:System.out.println("beş");break;
                case 6:System.out.println("altı");break;
                case 7:System.out.println("yedi");break;
                case 8:System.out.println("seki");break;
                case 9:System.out.println("dokuz");break;
            }
        }else System.out.println("Agam gelmiiim ora adam gibin bişey giresen :(");
        System.out.println("\nAgam bu satır print edildiyse code cincix dewamke :)");
         */


    }

}
