package j11_Arrays.Tasks;

public class Task01 {
    public static void main(String[] args) {
<<<<<<< HEAD
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.
=======
        //Task-> girilen bir int array elemanlarını buyukten kucuge print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı bir array istersin: ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("lutfen istediğiniz elemanları giriniz: ");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        for (int i =arr.length - 1; i >= 0; i--){
            System.out.print((arr[i] + " ").getClass());// getclassla clas kontrolu yaptık
        }
        System.out.println();

        int [] buyuktenKucuge = new int[arrayLength];
        int index = 0;
        for (int i =arr.length - 1; i >= 0; i--) {
           buyuktenKucuge[index]=(arr[i]);
            index++;

        }
        System.out.println(Arrays.toString(buyuktenKucuge));







       // Arrays.sort(arr, Collections.reverseOrder()); // diziyi büyükten küçüğe sıralamak için
        for (int i = 0; i < arrayLength- 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                int tmp = 0; // geçici değişken
                if (arr[j] < arr[j + 1]) { // bitişik elemanları karşılaştırmak için
                    tmp = arr[j]; // yer değiştirmek için
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println("Sıralanmış dizi: " + Arrays.toString(arr)); // sıralanmış diziyi ekrana yazdırmak için

      /*  int[] yeniarr = new int[arr.length];
       // int yeniSiralama = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "");

        }
        System.out.println(yeniarr);

       /* System.out.println("yeniArrElemanSayisi = " + yeniArrElemanSayisi);
        String [] yeniArr=new String[yeniArrElemanSayisi];
        int yeniIndex=0;
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length()<6){
                yeniArr[yeniIndex]=isimler[i];
                yeniIndex++;
            }
        }
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
*/
>>>>>>> dbecdd865089b7465cb5feda259525d746b1bb7c

    }
}
