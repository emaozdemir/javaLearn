package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /* task->
    Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz


    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Örnek :
    saatlik çalışma ücreti : 40.0
   iş başı saati : 9.0
    paydos saati : 20.0
    fazla mesaiyi saat ücreti çarpanı: 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("saatlik çalışma ücretiniz ne kadardir?  ");
        double saatlikUcret=scan.nextInt();
        System.out.println(" hangi saatler arasında çalısırsin?  ");
        double mesaiSaati=scan.nextInt();
        System.out.println("fazla mesaiye kalırsanız  kazancını kaç ile katlayacağını giriniz:   ");
        double extraKati=scan.nextInt();

    }//main sonu


}//class sonu
