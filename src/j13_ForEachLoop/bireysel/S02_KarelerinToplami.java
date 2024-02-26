package j13_ForEachLoop.bireysel;

public class S02_KarelerinToplami {
    public static void main(String[] args) {
        /*
        verilen int arraydeki her elementin karelerini alıp ,
        karelerinin tolamını yazdıran bir code olusturun.
         */

       int[] sayiArr = {1, 3, 7, 1, 9, 8, 9, 7, 6};
        int kareleritoplami=0;
      //  int[] yeniSayiArr =new int[sayiArr.length];
        for (int each:sayiArr){
            kareleritoplami+=each*each;
        }
        System.out.println(kareleritoplami);

    }
}
