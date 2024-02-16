package j11_Arrays;

import java.util.Arrays;

public class C03_Arrays_BinarySearch {
    public static void main(String[] args) {
        // Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu
        int sayiArr[]={23,44,2,11,55,60,32,34,58,22,9,64,42};
        int sayi1=44;
        int sayi2=20;
        System.out.println("***Amele code***");
        boolean flag=false;//bayrak asagi
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]==sayi2){
                flag=true;//bayrak yukari
                break;
            }
        }
        System.out.println(flag?"aradiginiz sayi arrayde mevcut":"aradiginiz sayi arrayde mevcut degil");
        System.out.println("*** cincix code***");
        Arrays.sort(sayiArr);//sort islemi yapildi-> k->b siralandi
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        System.out.println("Arrayde 20'nin varligi : "+Arrays.binarySearch(sayiArr,sayi2));
        System.out.println("Arrayde 44'nin varligi : "+Arrays.binarySearch(sayiArr,sayi1));
    }
}
