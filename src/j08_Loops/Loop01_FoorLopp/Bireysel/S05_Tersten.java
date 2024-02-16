package j08_Loops.Loop01_FoorLopp.Bireysel;

import java.util.Scanner;

public class S05_Tersten {
    public static void main(String[] args) {
        //kullanıcının girdiği stringi tersten yazdır.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir string giriniz.");
        String str = scan.nextLine();


        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));

        }
        System.out.println();
   /*     //kullanıcıdan string al terse cevir ve kaydet.

        System.out.println("lütfen bir string giriniz.");
        String str2 =scan.nextLine();
        String tersten="";

        for(int i=str.length()-1;i>=0; i--){
            tersten+=str2.charAt(i);

        }
        str2=tersten;
        System.out.println("str2 nin son hali: "+str2);
*/
        //kullanıcıdan string al palidrom olup olmadığını kontrol et.(yazılısı tersten aynı olan madam)
        System.out.println("lütfen bir string giriniz.");
        String str2 = scan.nextLine();
        String tersten = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            tersten += str2.charAt(i);

        }
        if (str2.equalsIgnoreCase(tersten)) {
            System.out.println("palidromdur");
        } else System.out.println("p değildir");


    }
}
