package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
        Scanner sc= new Scanner(System.in);
        System.out.println("lütfen cinsiyet giriniz:  (kadın , erkek şeklinde lütfen) " );
        String cinsiyet = sc.nextLine();
        System.out.println("lütfen yaşını giriniz: ");
        int yas = sc.nextInt();
        if (cinsiyet.equalsIgnoreCase("kadın")){
            if (yas>=18){
                System.out.println("Kadın");
            }else System.out.println("Kız çocuk");
        }else if (cinsiyet.equalsIgnoreCase("erkek")){
            if (yas>=18){
                System.out.println("Yetişkin");
            }else System.out.println("Erkek çocuk");
        }else System.out.println("lütfen tekrar deneyin..");



    }
}































