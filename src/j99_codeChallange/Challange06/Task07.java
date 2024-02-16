package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task07 {


    // Task-> Girilen bir stringin harflerini boşluk " " ve a harfi hariç  alt alta olacak
    // sekilde print eden code create ediniz.
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)!=' ' && str.charAt(i)!= 'a') {
                System.out.println(str.charAt(i));
            }
            
        }
*/
        Scanner input = new Scanner(System.in);
        System.out.println("metin giriniz");
        String str = input.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '|| str.charAt(i)== 'a') {
                continue;
            }
            System.out.println(str.charAt(i));
        }






    }

}
