package j07_StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    /*
 startsWith()
 Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 String'in basladigi characteri dogrular
 endsWith()
 Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
*/
    public static void main(String[] args) {
        String str1 = "ebikGabik";
        System.out.println("str1 = " + str1);
        //str1.startsWith('e');//parametre olarak char almaz ->CTE
        System.out.println("str1.startsWith(\"e\") = " + str1.startsWith("e"));//true
        String str2 = "ebik";
        System.out.println("str1.startsWith(str2) = " + str1.startsWith(str2));//true
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1));//false
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2));//true
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1));//false
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2));//true

        System.out.println("str1.startsWith(\"k\",3) = " + str1.startsWith("k", 3));//true

        //Task-> girilen e-mail hesabının  @gmail.com ile bitmiyorsa  "lütfen gmail hesabı giriniz"
// @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("e-mail giriniz :");
        String gmail = scan.nextLine();
        if (gmail.endsWith("@gmail.com")) {
            System.out.println("hesabınız onaylandı "+ gmail);
        } else {
            System.out.println("geçerli hesap giriniz ");
        }
        System.out.println(gmail.endsWith("@gmail.com") ? "hesabınız onaylandı" : "geçerli hesap giriniz");






    }

}
