package j06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    /*
   Switch-Case yapısı  if statement'e benzer action alır.
   Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez. Bir app actionda sabit bir degeri
   çoklu durum ile karsilastirmak için switch-case blok kullanılır. Switch-case blok'da  degiskene göre bir
   çok durumdan değişkene uyan durum gerçeklesir.
   if statement blok ile  switch-case blok birlikte tanımlanabiir.
   çoklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.(Best Practice)
    Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

     ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ..
     Switch de sadece int, byte, short, char, String data type  kullanilabilir
     Eger 3 den fazla durum varsa switch() tercih edilir.
*/
    public static void main(String[] args) {
        // Task-> verilen bir rakamın harf karakteri ile print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("bir rakam giriniz: ");
        int rakam = sc.nextInt();
        System.out.println("***if statement ile çözümü***");
        if (rakam==0){
            System.out.println("rakam 0");
        }else if (rakam==1){
            System.out.println("rakam 1");
        }else if (rakam==2){
            System.out.println("rakam 2");
        }else if (rakam==3){
            System.out.println("rakam 3");
        }else if (rakam==4){
            System.out.println("rakam 4");
        }else if (rakam==5){
            System.out.println("rakam 5");
        }else if (rakam==6){
            System.out.println("rakam 6");
        }else if (rakam==7){
            System.out.println("rakam 7");
        }else if (rakam==8){
            System.out.println("rakam 8");
        }else if (rakam==9){
            System.out.println("rakam 9");
        }else System.out.println("hatalı giriş yaptınız! ");


        System.out.println("***switch statement ile çözümü***");
        switch (rakam) {
            case 0:
                System.out.println("rakam 0");
                break;
            case 1:
                System.out.println("rakam 1");
                break;
            case 2:
                System.out.println("rakam 2");
                break;
            case 3:
                System.out.println("rakam 3");
                break;
            case 4:
                System.out.println("rakam 4");
                break;
            case 5:
                System.out.println("rakam 5");
                break;
            case 6:
                System.out.println("rakam 6");
                break;
            case 7:
                System.out.println("rakam 7");
                break;
            case 8:
                System.out.println("rakam 8");
                break;
            case 9:
                System.out.println("rakam 9");
                break;
            default:
        }

    }
}
