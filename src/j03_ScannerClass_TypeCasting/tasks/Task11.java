package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("bir  karakter giriniz = ");

        char input = sc.next().charAt(0);
        //int charDegeri = input;
        //System.out.println("Girdiginiz \'" + input + "\' karakterinin ascii degeri : " + charDegeri);
        System.out.println(input +0);



    }


}
