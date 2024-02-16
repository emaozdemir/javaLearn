package j04_JavaOperators.j02_Assaignment_Atama_Operators;

public class C01_AtamaOperatoru {
//    =         x = 8      x = 8
//    +=        x += 3     x = x + 3
//    -=        x -= 3     x = x - 3
//    *=        x *= 3     x = x * 3
//    /=        x /= 3     x = x / 3
//    %=        x %= 3     x = x % 3

    public static void main(String[] args) {

        int saimYas = 48;
        System.out.println("saimYas = " + (saimYas+5));//53
        System.out.println("saimYas = " + (saimYas));//48

        System.out.println(saimYas+= 11);//59
        System.out.println(saimYas);//59 -> atama yapıldiği için saimYas değeri değişti.

        saimYas %= 5;
        System.out.println("saimYas = " + (saimYas));//4
        System.out.println("saimYas = " + (saimYas));//4

    }
}

