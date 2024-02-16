package j06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {

    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre ayın isimini print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("bir ay giriniz: ");
        int ay = sc.nextInt();

        System.out.println("***if statement ile çözümü***");
        if (ay==1){
            System.out.println("ocak ayı");
        }else if (ay==2){
            System.out.println("subat ayı");
        }else if (ay==3){
            System.out.println("mart ayı");
        }else if (ay==4){
            System.out.println("nisan ayı");
        }else if (ay==5){
            System.out.println("mayıs ayı");
        }else if (ay==6){
            System.out.println("haziran ayı");
        }else if (ay==7){
            System.out.println("temmuz ayı");
        }else if (ay==8){
            System.out.println("ağustos ayı");
        }else if (ay==9){
            System.out.println("eylül ayı");
        }else if (ay==10){
            System.out.println("ekim ayı");
        }else if (ay==11){
            System.out.println("kasım ayı");
        }else if (ay==12){
            System.out.println("aralık ayı");
        } else System.out.println("hatalı giriş yaptınız! ");


        System.out.println("***switch statement ile çözümü***");
        switch (ay) {
            case 1:
                System.out.println("ocak ayı");
                break;
            case 2:
                System.out.println("subat ayı");
                break;
            case 3:
                System.out.println("mart ayı");
                break;
            case 4:
                System.out.println("nisan ayı");
                break;
            case 5:
                System.out.println("mayıs ayı");
                break;
            case 6:
                System.out.println("haziran ayı");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
             case 11:
                 System.out.println("kasım");
                 break;
             case 12:
                 System.out.println("aralık");
                 break;
            default://Switch hiç bir case calısmazsa default calısır.
                //default switch içinde herhangi bir yere yazilabilir run sırası yazim sirasına bakmaz.
        }

    }
}
