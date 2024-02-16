package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen ad soyadı giriniz: ");
        String adsoyad = sc.nextLine();
        System.out.println(adsoyad.split(" ")[0].toUpperCase());
        System.out.println(adsoyad.split(" ")[1].toUpperCase());

    }
}
