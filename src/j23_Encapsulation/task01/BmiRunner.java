package j23_Encapsulation.task01;

public class BmiRunner {
    public static void main(String[] args) {

        Bmi obj=new Bmi("sema",40,79.2,1.68);
        System.out.println("obj = " + obj);
//        System.out.println("obj.getBMI() = " + obj.getBMI());
//        System.out.println("obj.getStatus() = " + obj.getStatus());
        obj.setHeight(1.55);
        System.out.println("obj = " + obj);

    }
}
