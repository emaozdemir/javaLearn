package j26_Abstract.abstract01;

public abstract class Honda {//abs. grand parent class

    public abstract void motor();//abs meth-> bodysiz implement zorunlu

    void sunroof() {//isteğe bağlı olan ozellikleri bodyle yapabiliriz {} block anlamında
        System.out.println("honda concrete meth call edild");
    }

    abstract void koltuk();//abs method-> bodysiz implement zorunlu

    abstract void kapi();//abs method-> bodysiz implement zorunlu
//abs. classta concrete variable tanimlanir mi?->evet!
    String name="Ahmet bey";
    // abs. class'da abs variable tanımlanır mı? -> nayır nolamazzz
// abstract String str="javvaNUR";
// final void finalMethod();// final body'siz meth tanımlanamaz
// final abstract void finalMethod();// final abs meth tanımlanamaz
// private abstract  void privateMeth();// abs. meth acmo kısıtlanamaz
// static  void gunesMetg();//static  concrete meth body'siz olamaz
// static abstract void gunesMetg();// abs. meth static olamaz
// Honda h1 = new Honda();//abs Class obj uretemez->melek dogurmaz

}
