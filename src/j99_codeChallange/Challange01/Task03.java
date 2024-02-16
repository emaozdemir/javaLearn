package j99_codeChallange.Challange01;

public class Task03 {
    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
              short: only takes whole numbers
              int(used more often): only takes whole numbers
              long: only takes whole numbers

              float: can take decimals (MUST have F or f at the end)
              double( used more often): can take decimals

              boolean: true or false boolean expressions
              char: character within single quote ''
                    also takes number
         * Range: double > float >long > int >short > byte
         * !!! soutv degeri ile yazdirma
         */


//byte, short, integer,long, double, float data type'larının max ve min degerlerini print eden code create ediniz.
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        //Her data type bir tane olmak uzere 4 variable create ediniz. (float, double, char, boolean)
//Degiskenler icin anlamli isimler kullanip, print ediniz..

        float sema =20f;
        System.out.println(sema);


        double k = 112222222;
        System.out.println(k);

        char salaryType= '$';
        System.out.println(salaryType);

        boolean sampion = true;
        System.out.println(sampion);






    }
}