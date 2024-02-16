package j10_MethodCreation.bireysel;

public class S03_IsmiIstenenFormattaYazdirma {

    public static void main(String[] args) {
        /*
        verilen pisim soyisim ve kk numarasını asağidakine yazdıran format
        ornek : input ->Ali,Kayali,1234567890123456 ->output -> A**, K*****, **** **** ****  3456
         */
        isimDuzenleme("Ali","Kayali","1234567890123456");


    }

    public static void isimDuzenleme(String isim, String soyisim, String kkNo){
        String duzenlenmisHali=isim.toUpperCase().charAt(0)+ isim.substring(1).replaceAll("\\w","*")+
                soyisim.toUpperCase().charAt(0)+ soyisim.substring(1).replaceAll("\\w","*")+
                ",**** **** **** "+kkNo.substring(kkNo.length()-4);
        System.out.println(duzenlenmisHali);


    }


}
