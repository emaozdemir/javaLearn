package j99_codeChallange.Challenge09;

import java.util.Random;

public class MathClassMethods {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a = " + a);// -12
        System.out.println("a nın mutlak değeri : " + Math.abs(a));//12
        System.out.println("a ve b den kucuk olanı  = " + Math.min(a, b));//-12
        System.out.println("a ve b den buyuk olanı  = " + Math.max(a, b));//4
        System.out.println("a ve b carpımı  = " + Math.multiplyExact(a, b));//-48
        // Task -3 17 ve -6 en  kucugunu print eden code create ediniz
        System.out.println(" -3 17 ve -6 den kucuk olanı  = " + Math.min(-3,Math.min(17,-6) ));//-6
        System.out.println("16 nın karakoku  = " + Math.sqrt(16));// 4
        System.out.println("12 nın karakoku  = " + Math.sqrt(12));// 3.4641016151377544
        System.out.println("3^4 = " + Math.pow(3, 4));//81.0->3*3*3*3  -> pow(taban,us)
        System.out.println("3.1 ı yuvarla  = " + Math.round(3.1)); // 3
        System.out.println("3.5 ı yuvarla  = " + Math.round(3.5)); // 4
        System.out.println("3.1 sayısının ust tamsayıya yuvarlama = " + Math.ceil(3.1));// 4
        System.out.println("3.5 sayısının ust tamsayıya yuvarlama = " + Math.ceil(3.5));// 4
        System.out.println("3.9 sayısının ust tamsayıya yuvarlama = " + Math.ceil(3.9));// 4
        System.out.println("4.2 sayısının ust tamsayıya yuvarlama = " + Math.ceil(4.2));// 5

        System.out.println("3.1 sayısının alt tamsayıya yuvarlama = " + Math.floor(3.1));//3
        System.out.println("3.9 sayısının alt tamsayıya yuvarlama = " + Math.floor(3.9));//3
        System.out.println("3.5 sayısının alt tamsayıya yuvarlama = " + Math.floor(3.5));//3
        System.out.println("4.8 sayısının alt tamsayıya yuvarlama = " + Math.floor(4.8));//4
      // Math.random() -> double data type sahip olarak algılar 0.0-0.99 arasında rastgele bir doubla değer return eder


        System.out.println("Math.random() = " + Math.random());//
        double rastgeleSayi= Math.random()*100;
        System.out.println("rastgeleSayi = " + rastgeleSayi);//

        int max=20;
        int x= (int) (Math.random()*20);
        System.out.println("x = " + x);//


       //for (int i = 1; i <=10 ; i++) {// 10 tane random sayı ureten loop tanımlandı
       //    System.out.println(i+" . sayi : "+Math.random());
       //
       //}

        // Random Class -> java.util kutıphanede uretilir sayı üretmeye 1 den başlar
        Random rastgele= new Random();
        for (int i = 1; i <=5;i++) {// 5 tane random sayı ureten loop tanımlandı

            System.out.println(i+" . sayi = " + rastgele.nextInt(33));// 1-3 arası rastgele int uretir
        }

    }
}
