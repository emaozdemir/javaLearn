package j25_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
// NullPointerException -> null ataması yapılan bir String variable length() meth call edildiğinde oluşan RTE
        String str1="";
        System.out.println("str1.length() = " + str1.length());//0
        String str2=null;
        //System.out.println("str2.length() = " + str2.length());// NullPointerException ->RTE
        try {
            System.out.println("str2.length() = " + str2.length());//RTE exc firlatir alt satira inmeden catch blok calısır.
            System.out.println("try block sorunsuz calıst.");
        }catch (NullPointerException e){
            System.out.println("try block exc firlatti ");
            System.out.println("bu mesaji okuyorsan catch block calıstı ");
        }
        System.out.println("********");
        try {
            System.out.println("str2.length() = " + str1.length());//0->RTE exc firlatmaz alt satira iner catch blok calısır.
            System.out.println("try block sorunsuz calıst.");
        }catch (NullPointerException e){
            System.out.println("try block exc firlatti ");
            System.out.println("bu mesaji okuyorsan catch block calıstı ");
        }
        System.out.println("bu mesaji okuyorsan app sorunsuz calıstı ");
    }
}
