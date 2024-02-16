package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task18 {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("kacinci ay doğdunuz ?");
        int ay = sc.nextInt();

        System.out.println("doğdunuz günü giriniz: ");
        int gun = sc.nextInt();

        if (gun >= 1 && gun <= 31) {
            if (ay==1){
                if (gun<=21){
                    System.out.println("oğlak burcu");
                }else System.out.println("kova burcu");
            }
            if (ay==2){
                if (gun<=19){
                    System.out.println("kova burcu");
                }else System.out.println("balık burcu");
            }
            if (ay==3){
                if (gun<=20){
                    System.out.println("balık burcu");
                }else System.out.println("koc burcu");
            }
            if (ay==4){
                if (gun<=20){
                    System.out.println("koc burcu");
                }else System.out.println("boğa burcu");
            }
            if (ay==5){
                if (gun<=21){
                    System.out.println("boğa burcu");
                }else System.out.println("ikizler burcu");
            }
            if (ay==6){
                if (gun<=22){
                    System.out.println("ikizler burcu");
                }else System.out.println("yengeç burcu");
            }
            if (ay==7){
                if (gun<=22){
                    System.out.println("yengeç burcu");
                }else System.out.println("aslan burcu");
            }
            if (ay==8){
                if (gun<=22){
                    System.out.println("aslan burcu");
                }else System.out.println("başak burcu");
            }
            if (ay==9){
                if (gun<=22){
                    System.out.println("başak burcu");
                }else System.out.println("terazi burcu");
            }
            if (ay==10){
                if (gun<=21){
                    System.out.println("terazi burcu");
                }else System.out.println("akrep burcu");
            }
            if (ay==11){
                if (gun<=21){
                    System.out.println("akrep burcu");
                }else System.out.println("yay burcu");
            }
            if (ay==12){
                if (gun<=21){
                    System.out.println("yay burcu");
                }else System.out.println("oğlak burcu");
            }

        }else System.out.println("hata! lütfen 1 ve 31 arasında bir gün giriniz");

    }
}


