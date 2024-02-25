package j12_ArrayList.bireysel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S04_KullaniciyaListeOlusturtma {
    public static void main(String[] args) {
        /*
        kullanicidan istediği kadar isim alıp q ya bastiğinda girdiği isimleri bize liste olarak
        döndürecek bir method olusturun.
         */
        System.out.println("isimListesiOlusur() = " + isimListesiOlusur());

    }
    public static List<String> isimListesiOlusur(){
        Scanner scan=new Scanner(System.in);
        List<String>isimlerListesi=new ArrayList<>();
        String girilenIsim="";
        while (!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("listeye eklenmek için isim girin bitirmek istediğinizde q a basin");
            girilenIsim=scan.nextLine();
            if(!girilenIsim.equalsIgnoreCase("Q")){
                isimlerListesi.add(girilenIsim);
            }
        }
        return isimlerListesi;
    }
}
