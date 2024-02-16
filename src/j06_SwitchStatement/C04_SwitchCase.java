package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {

    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...
        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay numarasi giriniz");
        int ayNo = input.nextInt();
        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kis Mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar Mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz Mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar Mevsimi");
                break;
            default:
                System.out.println("Hatali giris");


        }


    }
}
