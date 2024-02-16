package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task05 {
    /* task-> girilen satır ve sutun değerleri için aşağıdaki şekli print eden code create ediniz.
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen satır sayısı giriniz: ");
        int satir=sc.nextInt();
        System.out.println("Lütfen sutun sayısı giriniz: ");
        int sutun=sc.nextInt();

        for (int i=0; i<satir;i++){
            for (int  j=0; j<sutun;j++){
                System.out.print("* ");
            }
            System.out.println();//dumy hayalet komut satır düzeni sağlar.
        }



    }


}
