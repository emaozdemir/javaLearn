package j11_Arrays.bireysel;

public class S04_pozitifSayilariToplama {
    public static void main(String[] args) {
        // verilen arraydeki pozitif tamsayi toplayip sonucu döndüren bir method yaziniz.
        int[] arr = {1, 2, -3, 4, 5, 6, -9, -2};
        System.out.println("pozitifSayilariToplama(arr) = " + pozitifSayilariToplama(arr));

        //verilen int arraydeki pozitif tamsayilarin ortalamasini double olarak döndüren bir method olusturun.
        System.out.println("pozitifSayilarinOrtamalasi(arr) = " + pozitifSayilarinOrtamalasi(arr));


    }

    private static int pozitifSayilariToplama(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplam += arr[i];
            }
        }
        return toplam;
    }

    public static double pozitifSayilarinOrtamalasi(int[] arr) {
        int toplam = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplam += arr[i];
                count++;
            }
        }
        return toplam / count;

    }
}
