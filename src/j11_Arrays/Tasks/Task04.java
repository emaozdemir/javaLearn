package j11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortalamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("kaç elemanlı bir array istersin: ");
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("istediğiniz elemanlarını giriniz: ");
        double toplam= 0;
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = sc.nextInt();
            toplam+=arr[i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(toplam);
        int count= 0;
        double ortalama=toplam/arrayLength;
        System.out.println(ortalama);
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i]>ortalama){
                System.out.print("girilen ve ort den buyuk olanlar = "+arr[i]+ " ");
                count++;
            }

        }
       //System.out.println();
        System.out.println("\n"+count);



    }

}
