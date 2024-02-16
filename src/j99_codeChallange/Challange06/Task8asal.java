package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task8asal {
    /*
Task->
Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int num = sc.nextInt();
        System.out.println("for ile");
        boolean asalMi = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                asalMi = false;
                break;
            }
        }
        System.out.println(asalMi ? "asal" : "asal değil");

        System.out.println("while ile");
        while (num > 1) {
            if (num%(num-1)==0){
                asalMi = false;
                break;

            }
        }
        System.out.println(asalMi ? "asal" : "asal değil");


    }
}
