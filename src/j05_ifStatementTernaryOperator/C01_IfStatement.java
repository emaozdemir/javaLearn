package j05_ifStatementTernaryOperator;

public class C01_IfStatement {

    public static void main(String[] args) {

        int semraYas=28;
        int merveYas=28;
        if(semraYas==merveYas) {
            System.out.println("Yasdas arkadaslar");
            System.out.println("Yoksa siz ikiz misiniz?");
            System.out.println("javacanlara selam olsun.");
        }
        if (merveYas>=40) System.out.println("Merve hanim yasi 40'tan buyuk");
        //If blok'tan sonta tek satirlik islem varsa {} gerek yok
        if (merveYas+semraYas>=45) System.out.println("Tek satirlik aksiyonlarda {} kullanilmaz");
        System.out.println("javacanlara selam olsun.");

        System.out.println("Bu ciktiyi okuyorsan kod calisiyordur");
        char a1 = 'a';
        char a2 = 'b';
        System.out.println(a1+a2);
        System.out.println("I love" + " Java");
        boolean a = true;
        boolean b = false;
        System.out.println(a + " " + b);

    }
}
