package j12_ArrayList.bireysel;

import java.util.ArrayList;

public class S03_TumElemanlariKullanma {
    public static void main(String[] args) {
        //her defasinda add ile eklemek yerine;bir array olusturup sonra for loopla olusturdugumuz
        // bos bir ArrayList e atayabiliriz.

        int [] arr={10,20,30,40,50,60,7};
        ArrayList<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);



    }
}
