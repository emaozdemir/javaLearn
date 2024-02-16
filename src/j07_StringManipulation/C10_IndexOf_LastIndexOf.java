package j07_StringManipulation;

import java.util.Scanner;

public class C10_IndexOf_LastIndexOf {
    /* indexOf()->aranan yolcunun koltuk numarasını verir
  char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
  Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false
*/

    public static void main(String[] args) {
                String str ="Madem Geldin Dunyaya Calis JAVA'ya";
        System.out.println("str.indexOf('y') = " + str.indexOf('y'));//16 y karakterinin strdek, indexini return eder.
        System.out.println("str.indexOf(\"e\") = " + str.indexOf("e"));//3 e nin ilk göründüğü yerin indexini return eder.

        //metinden bir kelimenin indexi arandığı zaman keli,meyi ilk buldugu yerin ilk indexi return eder.
        System.out.println("str.indexOf(\"JAVA\") = " + str.indexOf("JAVA"));//27
        System.out.println("str.indexOf(\"java\") = " + str.indexOf("java"));//-1
        //hap bilgi indexOf meth olmayan bir char veya string arandığı zaman CTE veya RTE hatası vermez -1 return eder.
        System.out.println("str.indexOf(\"a\",12) = " + str.indexOf("a", 12));//17

        /* lastIndexOf()
String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
indexOf un sondan olan hali fakat index numaraları değişmez.
lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
*/
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));//33
        System.out.println("str.lastIndexOf('x') = " + str.lastIndexOf('x'));//-1
        System.out.println("str.lastIndexOf('s') = " + str.lastIndexOf('s'));//25

         /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
a-) girilen ifade java içermiyor
b-) girilen ifade 1 adet java içeriyor
c-) girilen ifade  1'den çok java içeriyor
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: ");
        String ifade = scan.nextLine().toLowerCase();
       // if (ifade.indexOf("java") == -1)
        if (!ifade.contains("java")){
            System.out.println("ifade de java kelimesi içermiyor ");
        }else if (ifade.indexOf("java")==ifade.lastIndexOf("java")) {  //buradaki eşitlik bize java nın bir kez gectiğini gösterir.
            System.out.println("ifadede 1 adet java içeriyor ");
        }else System.out.println("girilen ifade birden fazla java içerir.");


    }
}
