package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {
        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..
        Scanner scan = new Scanner(System.in);
        System.out.println("haftanın bir gününü giriniz: ");
        String gun = scan.next().toLowerCase();
        switch (gun){
            case "pazartesi":
            case "sali":
            case "çarşamba":
            case "perşembe":
            case "cuma":
            case "cumartesi":
            case "pazar":
                System.out.println(gun+" gününü hafta içi");
                break;
            default:
                System.out.println(gun+" gününü hafta sonu");
                break;
        }



    }
}
