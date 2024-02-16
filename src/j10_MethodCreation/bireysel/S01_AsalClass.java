package j10_MethodCreation.bireysel;

public class S01_AsalClass {
    /*    String str ="Method olusturma";
       System.out.println(str.toUpperCase());// toUpperCase methoduyla yani javanın kendine ait methodlar vardır.
       // bu sekilde sadece yazdırmıs oluruz yani hala str kücük harflidir ama ;

       System.out.println(str);
       str=str.toUpperCase(); // bu şekilde kaydetmiş oluruz ve
       System.out.println(str);
*/
    public static void main(String[] args) {

        /*verilen  sayinin asal olup olmadığını kontrol edip
        sonuc olarak asal sayi veya asal sayi değil sonucunu yazdıran bir method oluşturun
         */
        asalSayiMi(15);

    }
    public static void asalSayiMi(int sayi ){
        for (int i = 2; i <=sayi ; i++) {
            if (i==sayi){
                System.out.println(sayi + " verilen sayi asal");
            }else if (sayi%i==0){
                System.out.println(sayi + " asal değil");
                break;
            }
        }

        // mesela bu asalSayiMi clasını baska classta kullanacaksak olusturulan yani bu klassın adı yani
        //S01.asalSayiMi(parantez içine istediğimiz sayiyi da yazarak); şu şekilde cağırabiliriz

    }

}
