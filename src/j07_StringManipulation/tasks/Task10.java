package j07_StringManipulation.tasks;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sadece 3 harfli bir isim giriniz: ");
        String str = scan.nextLine();

        if (str.length() ==3){
            String harf1 =str.substring(0,1);
            String harf2 =str.substring(1,2);
            String harf3 =str.substring(2,3);
            if (!(harf1.equals(harf2) )&& !(harf2.equals(harf3)) && !(harf1.equals(harf3))){
                System.out.println("girilen string unique");
            }else System.out.println("girilen string unique değill!!");

        }else System.out.println("3 harfli bir string girin.");




        //System.out.println((isim.charAt(0)!=isim.charAt(1) && isim.charAt(0) !=isim.charAt(2) && isim.charAt(1)!=isim.charAt(2)) ?"her bir harf birbirinden farklı":"en az iki harf aynı..");

    }
}