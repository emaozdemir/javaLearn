package j12_ArrayList.Tasks;


import java.util.ArrayList;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
        System.out.println(list);

        ArrayList<Integer> yeniList = new ArrayList<>();

        for (int sayi : list) {
            if (!yeniList.contains(sayi)) {
                yeniList.add(sayi);
            }
        }
        System.out.println(yeniList);
        //2.yol
     /*   for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i)==list.get(j)){
                    list.remove(j);
                }

            }

        }
        System.out.println("list = " + list);

      */


    }

}
