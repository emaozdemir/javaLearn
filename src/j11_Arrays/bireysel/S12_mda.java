package j11_Arrays.bireysel;

public class S12_mda {
    public static void main(String[] args) {

        //1.soru->verilen 2 katlı arrayde bulunan cift sayilari toplayip,
        //sonucu yazdıran method create ediniz.
        int [][] arr ={{3,5,6},{1,8,2,3,4,2},{1,8,0,4}};
        ciftToplam(arr);
        //2.soru->  verilen 2 katlı arrayde bulunan tum elementlerin çaprimini bize döndüren method create ediniz.
        System.out.println(tumElemanlarinCarpim(arr));


    }
    public static int tumElemanlarinCarpim(int [][] arr)  {
        int carpim = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];

            }
        }
        return carpim;


        //verilen 2 katlı arrayde bulunan cift sayilari toplayip,
        //sonucu yazdıran method create ediniz.
      //  int [][] arr ={{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};
      //  ciftToplam(arr);

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
