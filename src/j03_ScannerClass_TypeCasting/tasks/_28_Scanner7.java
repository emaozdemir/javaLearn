package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen Bir Banka Hesabınız Var mı? lütfen eğer varsa True yoksa False yazınız");
        boolean b = sc.nextBoolean();
        System.out.println("Banka hesabım var = "+b);


    }
}
