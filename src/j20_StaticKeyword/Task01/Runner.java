package j20_StaticKeyword.Task01;

public class Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan
     Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan
      değelerini print eden code create ediniz.
    */


    public static void main(String[] args) {

        Rectangle dikdortgen = new Rectangle();
        dikdortgen.width = 10;
        dikdortgen.length = 5;
        System.out.println("dikdortgen.alan() = " + dikdortgen.alan());
        System.out.println("dikdortgen.cevre() = " + dikdortgen.cevre());


    }
}
