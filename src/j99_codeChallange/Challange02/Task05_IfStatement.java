package j99_codeChallange.Challange02;

import java.util.Scanner;

public class Task05_IfStatement {
    public static void main(String[] args) {
       /* Task->
 Girilen jobTitle data için : Eger jobTitle
 qa ise print "is unvaniniz Quality Analyst."
 dev ise print "is unvaniniz Developer."
 ba ise print "is unvaniniz Business Analyst."
 pm ise print "is unvaniniz Project Manager."
 print eden code create ediniz...
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen unvanınıızı giriniz: ");
        String unvan = sc.next();
        if (unvan.equalsIgnoreCase("qa")) {
            System.out.println("is unvaniniz Quality Analyst.");
        }
        else if (unvan.equalsIgnoreCase("dev")) {
            System.out.println("is unvaniniz Developer.");
        }
        else if (unvan.equalsIgnoreCase("ba")) {
            System.out.println("is unvaniniz Business Analyst.");
        }
        else if (unvan.equalsIgnoreCase("pm")) {
            System.out.println("is unvaniniz Project Manager.");
        }else System.out.println("hata! lütfen uygun bir değer giriniz! ");








    }
}
