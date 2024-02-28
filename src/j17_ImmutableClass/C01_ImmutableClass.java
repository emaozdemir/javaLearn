package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1="Sema";//ilk deger initial atamasi Sema yapilmis str1 variable String type olustu.
        String str2="Sema";//str1 ve str2 aynı deger ile ilk atamasi yapildiği için StringPoll dan aynı referans ile olustu.
        String str3=new String("Sema");//ilk deger ataması Sema value ile yapildi.heap memoride(uniqe) referans değer create edildi.
        String str4=new String("Sema");//ilk deger ataması Sema value ile yapildi.heap memoride(uniqe) referans değer create edildi.
        String str5=str3;
        System.out.println("(str1==str2) = " + (str1 == str2));//t -> ayni hazundan referans alıyor
        System.out.println("(str3==str5) = " + (str3 == str5));//t ->ayni hazundan ref
        System.out.println("(str2==str3) = " + (str2 == str3));//f ->farkli havuz ve obje referans
        System.out.println("str1.equals(str2) = " + (str1.equals(str2)));//t ->ayni value değerler
        System.out.println("(str3==str4) = " + (str3 == str4));//f -> farklı havuz obje referans
        System.out.println("(str3.equals(str4)) = " + (str3.equals(str4)));//t -> ayni variable value havuz ayni yani
        System.out.println("(str1==str5) = " + (str1 == str5));//f -> faklı havuz ref
        System.out.println("(str1.equals(str5)) = " + (str1.equals(str5)));//t -> ayni variable value

        //equals variable kontrolü yapıyoruz.


    }
}
