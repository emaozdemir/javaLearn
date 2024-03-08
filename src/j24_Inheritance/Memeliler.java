package j24_Inheritance;

public class Memeliler extends Hayvanlar {
    public Memeliler() {
        System.out.println("parametersiz Memeliler const call edildi");
    }

    public void sutBeslen() {
        System.out.println("yavrularını sütle beslerler.");
    }
    public void dogum(){
        System.out.println("yavrusu oldu");
    }
}
