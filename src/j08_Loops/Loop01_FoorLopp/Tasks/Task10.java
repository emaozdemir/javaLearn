package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :4
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin=scan.nextLine();
        System.out.println("Girilen metinde sayisini öğrenmek istediğin harfi gir ");
        char harf=scan.next().charAt(0);
        int count=0;
        for (int i =0; i< metin.length(); i++){
            if (metin.charAt(i)==harf){
                count++;
            }
        }
        System.out.println(harf +" sayisi : " + count);

    }
}
