package j25_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputStreamException {
    /*
         Dosya okuma/yazma işlemi bu işlemlerde hata ihtimali yüksek olduğu için  hata kontrolü zorunlu tutuluyor.
         bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surunlara karşılk gelen hatalara Checked Exception denir
         Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


        Bir code create edilirken olasi exception'lar ongorulup exception olustugunda Java'nin ne yapmasini istedigimiz
        belirtilmelidir.


                 1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
             kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

                 2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
             FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
             FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
             Class'inin parent class Hz.Adem
     */
    //public static void main(String[] args) throws FileNotFoundException {//main meth signature level exception(throws) zorunlu tanimlandi
    public static void main(String[] args) throws IOException {//main meth signature level exception(throws) zorunlu tanimlandi
        FileInputStream fis=new FileInputStream("src/j25_Exceptions/newFile");
        //fis-> path(yolu:kaynagı) tanımlana file erişim saglayan obj create edildi
// FileNotFoundException -> erişilmesi gereken filepath (dosya kaynagı) yanlışsa isitisnası:adres yanlışsa
        int k;
        while ((k=fis.read())!=-1){//fis obj ile read() meth erişilebilen dosyadaki her bir charin asci değeri -1 olana kadar tanimlandı
          //  System.out.print(k+" ");//74 97 118 97 99 97 110 108 97 114 97 32 98 111 108 99 97 32 111 102 102 101 114 13 10 98 117 103 117 110 32 100 101 32 104 97 121 97 116 116 97 110 32 98 105 114 32 115 97 97 116 32 99 97 108 100 105 107 13 10 104 111 115 103 101 108 100 105 110 32 104 97 121 97 116 13 10 98 97 115 97 101 105 32 103 97 121 114 101 116 101 32 97 115 196 177 107 116 196 177 114
            System.out.print((char) k);//k int ascii olan file degeri için casting yapildi.->type donusturduk


        }
        System.out.println();
        System.out.println("eger bu mesajı okuyorsan app sorunsuz calıstı");

    }
 }
