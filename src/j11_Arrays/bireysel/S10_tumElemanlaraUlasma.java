package j11_Arrays.bireysel;

public class S10_tumElemanlaraUlasma {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 10};

        // toplamini yazdir;
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.println(toplam);

        int[][] ikiKatliArr = {{3,5},{2,3,4,2},{1}};
        int toplam2 = 0;
        for (int i = 0; i < ikiKatliArr.length; i++) {
            for (int j = 0; j < ikiKatliArr[i].length; j++) {
                toplam2 += ikiKatliArr[i][j];
            }
        }
        System.out.println(toplam2);
    }
}
