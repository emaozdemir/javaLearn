package j20_StaticKeyword.Task04;

import java.util.Scanner;
public class Bisiklet {
    private int hiz;
    private int vites;
    public Bisiklet() {
        hiz = 0;
        vites = 1;
    }
    public void hizDegistir(int yeniHiz) {
        this.hiz = yeniHiz;
    }
    public void islemYap(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Hız Değiştir");
            System.out.println("2. Vites Artır");
            System.out.println("3. Vites Azalt");
            System.out.println("4. Durum Göster");
            System.out.println("5. Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçin: ");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Yeni hızı girin: ");
                    int yeniHiz = scanner.nextInt();
                    hizDegistir(yeniHiz);
                    break;
                case 2:
                    vitesArtir();
                    break;
                case 3:
                    vitesAzalt();
                    break;
                case 4:
                    durumGoster();
                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }
    public void vitesArtir() {
        if (vites < 5) {
            vites++;
        } else {
            System.out.println("Vites 5'ten büyük olamaz.");
        }
    }
    public void vitesAzalt() {
        if (vites > 1) {
            vites--;
        } else {
            System.out.println("Vites 1'den küçük olamaz.");
        }
    }
    public void durumGoster() {
        System.out.println("Hız: " + hiz + ", Vites: " + vites);
    }
}