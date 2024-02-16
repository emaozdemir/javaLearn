package j07_StringManipulation;

public class C99_Bireysel {

    public static void main(String[] args) {
        // CONCAT

        String str = "bayern";
        String str1 = "munih";
        String space= " ";
        System.out.println(str + str1);//bayernmunih
        System.out.println(str +" " +str1);//bayern munih
        System.out.println(str.concat(str1));//bayernmunih
        System.out.println(str.concat(space).concat(str1));//bayern munih

        System.out.println(str.charAt(3));

        //contains içeriyor mu ? methodu.

    }
}
