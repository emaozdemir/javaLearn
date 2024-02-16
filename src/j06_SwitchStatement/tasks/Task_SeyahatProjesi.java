package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */
        Scanner sc = new Scanner(System.in);


        double fbilet = (60 / 20) * 5;
        double kbilet = (80 / 20) * 5;
        double bakiye = 1000;
        //double toplamTutar = 0;
        //double paraUstu = 0;

        System.out.println("Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM---   Köln : 80 KM ---(20 KM başına 5 euro bilet parası alınmaktadir.. ");
        String sehir = sc.next().toUpperCase();
        switch (sehir) {
            default:
                System.out.println("hatali giriş.");
                break;
            case "FRANKFURT":

                System.out.println("Rota: " + sehir);
                System.out.println("frankfurt bilet fiyatı : " + fbilet);
                System.out.println("kaç kişiniz ? ");

                int kisi = sc.nextInt();
                switch (kisi) {
                    case 1:
                        System.out.println("bir yolcu için fiyat budur = " + fbilet);
                        System.out.println("bileti aldınız kalan bakiyeniz = " + (bakiye - fbilet));
                        break;
                    case 2:
                        System.out.println("iki yolcu için fiyat budur = " + (fbilet * 2));
                        System.out.println("bileti aldınız kalan bakiyeniz = " + (bakiye - (fbilet * 2)));
                        break;
                    default:
                        System.out.println("hatali giriş 1 yada 2 yolcu hesabı yapılır sadece.");
                        break;

                }
            break;
            case "KOLN":
                System.out.println("rota: " + sehir);
                System.out.println("koln bilet fiyatı : " + kbilet);
                System.out.println("kaç kişiniz ? ");

                int kisi1 = sc.nextInt();
                switch (kisi1) {
                    case 1:
                        System.out.println("bir yolcu için fiyat budur = " + kbilet);
                        System.out.println("bileti aldınız kalan bakiyeniz = " + (bakiye - kbilet));
                        break;
                    case 2:
                        System.out.println("iki yolcu için fiyat budur = " + (kbilet * 2));
                        System.out.println("bileti aldınız kalan bakiyeniz = " + (bakiye - (kbilet * 2)));
                        break;
                    default:
                        System.out.println("hatali giriş 1 yada 2 yolcu hesabı yapılır sadece.");
                        break;

                }
            break;




























       /* Scanner scanner = new Scanner(System.in);
        System.out.println("nereye yolculuk edeceksiniz ? ");
        System.out.println("1. Köln veya Frankfurta gidebilirsiniz.");
        Scanner scan = new Scanner(System.in);

        System.out.println("Seyehat Programına Hoş Geldiniz");
        System.out.println("******");
        System.out.println("Frankfurt: 60 KM\nKöln: 80 KM\n20 KM başına 5 EUR bilet parası alınmaktadir");
        System.out.print("Nereye yolculuk etmek istiyorsunuz? [Frankfurt - Köln]: ");
        String rota = scan.next().toUpperCase();

        int frankfurtKm = 60;
        int kolnKm = 80;
        double kmBirimFiyat = 0.25;
        double rotaFiyat = 0;

        if (rota.equals("FRANKFURT")) {
            System.out.println("Rota: " + rota);
            rotaFiyat = kmBirimFiyat * frankfurtKm;
            System.out.println("Frankfurt Bilet Fiyatı " + rotaFiyat + " EUR");
        } else {
            System.out.println("Rota: " + rota);
            rotaFiyat = kmBirimFiyat * kolnKm;
            System.out.println("Köln Bilet Fiyatı " + rotaFiyat + " EUR\n");
        }

        System.out.print("Devam etmek istiyor musunuz? [E/H] Giriniz: ");
        String cevap = scan.next().toUpperCase();

        int biletAdedi = 0;

        if (cevap.charAt(0) == 'E') {
            System.out.print("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir) [1/2] Giriniz: ");
            biletAdedi = scan.nextInt();
            switch (biletAdedi) {
                case 1:
                    System.out.print("1 kişilik bilet fiyatı: " + (rotaFiyat) + " EUR\n");
                    break;
                case 2:
                    rotaFiyat *= 2;
                    System.out.print("2 kişilik bilet fiyatı: " + rotaFiyat + " EUR\n");
                    break;
            }
            System.out.println("Yolculuk bilgileri:");
            System.out.print("Rota: " + rota);
            System.out.println(" " + biletAdedi + " Kişilik\n");
            System.out.println("*********");

            double bakiye = 1000;

            System.out.print("Ödeme yapacak mısınız? [E/H]: ");
            String odemeCevap = scan.next().toUpperCase();

            if (odemeCevap.charAt(0) == 'E') {
                System.out.println(" ");
                System.out.println("Bakiye: " + bakiye + " EUR");
                System.out.println("Toplam Tutar: " + rotaFiyat + " EUR");
                System.out.println("Kalan Bakiyeniz: " + (bakiye - rotaFiyat) + " EUR");
            } else {
                System.out.println("Ödeme yapılmadı.... Yine bekleriz...");
            }
        } else {
            System.out.println("The end");
        }*/


        }
    }
    }
