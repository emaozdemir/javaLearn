package j25_Exceptions;

public class C03_ClassCastingException {
   // public static void main(String[] args) throws ClassCastException {//unchecked exc. throws exc. handle edemez RTE exc. try-cath kullanilir
    public static void main(String[] args) throws ClassCastException {
        //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE
        Object obj ="Javacan'lara selam ";//Object en ata olandır .
        System.out.println("obj = " + obj);
        String str=(String) obj;//Object data tipinden string data tine casting yaptık
        System.out.println("str = " + str);
        Object sayi=49;//ata olan Object data tipinde obje crate ettik . (aslında cocugu olan int te olabilir yani)
//        String sayiStr=(String) sayi;//(int olan data tipini stringe castting yapamayız )
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
        //ayrı scopelerde aynı isimli exc kullanabiliyoruz.
        try {
            String str1=(String)obj;
            System.out.println(" str1 = " + str1);
            System.out.println(" try blocktan selamlar bu mesaji okuyorsan try sorunsuz calısti catch calısmayacak yani.");
        }catch (ClassCastException e){
            System.out.println("int data type Stringe donusturulemez.");
            System.out.println("bu mesaji okuyorsan try exc. yakaladı  ve catch calıstı.");
        }
        System.out.println("bu mesaji okuyorsan app sorunsuz calıstı.");

    }
}
