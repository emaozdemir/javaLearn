package j01_Variables;

import java.util.Scanner;

public class C01_HelloWorld {

    public static void main(String[] args) {
       /* System.out.println("Hello World!"); //yorum satirimdir.println alt satıra geçirir.
        System.out.print("Hello World!"); //yorum satirimdir. print alt satıra götürmez.aynı satıra devam.
        System.out.println("Javacanlara\n selam olsun!"); //yorum satirimdir.Ctrl+D alta aynısını kopyalar.

        int num1 = 24;
        int num2 = 30;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1);
        System.out.println(num2);


        int a=24;
        int b=30;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+ a);
        System.out.println("b="+ b);

        Scanner scan = new Scanner(System.in);
        System.out.println("adınız : ");
        String name = scan.next();
        //if (text.indexOf(" ") == text.lastIndexOf(" "))
        System.out.println(name);

        int number = 10;
        //number = number+2;
       // System.out.println(number);
        // number+=2;
        // System.out.println(number);
         number++;
         System.out.println(number);
        number=+2;
       System.out.println(number);
        int sayi1 = 7;
        int sayi2 = 2;
        int sonuc = sayi1 / sayi2;
        System.out.println(sonuc) ;*/
        /*int sayi1 = 7;
        int sayi2 = 2;
        double sonuc = sayi1 / sayi2;
        System.out.println(sonuc) ;

        int m = 2;
        int n= 4;
        String s= "Clarus";
        System.out.println(m + n + s);
        if ( 0 > 5 || 7 > 6 ) {
            System.out.println("apple");
        }else{
            System.out.println("banana");
        }
        int aci1 =150, aci2 = 20, aci3 = 10;
        boolean isValid = (aci1+aci2+aci3) ==180;
        if(isValid) {
            System.out.print("it's a valid triangle");

        } else {

            System.out.println("Invalid triangle");

        }
        int i = 10;
        int j = 20;
        j += i/5;
        int k = j;
        i--;
        i++;
        System.out.println(i+"-"+j+"-"+k);
        int a = 5;
        int b = 9;
        int c = 0;
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        System.out.println(b + "," + a);
        boolean male = false;
        int age = 30;

        if( male )
            if( age < 20 )
                System.out.println("Boy");
            else
                System.out.println("Man");
        else
        if( age < 20 )
            System.out.println("Girl");
        else
            System.out.println("Woman");
        */
        int m = 2;
        int n= 4;
        String s= "D";
        System.out.println(m*n + (n-m) +s +m);
        System.out.println((m*n) + (n-m) +s +m);
        System.out.println((m*n) + (n-m) + (n/m)+s );

        System.out.println((m*n) + (n-m)+ s + (n/m) );




    }
}

/*coklu satiri yorum yapmak istersem,bu şekilde yaparım
tırnak içindeki bosluklarda karakter olarak sayılır.
java run edildiğinde calişmaya ilk olarak main mehodlardan baslar.
sonra yukarıdan aşağıya ve soldan sağa doğru sırasıyla işlem yapar.
 */


