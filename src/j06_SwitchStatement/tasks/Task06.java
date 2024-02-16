package j06_SwitchStatement.tasks;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("girdiğiniz VIP kısaltmasının anlamını görelim: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'v':
                System.out.println("very");
                break;

            case 'i':
                System.out.println("important");
                break;

            case 'p':
                System.out.println("person");
                break;

            default:
                System.out.println("gecerli bir harf giriniz");
        }






    }
}
