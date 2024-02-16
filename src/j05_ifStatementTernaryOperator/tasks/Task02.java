package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen üçgenin birinci kenar uzunlugu giriniz: ");
        int k1 = scan.nextInt();
        System.out.println("lütfen üçgenin ikinci kenar uzunlugu giriniz: ");
        int k2 = scan.nextInt();
        System.out.println("lütfen üçgenin üçüncü kenar uzunlugu giriniz: ");
        int k3 = scan.nextInt();
        if (k1==k2 && k1==k3){
            System.out.println("Eşkenar üçgen");
        }else if ((k1==k2 && k1!=k3) || (k1==k3 && k1!=k2) || (k2==k3 && k2!=k1)){
            System.out.println("Ikizkenar üçgen");
        }else System.out.println("Çeşitkenar üçgen");


    }


}
