package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
 // Task-> Kullancıdan alınan str'nin karakter saysını print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen metin giriniz: ");
        String  metin=scan.nextLine();
        //1.yol stringle
        int sayac=0;
        for (int i = 0; i <metin.length() ; i++) {
            sayac++;
        }
        System.out.println("sayac = " + sayac);

        //2.yol

        ArrayList<String> list=new ArrayList<>(List.of(metin.split("")));
        System.out.println(list+"\n"+list.size());


    }
}
