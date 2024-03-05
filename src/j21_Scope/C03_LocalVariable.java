package j21_Scope;

public class C03_LocalVariable {
    public static void main(String[] args) {
        int yas = 33;//main localde create edilen primitive variable
        System.out.println("yas = " + yas);//local variable aynı scopeta doğrudan call edilirr.
        for (int i = 1; i <= 9; i++) {//loop level
            System.out.println(yas + " " + i);//main scope variable ayni scope teki loop scope doğrudan call edilebilir
            i += 3;
        }
        //i+=7;//i loop variable oldugu için scope dısına cagırılamaz->CTE

        yas = 49;//main scope variable

    }

    //yas=50;// main sscope variable scope dısına call edilemez->CTE
    //TRİCK-> her variable kendi coplugunde dopar buyur ve ölür(scope dısına cıkamaz)
}
