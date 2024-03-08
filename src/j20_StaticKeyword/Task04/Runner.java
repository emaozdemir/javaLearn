package j20_StaticKeyword.Task04;

import java.util.Scanner;

public class Runner {
    /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bisiklet bisiklet = new Bisiklet();

        int choice;
        do {
            System.out.println("\n1. Hız Değiştir");
            System.out.println("2. Vites Artır");
            System.out.println("3. Vites Azalt");
            System.out.println("4. Durum Göster");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Yeni hızı girin: ");
                    int yeniHiz = scanner.nextInt();
                    bisiklet.hizDegistir(yeniHiz);
                    break;
                case 2:
                    bisiklet.vitesArtir();
                    break;
                case 3:
                    bisiklet.vitesAzalt();
                    break;
                case 4:
                    bisiklet.durumGoster();
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçenek!");
            }
        } while (choice != 5);
    }
}
