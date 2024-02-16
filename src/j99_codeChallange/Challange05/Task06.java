package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task06 {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString
    Bir dizeyi tersine çeviren bir Java programı yazın. For döngüsünü kullanın ve reversString adında bir yöntem oluşturun*/


    public static void main(String[] args) {
        //ters cevirip, atama yaparak kaydetme ve yazdırma
        String metin="endülüs";
        String tersMetin="";
        System.out.println(metin);

        for (int i=metin.length()-1; i>=0 ;i--){
            tersMetin+=metin.charAt(i);

        }
        metin=tersMetin;//bu durum artık değiştirdik demek
        System.out.println(metin);
        ;

        System.out.println("******");
        // sadece ters cevir yazdırma
        String metin1="endülüs";
        System.out.println(metin1);

        for (int i=metin1.length()-1; i>=0 ;i--){
            System.out.print(metin1.charAt(i));

        }






    }

}
