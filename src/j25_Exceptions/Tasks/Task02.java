package j25_Exceptions.Tasks;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) throws IOException {
           /*
    Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
    edip mainde kontrol ediniz.

    Trick->
    sicaklikKontrol(int sıcaklık){
     throw new IOException("AGAM hava buz gibi dışarı çıkma");
            */
        Scanner input = new Scanner(System.in);
        System.out.println("hava sıcaklıgını giriniz: ");
        int sicaklik=input.nextInt();
        sicaklikKontrol(sicaklik);



    }//main sonu

    private static void sicaklikKontrol(int sicaklik) {

        try {
            if (sicaklik<10){
                throw new IOException("AGAM hava buz gibi dışarı çıkma");
            }else System.out.println("hava guzel ");
        }catch (IOException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }
}//Class sonu
