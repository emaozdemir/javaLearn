package j24_Inheritance.task01;

public class A {

   static String str;

  static {
        str="hi from A";
    }

    public static String getStr() {
        return str;
    }

    public static void setStr() {
        A.str = str;
    }

    @Override
    public String toString() {
        return "A{}";
    }

}
