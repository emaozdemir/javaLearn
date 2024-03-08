package j20_StaticKeyword.Task04;

class Bisiklet {
    private int hiz;
    private int vites;

    public Bisiklet() {
        hiz = 0;
        vites = 1;
    }

    public void hizDegistir(int yeniHiz) {
        hiz = yeniHiz;
    }

    public void vitesArtir() {
        if (vites < 5) {
            vites++;
        } else {
            System.out.println("Vites 5'ten büyük olamaz!");
        }
    }

    public void vitesAzalt() {
        if (vites > 1) {
            vites--;
        } else {
            System.out.println("Vites 1'den küçük olamaz!");
        }
    }

    public void durumGoster() {
        System.out.println("Hız: " + hiz + ", Vites: " + vites);
    }
}
