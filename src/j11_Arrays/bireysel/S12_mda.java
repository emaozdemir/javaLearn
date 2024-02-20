package j11_Arrays.bireysel;

public class S12_mda {
    public static void main(String[] args) {
        //verilen 2 katlı arrayde bulunan cift sayilari toplayip,
        //sonucu yazdıran method create ediniz.
        int [][] arr ={{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};
        ciftToplam(arr);
    }

    private static void ciftToplam(int[][] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                    toplam += arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("toplamları "+toplam);
    }
}
