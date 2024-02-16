package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task12 {
    // Task-> Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Task-> Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen metin giriniz: ");
        String text = input.nextLine();
        System.out.println(text.contains(" "));
        System.out.println(text.isEmpty());


    }
}