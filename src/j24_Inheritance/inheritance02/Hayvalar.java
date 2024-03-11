package j24_Inheritance.inheritance02;

public class Hayvalar {//grand-parent class
    int a ; //default int type instance variable
    int m=3;//initial  int type inst. variable

    public Hayvalar() {
        System.out.println("hayvanlar class parametresiz const call edildi");
    }


    public Hayvalar(int x) {
        //this.a=x;
        System.out.println("hayvanlar class parametreli const call edildi");
    }

    public void methA(){
        System.out.println("methA->Hayvanlar clasındaki meth call edildi.");
    }
    public void methM(){
        System.out.println("methM->Hayvanlar clasındaki meth call edildi.");
    }



}

