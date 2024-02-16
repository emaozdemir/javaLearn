package j07_StringManipulation;

import java.util.Scanner;

public class C06_SubString {
    /*substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> exclusive/haric*/
    public static void main(String[] args) {
        String str ="madem geldin dunyaya calis Java'ya";
        System.out.println(str.substring(5));// geldin dunyaya calis Java'ya
        System.out.println(str.length());//34
        //str nin son 10 karakterini print ediniz.
        System.out.println(str.substring(str.length()-10));//is Java'ya
         // str nin ilk 10 karakterini print ediniz.
        System.out.println(str.substring(0,10));//madem geld
        // str nin ilk karakterini print ediniz
        System.out.println(str.substring(0,1));//m
        System.out.println(str.charAt(0));//m
        //str nin son karakterini print ediniz
        System.out.println(str.substring(str.length()-1));//a

        // task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz. -> kale:elak
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 harfli bir metin giriniz: ");
        String metin = scan.nextLine();
        System.out.println(metin.substring(metin.length()-1) + metin.substring(2,3) + metin.substring(1,2) + metin.substring(0,1));
        System.out.println(""+metin.charAt(metin.length()-1)+metin.charAt(2)+metin.charAt(1)+metin.charAt(0));


    }
}
