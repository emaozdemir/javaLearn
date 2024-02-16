package j99_codeChallange.Challange02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task06_IfStatement {
    public static void main(String[] args) {
/*
 Task->
 Girilen not değeri için
            A => 90 ~100
            B => 80 ~ 89
            C => 70 ~ 79
            D => 60 ~ 69
            F =>  0 ~ 59
            sartlari aralik belirterek print ediniz

   Girilen saat değeri için
   0 ~12 ==> good morning
12 ~ 15 ==> good afternoon
15 ~ 23 ==> good night
12 ==> good noon
print eden code create ediniz.
  */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen sınav notunuzu  giriniz: ");
        int note = sc.nextInt();
        if (note >= 90 && note <= 100) {
            System.out.println("A");
        }
        else if (note >= 80 && note <= 89) {
            System.out.println("B");
        }
        else if (note >= 70 && note <= 79) {
            System.out.println("C");
        }
        else if (note >= 60 && note <= 69) {
            System.out.println("D");
        }
        else if (note >= 0 && note <= 59) {
            System.out.println("F");
        }else System.out.println("hata !lütfen notunuzu giriniz:");

        System.out.println("2.soru");
        System.out.println("lütfen bir saat giriniz : ");
        int saat = sc.nextInt();
        if (saat >=0 && saat <= 12) {
            System.out.println("good morning");
        }
        else if (saat >= 12 && saat <= 15) {
            System.out.println("good afternoon");
        }
        else if (saat >= 15 && saat <= 23) {
            System.out.println("good night");
        }
        else if (saat == 12) {
            System.out.println("good noon");
        }else System.out.println("hata!lütfen saat giriniz:");











    }
}
