package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki gün hangi gündür bunu  print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız
        Scanner sc = new Scanner(System.in);
        System.out.println("pazartesi->1\nsali->2\ncarsamba->3\npersembe->4\ncuma->5\ncumartesi->6\npazar->7\nHaftanın kacıncı günü oldugunu secin: ");
        int gun = sc.nextInt();
        if (gun >0 && gun<8) {
            int sonrasi=(gun+100)%7;
            switch (sonrasi) {
                case 1:
                    System.out.println("girilen gunun 100 gun sonrası pazartesi");
                    break;
                case 2:
                    System.out.println("girilen gunun 100 gun sonrası sali");
                    break;
                case 3:
                    System.out.println("girilen gunun 100 gun sonrası carsamba");
                    break;
                case 4:
                    System.out.println("girilen gunun 100 gun sonrası persembe");
                    break;
                case 5:
                    System.out.println("girilen gunun 100 gun sonrası cuma");
                    break;
                case 6:
                    System.out.println("girilen gunun 100 gun sonrası cumartesi");
                    break;
                case 7:
                    System.out.println("girilen gunun 100 gun sonrası pazar");
                    break;
                default:
            }


        }else System.out.println("lütfen gecerli güne ait sayı giriniz");






    }
}

