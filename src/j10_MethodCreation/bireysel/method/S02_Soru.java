package j10_MethodCreation.bireysel.method;



import java.util.Scanner;

public class S02_Soru {
    public static void main(String[] args) {
        //kullanıcıdan bir pozitif bir rakam ve  bir sayi alın.eğer sayi rakamın faktoriyel değeriinden
        //buyukse rakamı ;
        // sayi rakamın faktoriyel değerinden buyuk değilse sayiyi yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("pozitif bir rakam gir");
        int rakam=scan.nextInt();
        System.out.println("pozitif bir sayi gir");
        int sayi=scan.nextInt();

        int rakamınFaktoriyelDegeri=S01_FaktoriyelSonucuDondurme.faktoriyelHesapla(rakam);
        System.out.println("rakamınFaktoriyelDegeri = " + rakamınFaktoriyelDegeri);
        if (sayi>rakamınFaktoriyelDegeri){
            System.out.println("eğer sayi rakamın faktoriyel değeriinden\n" +
                    "        //buyukse rakamı"+rakam);
        }else System.out.println("sayi rakamın faktoriyel değerinden buyuk değilse sayiyi yazdırın "+sayi);


    }

}
