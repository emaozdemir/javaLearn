package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> Girilen 3 basamaklı bir sayıyı harf karakteri ile print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz: ");
        int sayi = sc.nextInt();
        if (sayi >= 100 && sayi < 1000) {
            int birler=sayi%10;
            int onlar=(sayi/10)%10;
            int yüzler=(sayi/100);

            switch (yüzler) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yüz");
                    break;

                case 2:
                    System.out.println("ikiyüz");
                    break;

                case 3:
                    System.out.println("üçyüz");
                    break;

                case 4:
                    System.out.println("dörtyüz");
                    break;

                case 5:
                    System.out.println("besyüz");
                    break;

                case 6:
                    System.out.println("altıyüz");
                    break;

                case 7:
                    System.out.println("yediyüz");
                    break;

                case 8:
                    System.out.println("sekizyüz");
                    break;

                case 9:
                    System.out.println("dokuzyüz");
                    break;

            }
            switch (onlar) {
                case 0: System.out.print(""); break;
                case 1: System.out.print("on "); break;
                case 2: System.out.print("yirmi "); break;
                case 3: System.out.print("otuz "); break;
                case 4: System.out.print("kirk "); break;
                case 5: System.out.print("elli "); break;
                case 6: System.out.print("altmis "); break;
                case 7: System.out.print("yetmis "); break;
                case 8: System.out.print("seksen "); break;
                case 9: System.out.print("doksan "); break;
            }
            switch (birler) {
                case 0: System.out.print(""); break;
                case 1: System.out.print("bir "); break;
                case 2: System.out.print("iki "); break;
                case 3: System.out.print("üç "); break;
                case 4: System.out.print("dört "); break;
                case 5: System.out.print("beş "); break;
                case 6: System.out.print("altı "); break;
                case 7: System.out.print("yedi "); break;
                case 8: System.out.print("seksen "); break;
                case 9: System.out.print("doksan "); break;
                default:
            }

        }else {
            System.out.println("geçersiz sayı girildi");
        }

    }
}
