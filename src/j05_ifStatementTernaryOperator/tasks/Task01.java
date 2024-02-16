package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("lütfen bir yas değeri giriniz: ");
        int yas = sc.nextInt();
        if(yas>=0 && yas<=4){
            System.out.println("bebeklik evresindesiniz!");
        }else if(yas>=5 && yas<=12){
            System.out.println("cocukluk evresindesiniz!");
        }else if(yas>=13 && yas<=20 ){
            System.out.println("genclik evresindesiniz!");
        }else if(yas>=21 && yas<=30 ){
            System.out.println("yetiskinlik evresindesiniz!");
        }else System.out.println("Üzgünüm! tanımlayamadığımız bir evredesiniz.");

    }
}