package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("lütfen sayı giriniz: ");
        int sayi=sc.nextInt();
        List<Integer> primeNums=new ArrayList<>();
        int count=0;
        for (int i = 2; i <=sayi ; i++) {
            boolean asalMi=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    asalMi=false;
                    break;
                }
            }
            if(asalMi){
                primeNums.add(i);
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println(primeNums);
















       /* ArrayList<Integer> primeNums = new ArrayList<>();
        int sayac=0;
        for (int i = 2; i <=sayi ; i++) {
            if (i==sayi){
                System.out.println("asal");
                sayac++;
                primeNums.add(i);
            } else if (sayi%i==0) {
                System.out.println("asal değil");
                break;
            }
        }
        System.out.println(sayac);
*/

    }
}



