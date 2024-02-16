package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz: ");
        int yil = sc.nextInt();
        if (yil %1000 == 0){
            System.out.println("Milenyum");
        }else if (yil % 100 == 0){
            System.out.println("Yüzyıl");
        }else if (yil % 10 == 0){
            System.out.println("Onyıl");
        }else System.out.println("ÖZEL İSMİ OLMAYAN BİR YIL GİRDİNİZ! ");



    }
}

	

