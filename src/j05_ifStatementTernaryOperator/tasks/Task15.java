package j05_ifStatementTernaryOperator.tasks;

import java.beans.EventHandler;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("ehliyetiniz var mı ? (varsa evet, yoksa hayır yazın)");
        String ehliyet = scan.nextLine();
        if (ehliyet.equalsIgnoreCase("evet")){
            System.out.println("lütfen kac yıldır arac kullandığınızı giriniz: ");
            int yil = scan.nextInt();
            if (yil >= 7){
                System.out.println("lütfen kac km arac kullandığınızı giriniz: ");
                int km = scan.nextInt();
                if (km >= 100000){
                    System.out.println("kontak anahtarları senindir!");
                }else System.out.println("malesef "+ (100000-km)+ " km  sonra kontağı verebiliriz. biraz daha yol yapmalısın..");

            }else System.out.println("malesef "+ (7-yil)+ " yıl sonra kontağı verebiliriz. biraz daha tecrübe kazanmalısın.." );

         }else System.out.println("umarım en yakın zamanda ehliyet alırsınız !");











    }
}





















