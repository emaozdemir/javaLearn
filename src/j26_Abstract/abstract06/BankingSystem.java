package j26_Abstract.abstract06;

import java.util.Scanner;

public class BankingSystem {//tekrar bak
    public static void main(String[] args) {
        // kullanıcıya hangi bankada hesap açmak istediğini sorup bir menü ile
        // hesabını açıınız
        // sonra kullanıcıya yine bir menü ile para yatırma ve çekme işlemi istemiyorsa çıkış
        // işlemi yaptırınız.
        // en son bankanın bakiyesini (balance)  ını yazdırınız.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya hangi bankada hesap açmak istediğini soralım
        System.out.println("Hangi bankada hesap açmak istiyorsunuz?");
        System.out.println("1. Wells Fargo");
        System.out.println("2. Chase Bank");
        System.out.println("3. BOA");
        System.out.print("Seçiminiz: ");
        int bankaSecim = scanner.nextInt();

        Bank banka = null;

        // Kullanıcının seçimine göre ilgili banka sınıfından bir nesne oluşturalım
        switch (bankaSecim) {
            case 1:
                banka = new WellsFargo(0); // Başlangıç bakiyesi 0 olarak belirlendi
                break;
            case 2:
                banka = new ChaseBank(0); // Başlangıç bakiyesi 0 olarak belirlendi
                break;
            case 3:
                banka = new BOA(0); // Başlangıç bakiyesi 0 olarak belirlendi
                break;
            default:
                System.out.println("Geçersiz seçim!");
                return;
        }

        // Kullanıcıya işlem menüsünü gösterelim
        boolean devam = true;
        while (devam) {
            System.out.println("\nİşlem Seçiniz:");
            System.out.println("1. Para Yatırma");
            System.out.println("2. Para Çekme");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminiz: ");
            int islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                    double yatirilanMiktar = scanner.nextDouble();
                    System.out.println(banka.deposit(yatirilanMiktar));
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                    double cekilenMiktar = scanner.nextDouble();
                    System.out.println(banka.withdraw(cekilenMiktar));
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz işlem!");
            }
        }

        // Son olarak, bankanın güncel bakiyesini yazdıralım
        System.out.println("Güncel Bakiye: " + banka.getBalance());
    }


    }

