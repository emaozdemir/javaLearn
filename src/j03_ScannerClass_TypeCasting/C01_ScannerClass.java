package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
//Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
//Scanner Class'i Java nin util kutuphanesindedir.

// kullanıcıdan veri almak içinn şu 3 adım takip edilir
//1. adım-> Scanner class'dan obj create edilir.

//Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

//2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
//  System.out.print("adınızı giriniz :");

//3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.
     public static void main(String[] args) {
         // task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz

         //1.adım-> Scanner class'dan obj create edilir.'
         Scanner scan = new Scanner(System.in);

         //2. adım-> kulanıcının girdigi veri data
         System.out.print("Alanını istediğiniz bir karenin bir kenarını giriniz :");

         //3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.'
         int kenar = scan.nextInt();
         //int kareA=kenar*kenar;
         //System.out.println("kareA : " + kenar);
         System.out.println("kareA : " + (kenar*kenar));
         //3.adim Kullanicinin girdigi degeri uygun bir variableye atama

         /*
      Task->
     Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
     Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
     1 seker = 1.7 gr
     Ornek : Input : cay sayisi : 10 seker sayisi :
         Output : Yilda 12.41 kg seker kullaniyorsunuz.
      */

         //2.adim
         System.out.print("günlük içtiğiniz çay sayısını giriniz:");
         //3.adim
         int cay = scan.nextInt();
         //2.adim tekrar şeker miktari için .
         System.out.println("her bardağa attığınız seker sayısını giriniz:");
         int seker = scan.nextInt();
         System.out.println("1 yılda kullanılan seker sayisi= "+((cay*seker*1.7*365)/1000) +"kg seker kullanıyorsunuz.");



     }
}
