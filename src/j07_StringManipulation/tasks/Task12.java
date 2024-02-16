package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen 3 kelimelik bir isim giriniz: ");
        String isim = sc.nextLine();
        System.out.println(isim.substring(0,1));*/
      /*   Scanner scan = new Scanner(System.in);

        System.out.println("lütfen üç kelimelik metin giriniz: ");
        String isim = scan.nextLine();

       String birinci = (isim.split(" ")[0]).substring(0, 1).toUpperCase();
        String ikinci = (isim.split(" ")[1]).substring(0, 1).toUpperCase();
        String ucuncu = (isim.split(" ")[2]).substring(0, 1).toUpperCase();
        System.out.println(birinci + "." + ikinci + "." + ucuncu);
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen üç kelimelik metin giriniz: ");
        String metin = scan.nextLine().toUpperCase();
        if (metin.indexOf(" ",metin.indexOf(" ")+1)==metin.lastIndexOf(" ")) {
            String sonuc = metin.charAt(0) + "." + metin.charAt(metin.indexOf(" ") + 1) + "." + (metin.charAt(metin.lastIndexOf(" ") + 1) + ".");
            System.out.println("sonuc = " + sonuc);
        }else if (metin.indexOf(" ")==metin.lastIndexOf(" ")) {
            System.out.println("2 kelime kabul etmiyorum");
        } else System.out.println("sadece 3 kelime olsun metin");
        //2.yontem
        System.out.println("****2.yontem***");
        int ilkBosluk=metin.indexOf(" ");
        int ikinciBosluk=metin.lastIndexOf(" ");

        char adIlkHarf=metin.charAt(0);
        char ad2IlkHarf=metin.charAt(ilkBosluk+1);
        char soyAdIlkHarf=metin.charAt(ikinciBosluk+1);
        System.out.println(adIlkHarf+"."+ad2IlkHarf+"."+soyAdIlkHarf+".");





    }
}
