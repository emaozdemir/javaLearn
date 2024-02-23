package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
    /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz
        */

       Scanner scan=new Scanner(System.in);
        System.out.println("100'den kucuk bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>100||sayi<0){
            System.out.println("100'den buyuk girme dedim sana");
        }else {
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("JavaCAN");
                } else if (i % 3 == 0) {
                    System.out.println("Java");
                } else if (i % 5 == 0) {
                    System.out.println("CAN'dir");
                } else System.out.println(i + " ");
            }
        }
        /*
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
         */



    }
}
