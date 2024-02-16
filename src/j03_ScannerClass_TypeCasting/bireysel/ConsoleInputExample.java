package j03_ScannerClass_TypeCasting.bireysel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ConsoleInputExample {
    public static void main(String[] args) {


            String name = System.console().readLine();
            System.out.println("Girdiğiniz metin: " + name);

    }
}
