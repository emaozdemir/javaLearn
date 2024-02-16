package j10_MethodCreation;

public class C03_MethodDepo {
    //her classta main method tanimlama zorunlulugu yoktur.belirli aksiyonlar için ozel classlar tanimlanir.

   public static void gecmeNotu(int not){
        if (not>=85){
            System.out.println("TAKDİR belgesi kazandiniz");
        }else if (not>=70){
            System.out.println("TESEKKÜR belgesi kazandiniz");
       }else if (not>=50) {
            System.out.println("Tekrar dene");
        }else {
            System.out.println("MEB izin vermese sinifi da gecemezdin");
        }
    }

}
