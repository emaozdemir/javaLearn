package j05_ifStatementTernaryOperator;

public class C99_NestedIf {
    public static void main(String[] args) {
        // nested if iç içe if demek
        //task yas 25 üstü olacak ve erkek personel gerekli.

        String birey1Cinsiyet = "erkek";
        int birey1Yas = 15;

        if (birey1Yas>=25){
            System.out.println("yasınız uygundur.");
            if (birey1Cinsiyet.equals("erkek")){
                System.out.println("erkek cinsiyetiniz uygundur.");
            }
        }


    }
}
