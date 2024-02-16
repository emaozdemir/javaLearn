package j10_MethodCreation;

import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;

public class C03_MethodCreation {
    public static void main(String[] args) {
        String hlt="en hakiki javaci";
        String sema="javaNAZZZ";
        selamver();//tanimlandiği class scopta method name ile direct call edilebilir.
        System.out.println("hlt = " + hlt);
        System.out.println("sema = " + sema);
        /*
        farkli classlardan meth call etmek için clasName.methodName ile yada class import edilerek call islemi yapilir.
        static method olarak call edilir->gökteki günes gibi
        ayni classta method doğrudan name ile call edilir.
         */
        gecmeNotu(88);//Class name ile meth call edildi baska komsu clastan.
        gecmeNotu(43);//import edildi.komsudan günes niyetine aldık



    }

    private static void selamver() {
        System.out.println("beni koyumun yagmurlarinda yikasinlar..");
        gecmeNotu(55);// dısına farklı meth içine call edildi.

    }

   // gecmeNotu();method dısına call islemi olmaz -> CTE
}
