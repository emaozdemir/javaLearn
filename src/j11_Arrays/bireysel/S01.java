package j11_Arrays.bireysel;

import java.util.Arrays;

public class S01 {
    // bu gune kullandıgımız data turleri sadece 1 variable e 1 deger ataması yapılıyordu. ->int a =20; gibi.

    // array sayesinde aynı data turunden birden fazla eleman barındırabilen objelerdir.
    // []bunu görürsek data turu arrasydir hangı tur içine yazılırsa yazılsın!!


    public static void main(String[] args) {
        int[] arr = { 2, 3, 4};
        System.out.println(arr);//[I@19dfb72a
        //array data turundeki variable ler direk yazdırılmaz.
        //direk yazdırmak istediğinizde stack memorydeki refenrasi size yazdırır.
        // arrayı içindeki elemanlarla yazdırmak istersek ; toString yazmalıyız.
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6]

        /* array in içindeki herhangi bir elemente ulasmak için,değiştirmek  veya yazdırmak istediğimizde
        arrayin ismini ulasmak istediğimiz elementin indexini yazdırırız.
         */

        // arr deki 3 u yazdıralım;
        System.out.println(arr[1]);

        //arr ye 4 yerine 6 atayalım;
        arr[2]=6;
        System.out.println(Arrays.toString(arr));

        /* new int [4]; veya {1,2,3,4} seklinde değer atadığımız bir arraye besinci bir element atadığımızda
        veya var olan bir elementi silip 3 elemanlı bir hale döndüremeyiz.
         */

        int [] sayilar = {4,6,9,5};
        System.out.println(Arrays.toString(sayilar));
        //5. element koymak isyersek;
       // sayilar[4]=7;
      //  System.out.println(Arrays.toString(sayilar));//ArrayIndexOutOfBoundsException

        /*arrays de delete ve remove gibi bir elementi sileceğimiz method yok dolayısıyla
        var olan bir arrayda uzunlugu değiştirmek mümkün değildir.sıgmadığımız arabayı değiştiririz . aileyi sigdırmayız yani yeniye atama yaparız.
         */
        sayilar = new int[5];
        sayilar = new int[3];
        sayilar = new int[8];

        int [] yeniSayilar = {4,6,9,5,7};
        sayilar=yeniSayilar;
        System.out.println(Arrays.toString(sayilar));








    }

}
