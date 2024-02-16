package j07_StringManipulation;

public class C12_Replace_ReplaceAll {
    /** replace()
     * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
     * (update -set) saglar. Sonuc String'dir..
     *
     */

    // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
    //1-replace() methodu char kabul eder ama replaceAll kabul etmez
    //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
    //(Regular Expressions)
    //   \\s butun boslukları istediğimiz seye ceviririz
     //   \\S bosluk disindaki tum karakterler
    //   \\w harfler ve rakamlar (a z A Z, 0 9)
    //   \\W harfler ve rakamlar disindaki tum karakterler
    //   \\d rakamlar 0 9
     //   \\D rakamlar disindaki tum karakterler

    public static void main(String[] args) {
        String str="madem geldin dunyaya calis JAVA'ya";
        System.out.println("str = " + str);
        System.out.println("str.replace(\"a\",\"*\") = " + str.replace("a", "*"));//m*dem geldin duny*y* c*lis JAVA'y*
        System.out.println("str.replace(\"a\",\"*\") = " + str.replace("yaya", "$"));//madem geldin dun$ calis JAVA'ya

        str="javaCAN'lara selam olsun 1234567 $ # @ 5 %   :)";
        System.out.println("str.replace(\"\\\\s\",\"*\") = " + str.replaceAll("\\s", "*"));//javaCAN'lara*selam*olsun*1234567*$*#*@*5*%***:)
        System.out.println("str.replace(\"\\\\S\",\"*\") = " + str.replaceAll("\\S", "*"));//************ ***** ***** ******* * * * * *   **
        System.out.println("str.replace(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));//*******'**** ***** ***** ******* $ # @ * %   :)
        System.out.println("str.replace(\"\\\\D\",\"*\") = " + str.replaceAll("\\D", "*"));//*************************1234567*******5*******
        System.out.println("str.replace(\"\\\\d\",\"*\") = " + str.replaceAll("\\d", "*"));//javaCAN'lara selam olsun ******* $ # @ * %   :)
        str.replaceAll("[^hariç demek]","" );



    }
}
