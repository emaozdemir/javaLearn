package j12_ArrayList.Tasks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        List<Integer> list = new ArrayList<>(List.of(2, 3, 4, 5, 6, 7));
        System.out.println(list);
        kareToplam(list);


    }

    private static void kareToplam(List<Integer> kare) {
        int toplam = 0;
        for (int i = 0; i < kare.size(); i++) {
            toplam +=Math.pow(kare.get(i),2);

        }
        System.out.println(toplam);

    }
}
