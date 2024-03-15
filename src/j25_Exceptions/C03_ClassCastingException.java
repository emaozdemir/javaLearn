package j25_Exceptions;

public class C03_ClassCastingException {
   // public static void main(String[] args) throws ClassCastException {//unchecked exc. throws exc. handle edemez RTE exc. try-cath kullanilir
    public static void main(String[] args) throws ClassCastException {
        //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE
        Object obj ="Javacan'lara selam ";
        System.out.println("obj = " + obj);
        String str=(String) obj;
        System.out.println("str = " + str);
        Object sayi=49;
//        String sayiStr=(String) sayi;
//        System.out.println("sayiStr = " + sayiStr);
        try {
            String sayiStr=(String) sayi;
            System.out.println("sayiStr = " + sayiStr);
            System.out.println(" try blocktan selamlar bu mesaji okuyorsan try sorunsuz calısti catch calısmayacak yani.");
        }catch (ClassCastException e){
            System.out.println("int data type Stringe donusturulemez.");
            System.out.println("bu mesaji okuyorsan try exc. yakaladı.");
        }
        System.out.println("*********");
        try {
            String str1=(String)obj;
            System.out.println("sayiStr = " + str1);
            System.out.println(" try blocktan selamlar bu mesaji okuyorsan try sorunsuz calısti catch calısmayacak yani.");
        }catch (ClassCastException e){
            System.out.println("int data type Stringe donusturulemez.");
            System.out.println("bu mesaji okuyorsan try exc. yakaladı  ve catch calıstı.");
        }
        System.out.println("bu mesaji okuyorsan app sorunsuz calıstı.");

    }
}
