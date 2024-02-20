package j11_Arrays.bireysel;

import java.util.Arrays;

public class S08_arraydeSiralamaveArama {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6, 10};

        String[] isimleri = {"ali", "mahmud", "SEMA", "aslan", "ali", "seval", "hakan"};

        Arrays.sort(arr);//K -> B
        Arrays.sort(isimleri); //ilk harfler ayni ise 2 ye oda ayniysa 3 e bakar asciyi değerlendirir.buyuk kucuk harflilikte asciye göre hseplanir..

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(isimleri));

        int []sayilar={7,8,9,1,2,3,4,5,6,1};

        // bu arrayde 5 var mi?

        // diğer clastan cağırma ile.
        // S05_elemanKullanimSayisi.elemanKullanimSayisi(sayilar, 5);

        //binaryseSearch ile yapınca önce sort yapmalıyız.
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println("Arrays.binarySearch(sayilar, 5) = " + Arrays.binarySearch(sayilar, 5));//5

        //OLMAYAN ELEMANİ ARATİRSAK olmadığı için - olur ve eğer olsaydı kaçıncı indexte olsaydı onu yazdırır.
        System.out.println("Arrays.binarySearch(sayilar, 10) = " + Arrays.binarySearch(sayilar, 10));//-11


    }
}
