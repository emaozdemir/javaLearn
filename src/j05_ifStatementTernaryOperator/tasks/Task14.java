package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("merhaba emeklilik durumu hesapması için lütfen cinsiyetinizi giriniz : ");
        String cinsiyet = sc.nextLine();
        if (cinsiyet.equalsIgnoreCase("KADIN")){
            System.out.println("lütfen yasınızı giriniz: ");
            int yas = sc.nextInt();
            if(yas >= 60 ){
                System.out.println("lütfen prim gunu giriniz: ");
                int primGunu = sc.nextInt();
                if(primGunu >= 6000){
                    System.out.println("tebrikler emeklisiniz!");
                }else System.out.println("malesef emekli değilsiniz! kalan gününüz = " +(primGunu - 6000));
            }else System.out.println("malesef emekli değilsiniz! kalan yılınız = " +(yas - 60));

        }else if (cinsiyet.equalsIgnoreCase("ERKEK")){
            System.out.println("lütfen yasınızı giriniz: ");
            int yas = sc.nextInt();
            if(yas >= 65 ){
                System.out.println("lütfen prim gunu giriniz: ");
                int primGunu = sc.nextInt();
                if(primGunu >= 7000){
                    System.out.println("tebrikler emeklisiniz!");
                }else System.out.println("malesef emekli değilsiniz! kalan gününüz = " +(primGunu - 7000));
            }else System.out.println("malesef emekli değilsiniz! kalan yılınız = " +(yas - 65));

        }else System.out.println("lütfen tekrar deneyiniz");




    }
}
