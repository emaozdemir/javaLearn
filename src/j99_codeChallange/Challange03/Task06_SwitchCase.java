package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task06_SwitchCase {
    /*  Task->
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */
    public static void main(String[] args) {

        //1.yol stringle
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk 3 büyük harften birini seçtiğinizde cümle yazdıran kod.. \nLütfen A , B , C harflerinden birini seçin: ");
        String harf1 = sc.next().toUpperCase(); // Girişi büyük harfe çevir

        if (harf1.equals("A") || harf1.equals("B") || harf1.equals("C")) {
            switch (harf1) {
                case "A":
                    System.out.println("Java kolaydır");
                    break;
                case "B":
                    System.out.println("Java eğlencelidir");
                    break;
                case "C":
                    System.out.println("Çalışmam gerekiyor :)");
                    break;
            }
        } else {
            System.out.println("Lütfen sadece gösterilen şekil ve harflerden birini giriniz");
        }

        //2.yol char if
        Scanner input = new Scanner(System.in);
        System.out.println("ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod.. \nLütfen A , B , C harflerinden birini secin: ");
        char harfi =input.next().toUpperCase().charAt(0);

            switch (harfi){
                default:
                    System.out.println("lütfen sadece gösterilen sekil ve harflerden giriniz");
                    break;
                case 'A':
                    System.out.println("Java is easy");
                    break;
                case 'B':
                    System.out.println("Java is fun");
                    break;
                case 'C':
                    System.out.println("I need to study :)");
                    break;

            }
         //3.ternary cozum
        System.out.println("   ***  ternary cozum   ***   ");
        Scanner scn = new Scanner(System.in);
        System.out.println("ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod.. \nLütfen A , B , C harflerinden birini secin: ");
        char harf2 =scn.next().toUpperCase().charAt(0);
        System.out.println(harf2== 'A' ? "Java is easy" : harf2 == 'B' ? "Java is fun" : harf2 == 'C' ? "I need to study :)" : "ebık gabık :)");




    }
}
