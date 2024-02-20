package j11_Arrays.bireysel;

public class S11_ortalamaBulma {
    public static void main(String[] args) {
        /*
        verilen iki katli int bir arrayde cift sayi olan elementlerin
         adedini double olarak ortalamasını yazdırın,
        */
        int[][] ikiKatliArr = {{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};
        double toplam = 0;
        int count=0;
        for (int i = 0; i < ikiKatliArr.length; i++) {
            for (int j = 0; j < ikiKatliArr[i].length; j++) {
                if (ikiKatliArr[i][j] %2==0) {
                    toplam += ikiKatliArr[i][j];
                    count++;
                }
            }
        }
        System.out.println(count + " adet \nortalamasi "+toplam/count);


    }
}
