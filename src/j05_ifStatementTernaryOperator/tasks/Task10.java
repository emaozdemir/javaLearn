package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen not giriniz: ");
        int note = sc.nextInt();
        if (note<50){
            System.out.println("D");
        }else if (note>=50 && note<60){
            System.out.println("C");
        }else if (note>=60 && note<80){
            System.out.println("B");
        }else System.out.println("A");










    }


}
