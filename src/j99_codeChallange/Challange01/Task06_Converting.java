package j99_codeChallange.Challange01;

import java.util.Scanner;
public class Task06_Converting {
    public static void main(String[] args) {
        /*
         task->
         girilen sıcaklık değerini Fahrenhayt'tan Santigrat derecesine çeviren code create ediniz.
         formül:c = (f-32)*5/9;
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" sıcaklık girer misiniz : ");
        double sıcaklık = sc.nextDouble();
        double c = (sıcaklık - 32) * 5 / 9;
        System.out.println(c);







    }
}
