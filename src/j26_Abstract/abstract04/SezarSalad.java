package j26_Abstract.abstract04;

public abstract class SezarSalad extends Food {

    public void madeIn(){
        System.out.println("italy");
    }

    @Override
    public void taste() {
        System.out.println("sezarin hakkı sezara");
    }
}
