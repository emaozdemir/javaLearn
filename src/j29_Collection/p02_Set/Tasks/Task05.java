package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.HashSet;

public class Task05 {

    /*
    changeSet() isminde bir method oluşturun.
    Parametre olarak bir String HashSet   ve  iki String
    return hashset olmalı
    Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.

    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>(Arrays.asList("banana", "strawberry", "kiwi", "pineapple"));

        String s1 = "banana";
        String s2 = "peach";


    }
}