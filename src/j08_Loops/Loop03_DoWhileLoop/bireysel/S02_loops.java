package j08_Loops.Loop03_DoWhileLoop.bireysel;

public class S02_loops {
    public static void main(String[] args) {
        // do while dezavantajı hıc calısmaması  gerekn durumda bile 1 kere calısır .

        // 'k' harfinden 't' harfine kadar harfleri yazdırın .
        System.out.println("for ile");
        for (char i = 'k'; i <='t' ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");


        System.out.println("while ile");
        char i = 'k';
        while (i <= 't') {
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");


        System.out.println("do while ile");
        i = 'k';
        do {
            System.out.print(i+" ");
            i++;
        }while (i <= 't');

    }
}
