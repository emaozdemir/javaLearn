package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task07 {

/*    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz
        enKucuk();

    }//main sonu

    public static void enKucuk() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kıyaslayacağınız üç sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        int enKucuk = (sayi1 < sayi2 && sayi1 < sayi3) ? sayi1 : (sayi2 < sayi3 && sayi2 < sayi1) ? sayi2 : sayi3;

        System.out.println("En küçük sayı: " + enKucuk);

    }

 */


    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz

        numberControl(enterNumbers(1), enterNumbers(2), enterNumbers(3));

    }//main sonu

    private static void numberControl(int i, int j, int k) {
        int status = (i < j && i < k) ? i
                : (j < i && j < k) ? j
                : k;
        System.out.println("smallest number: " + status);
    }
    private static int enterNumbers(int i) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the " + i + ". number: ");
        return scan.nextInt();
    }


}//Class sonu
