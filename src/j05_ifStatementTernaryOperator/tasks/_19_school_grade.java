package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */
// Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen ilk sınav sonucunuuzu giriniz: ");
        int sınav1= sc.nextInt();
        System.out.println("lütfen ikinci sınav sonucunuzu giriniz: ");
        int sınav2= sc.nextInt();
        System.out.println("lütfen final sınav sonucunu  giriniz: ");
        int final1 = sc.nextInt();
        int ortalama = (sınav1+sınav2+final1)/3;
        if (ortalama>=90) {
            System.out.println("Your grade is A");
        }
        else if ( ortalama >=70 && ortalama<90 ){
            System.out.println("Your grade is B");
        }
        else if ( ortalama >=50 && ortalama <70 ){
            System.out.println("Your grade is C");
        }
        else System.out.println("Your grade is F");






    }
}
