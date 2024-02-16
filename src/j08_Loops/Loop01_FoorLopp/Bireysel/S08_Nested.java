package j08_Loops.Loop01_FoorLopp.Bireysel;

import java.util.Scanner;

public class S08_Nested {
    /* kullanıcıdan satır sutun iste sekil yap
    örnek satir 5,sutun 3
    1 2 3
    2 4 6
    3 6 9
    4 8 12
    5 10 15

    * * * * * * *
    * * * * * * *
    * * * * * * *
    * * * * * * *
    * * * * * * *

    2 3 4 5 6 7 8
    3 4 5 6 7 8 9
    4 5 6 7 8 9 10

    sadece satır sayisi al ve
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

    *
    * *
    * * *
    * * * *

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz: ");
        int satir = scan.nextInt();
        System.out.println("lütfen sutun giriniz");
        int sutun = scan.nextInt();
    /*       for (int i=1 ; i<=satir;i++){
             for (int j =1; j<=sutun; j++){
                 System.out.print((i*j)+" ");
             }
             System.out.println();
         }
    */
     /*   for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print( "* ");

            }
            System.out.println();
        }

    */
    /*    for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <sutun ; j++) {
                System.out.print((i+j)+" ");
            }
            System.out.println();
        }
*/
   /*     for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
*/
        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }


    }

}
