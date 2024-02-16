package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir notunuzu giriniz: ");
        int sonuc = sc.nextInt();
        int notDegeri=0;
        if (sonuc>= 0 && sonuc < 50) {
            notDegeri = 1;
        }else if (sonuc>= 50 && sonuc < 60) {
            notDegeri = 2;
        }else if (sonuc>= 60 && sonuc < 80) {
            notDegeri = 3;
        }else if (sonuc>= 80){
            notDegeri = 4;
        }else System.out.println("Lütfen gecerli not giriniz");
        System.out.println("**not değeriniz**");
        switch (notDegeri) {
            case 1:
                System.out.println("D");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("B");
                break;
            case 4:
                System.out.println("A");
                break;
            default:
                System.out.println("Lütfen gecerli not giriniz");
                break;
        }



    }


}
