package j08_Loops.Loop03_DoWhileLoop.task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */
  /*       Scanner scan = new Scanner(System.in);
        System.out.println("tam kare olması kontrol edilecek bir pozitif tamsayı giriniz: ");
        int sayi = scan.nextInt();
        int karekok = 1;
        int flag = 0;

       while (karekok * karekok <= sayi) {
            if (karekok * karekok == sayi) {
                System.out.println(" girilen sayı tam karedir");
                flag++;
            }
            karekok++;
        }
        if (flag == 0) {
            System.out.println("girilen sayı tam kare değil ");
        }
*/

        System.out.println("do while ile");
        Scanner scan = new Scanner(System.in);
        System.out.println("tam kare olması kontrol edilecek bir pozitif tamsayı giriniz: ");
        int sayi = scan.nextInt();
        int karekok = 1;
        int flag = 0;
        do {
            if (karekok * karekok == sayi){
                System.out.println("Girilen sayinın bir karekoku vardir yani tam karedir.\nve o karekok=> "+karekok);
                flag++;
            }
            karekok++;

        }while (karekok * karekok <= sayi);
        if (flag == 0) {
            System.out.println("girilen sayı tam kare değil ");
        }


    }
}
