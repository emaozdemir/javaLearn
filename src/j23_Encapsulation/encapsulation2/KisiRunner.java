package j23_Encapsulation.encapsulation2;

public class KisiRunner {
    public static void main(String[] args) {
        Kisi obj =new Kisi("Aydin","Bahtiyar","1234asd",-34);
        System.out.println("obj = " + obj);//obj = ad='Aydin', soyad='Bahtiyar', password='1234asd', yas=34}
        System.out.println("obj.getAd() = " + obj.getAd());//Aydin
        System.out.println("obj.getPassword() = " + obj.getPassword());//1234asd
        System.out.println("obj.getSoyad() = " + obj.getSoyad());//Bahtiyar
        System.out.println("obj.getYas() = " + obj.getYas());//34
        obj.setAd("sema");
        System.out.println("obj.getAd() = " + obj.getAd());//sema

    }
}
