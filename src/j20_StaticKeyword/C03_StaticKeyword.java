package j20_StaticKeyword;

public class C03_StaticKeyword {
    int ogrenciId;//instance(obj) variable
    static int ogrenciSayisi;//static(class) variable

    public C03_StaticKeyword() {//p'siz constructor
        ogrenciSayisi++;//bu const call edildiğinde yani obje create edildiğinde ogrenciSayisi static
        //variable kalici (her obj için aynı değer) olarak arttırılır.
        ogrenciId++;//bu const call edildiğinde yani obje create edildiğinde ogrenciId create edilen obj'ye ozel değer alır.

    }

    public static void main(String[] args) {
        System.out.println("a obj oncesi ogrenciSayisi : " + ogrenciSayisi);//0
        C03_StaticKeyword a = new C03_StaticKeyword();
        System.out.println("a obj sonrasi ogrenciSayisi : " + ogrenciSayisi);//1
        C03_StaticKeyword b = new C03_StaticKeyword();
        C03_StaticKeyword c = new C03_StaticKeyword();
        C03_StaticKeyword d = new C03_StaticKeyword();
        System.out.println("a,b,c,d  obj'leri sonrasi ogrenciSayisi : " + ogrenciSayisi);//4

        C03_StaticKeyword e;//obj decleration ama assaingment yapilmamiş->const call yok.
        System.out.println("e obj sonrasi ogrenciSayisi : " + ogrenciSayisi);//4
        System.out.println("a ogrenciId : " +a.ogrenciId);//1
        System.out.println("b.ogrenciId = " + b.ogrenciId);//1
        System.out.println("c.ogrenciId = " + c.ogrenciId);//1
        System.out.println("d.ogrenciId = " + d.ogrenciId);//1
       // System.out.println("e.ogrenciId = " + e.ogrenciId);


    }
}
