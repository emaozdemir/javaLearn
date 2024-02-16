package j06_SwitchStatement.tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz: ");
        String ay = sc.nextLine().toLowerCase();
        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "tezmmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println(ay + "ayı 31 gündür.");
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println(ay + "ayı 30 gündür.");
                break;
            case "subat":
                System.out.println("subat ayı yıla göre değişiklik gösterir.\nlütfen bir yıl giriniz: ");
                int yil = sc.nextInt();
                if (yil % 4 == 0 && yil % 100!= 0 || yil % 400 == 0) {
                    System.out.println("girdiğiniz yil olan = " + yil+"\'de " + ay + " ayı 29 gündür.");
                } else {
                    System.out.println("girdiğiniz yil olan = " + yil+"\'de "  + ay + " ayı 28 gündür.");
                }
                break;
                default:
                    System.out.println("Hatalı ayı girdiniz.");
                    break;

        }


    }
}
