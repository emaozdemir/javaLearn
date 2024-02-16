package j99_codeChallange.Challange05;

public class Task09 {

    /*
    Task-> 11'den 120'ye kadar 4 ve 6 ya tam bölünebilen sayı adedini ve toplamlarını print eden code create ediniz.
     */
    public static void main(String[] args) {
        int toplam = 0;
        int count = 0;
        for (int i = 11; i <= 120; i++) {
            if (i % 4 == 0 && i % 6 == 0) {//i%12 de yapabilirdik
                System.out.println(i + " ");
                toplam += i;
                count++;
            }
        }
        System.out.println("toplamları= " + toplam +"\nsayı sayısı= " + count);

        System.out.println("****");
        int sayi=11;
        int sayac=0;
        while (sayi<=120){
            if (sayi%12==0){
                System.out.print(sayi+" ");
                toplam+=sayi;
                sayac++;
            }
            sayi++;
        }
        System.out.println();
        System.out.println("11 den 120 ye kadar 4 ve 6 ya bölünen sayıların toplamı = " + toplam);
        System.out.println("11 den 120 ye kadar 4 ve 6 ya bölünen sayıların adeti = "+sayac);

    }

}
