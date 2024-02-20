package j11_Arrays.bireysel;

import java.util.Arrays;

public class S09_split {
    public static void main(String[] args) {
        String str = " ali bugun nerdesin ? okula gel.";
        System.out.println(str);

        //verilen cümleyi kelimelere ayirin;
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[, ali, bugun, nerdesin, ?, okula, gel.]

        //verilen cümleyi harfleri bir array olarak kaydedin;
        String[] karakter= str.split("");//hiçlikten ayir demek.
        System.out.println(Arrays.toString(karakter));//[ , a, l, i,  , b, u, g, u, n,  , n, e, r, d, e, s, i, n,  , ?,  , o, k, u, l, a,  , g, e, l, .]
    }
}
