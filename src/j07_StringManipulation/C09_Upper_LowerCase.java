package j07_StringManipulation;

public class C09_Upper_LowerCase {
    /*
 toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
 toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
 ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.-> her türlü küçük harfe cevirir.
  */
    public static void main(String[] args) {
        String str ="Madem Geldin Dunyaya Calis Java'ya";
        System.out.println("str = " + str);//str = Madem Geldin Dunyaya Calis Java'ya
        System.out.println("str.toUpperCase() = " + str.toUpperCase());//str.toUpperCase() = MADEM GELDİN DUNYAYA CALİS JAVA'YA
        System.out.println("str.toLowerCase() = " + str.toLowerCase());//str.toLowerCase() = madem geldin dunyaya calis java'ya

    }
}
