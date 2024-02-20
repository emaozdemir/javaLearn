package j11_Arrays.bireysel;

public class S05_elemanKullanimSayisi {
    public static void main(String[] args) {
        /*
        verilen bir arrayde istenen bir elemanin olup olmadıgını
        varsa kaç kere kullanildiğini yazdiran bir method olusturun.
         */
        int[] arr = {5, 7, 9, 10, 3, 6, 7, 8, 9, 0, 9, 4, 3, 2, 7, 1, 5, 6, 7, 8, 9, 0, 9, 4, 3, 2, 7,};
        elemanKullanimSayisi(arr, 9);
        elemanKullanimSayisi(arr, 10);
        elemanKullanimSayisi(arr, 0);


    }

    public static void elemanKullanimSayisi(int[] arr, int arananSayi) {
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                sayac++;
            }

        }
        if (sayac == 0) {
            System.out.println("verilen sayi arrayda hiç kullanılmamıs..");
        } else System.out.println("verilen " + arananSayi + " sayisi " + sayac + " kere kullanilmis.");

    }
}
