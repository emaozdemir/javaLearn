package j05_ifStatementTernaryOperator.tasks;
import java.util.Scanner;
public class Task23 {


    public static void main(String[] args) {
        /*
            Bir sayinin mutlak degerini hesaplamak icin ternary operatoru kullanarak kod yaziniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mutlak değerini hesaplamak istediğiniz bir sayi giriniz");
        int sayi = sc.nextInt();
        System.out.println(sayi<0 ? "|"+ sayi +"|=" +Math.abs(sayi): "sayi zaten pozitif.");

    }

}
