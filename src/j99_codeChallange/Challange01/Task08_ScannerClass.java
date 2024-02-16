package j99_codeChallange.Challange01;

import java.util.Scanner;

public class Task08_ScannerClass {

    public static void main(String[] args) {
          /*
 Task->
girilenyaricap değerei için cemberin cevre ve alanını  print eden code create ediniz.

*/
        Scanner sc = new Scanner(System.in);
        System.out.println(" lütfen yarı cap giriniz : ");
        int yarıc= sc.nextInt();
       /*double cev = 2 * Math.PI * yarıc;
        double alan = Math.PI * Math.pow(yarıc, 2);
        System.out.println(cev +" "+ alan);*/
        System.out.println("cevre : "+ (2*yarıc*3.14) + " alan : " + (yarıc*yarıc*3.14));
        //System.out.println("alan : " + (yarıc*yarıc*3.14));

        







    }
}
