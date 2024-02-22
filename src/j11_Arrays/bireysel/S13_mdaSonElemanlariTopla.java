package j11_Arrays.bireysel;

public class S13_mdaSonElemanlariTopla {
    public static void main(String[] args) {
        // verilen 2 katli arraydeki her bir innerin arrayin son elementlerin toplamını yazdırın
        int[][] arr = {{3, 5, 6}, {1, 8, 2, 3, 4, 2}, {1, 8, 0, 4}};
        //her birinin son elemanini = arr[0][arr[0].length -1] diye aliriz normal sarlarda da.
        System.out.println("arr[0] ın son elemanini bulmak -> "+arr[0][arr[0].length -1]);
        sonElemanlariToplam(arr);

    }

    private static void sonElemanlariToplam(int[][] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam+= arr[i][arr[i].length -1];
        }
        System.out.println("son elemanlarinin toplami= "+toplam);


    }
}
