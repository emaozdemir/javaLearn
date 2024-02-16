package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz ? ");
        String metin = scan.nextLine();
        System.out.println("metindeki kaçıncı index değerini görmek istersiniz ?");
        int index = scan.nextInt();

        if (metin.length() > index) {
            System.out.println(metin.charAt(index));
        }else System.out.println("girdiğiniz index değeri bulunamadı ");
    }
}
