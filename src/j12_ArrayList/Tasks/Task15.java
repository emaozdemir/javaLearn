package j12_ArrayList.Tasks;

import java.util.ArrayList;

public class Task15 {

    /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.
     */
    public static void main(String[] args) {

        ArrayList<Integer>asalList=new ArrayList<>();

        for (int i = 2; i <100 ; i++) {
            boolean asalMi=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    asalMi=false;
                    break;
                }
            }
            if (asalMi){
                asalList.add(i);
            }
        }
        System.out.println(asalList);


    }
}
