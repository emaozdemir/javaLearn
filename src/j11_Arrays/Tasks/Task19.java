package j11_Arrays.Tasks;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        //  int outarr[][]={{27},{},{18}};

        // output->? int arr3[][]={{8,10},{13,15},{18}};

    /*     for (int i = 0; i < (arr1.length > arr2.length ? arr2.length : arr1.length); i++) {
            for (int j = 0; j < (arr1[i].length<arr2[i].length?arr1[i].length:arr2[i].length); j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");

            }

        }
        for (int i = 0; i < (Math.min(arr1.length, arr2.length)); i++) {
            for (int j = 0; j < Math.min(arr1[i].length, arr2[i].length); j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
*/

            //int[] []yeniArr=new int[arr1.length>arr2.length? arr2.length : arr1.length][];

            // [arr1[0].length>arr2[0].length?arr2[0].length :arr1[0].length];

            // int[][]yeniArr2=new int[yeniArr.length][];


            // arr3'ü hesaplamak için arr1 ve arr2'nin boyutlarını kullanarak döngüler oluştururuz.
           for (int i = 0; i < arr1.length || i < arr2.length; i++) {
                // İç dizilerin uzunluklarını kontrol ederek, her iki dizide de aynı indekse sahip elemanlar varsa toplarız.
                for (int j = 0; j < (arr1[i].length > arr2[i].length ? arr1[i].length : arr2[i].length); j++) {
                    // Eğer her iki dizide de j indeksi varsa, elemanları toplayıp yazdırırız.
                    if (j < arr1[i].length && j < arr2[i].length) {
                        System.out.println(arr1[i][j] + arr2[i][j]);
                    } else if (j < arr1[i].length) {
                        // Eğer sadece arr1'de j indeksi varsa, sadece arr1'in elemanını yazdırırız.
                        System.out.println(arr1[i][j]);
                    } else if (j < arr2[i].length) {
                        // Eğer sadece arr2'de j indeksi varsa, sadece arr2'nin elemanını yazdırırız.
                        System.out.println(arr2[i][j]);
                    }
                }
            }


        }
    }

