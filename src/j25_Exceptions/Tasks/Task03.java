package j25_Exceptions.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
      int v  - int f  isminde 2 adet parametresi olan 'ortalama' isminde bir method create ediniz.
        int v = vize
        int f = final

        Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını return edin.
        Diğer durumlarda ise,
        vizenin yüzde 40 ını, finalin yüzde 60 toplayarak ortalama hesplayan pr create ediniz.
        vizeye 120, finale 80 girin.

        Programın çalışmasını sağlayın. (handle edin)
         */
        Scanner input = new Scanner(System.in);
        int vize;
        int fnl;
        while (true){
            try {
                System.out.println("vize notunuz giriniz: ");
                vize=input.nextInt();
                if (vize<0||vize>100){
                    throw new ArithmeticException("NOTLAR 0-100 ARASİNDA OLMALİ");
                }else break;
            }catch (ArithmeticException e){
                System.out.println("hatali giris yaptin "+ e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("final notunuz giriniz: ");
                fnl=input.nextInt();
                if (fnl<0||fnl>100){
                    throw new ArithmeticException("NOTLAR 0-100 ARASİNDA OLMALİ");
                }else break;
            }catch (ArithmeticException e){
                System.out.println("hatali giris yaptin "+ e.getMessage());
            }
        }
        System.out.println("ortalama: "+ortalama(vize,fnl) );
        


    }//main sonu

    private static double ortalama(int v,int f) {
        return (v*0.4)+(f*0.6);
    }
}//Class sonu



































