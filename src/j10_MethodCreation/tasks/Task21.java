package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("tamsayi giriniz:  ");
        int sayi = scan.nextInt();
        kacBasamakli(sayi);
        //2.yol
        kacBasamakli2(sayi);
        //3.yol
        kacBasamakli3(sayi);


    }

    private static void kacBasamakli3(int sayi) {
        int sayac = 0;
        while (sayi != 0) {
            sayi = sayi / 10;

            sayac++;
        }
        System.out.println("Basamak sayısı= " + sayac);
     /*   sayi = 123, sayac = 0
        sayi / 10 = 12, sayac = 1
        sayi / 10 = 1, sayac = 2
        sayi / 10 = 0, sayac = 3

      */

    }

    private static int kacBasamakli2(int methSayi) {
        int basamakSayisi = (int) Math.log10(methSayi) + 1;//bu fonksiyonun döndüreceği değer sayının basamak sayısının tam olarak bir eksiği olacaktır.
        // Çünkü logaritma işlemi, sayının basamak sayısının tam olarak bir eksiğini verir.
        System.out.println("girilen sayi -> " + basamakSayisi + " basamaklıdır.");
        return basamakSayisi;
    }

    private static int kacBasamakli(int methSayi) {
        String yeni = String.valueOf(methSayi);
        int count = 0;
        for (int i = 0; i < yeni.length(); i++) {
            count++;
        }
        System.out.println("girilen sayi -> " + count + " basamaklıdir.");
        return count;
    }
}
