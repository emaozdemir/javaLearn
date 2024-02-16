package j07_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
concat() -> methodu içinde parametre aldığı String variable'ı çaloştığı string sonuna ekler(birleştirir)
Java '+' işleminde en az bir string ifade varsa artimetik toplama değil birleştirme yapılır.
 */
        String qa="Halit";
        String teamLead="Abdurrahman";
        System.out.println("concat öncesi qa = " + qa);//Halit
        System.out.println("qa.concat(teamLead) = " + qa.concat(teamLead));//HalitAbdurrahman
        System.out.println("teamLead.concat(qa) = " + teamLead.concat(qa));//AbdurrahmanHalit
        System.out.println("concat sonrası qa = " + qa);//Halit
        qa=teamLead.concat(qa);
        System.out.println("qa = " + qa);//AbdurrahmanHalit

           /*
        hap bilgi->String meth. variable'de kalici degil gecici degisiklik yapar
        String'de kalici degisiklik yapabilmek icin atama yapmak gerekir
         */

        /*
        hap Bilgi-> Concat meth. parametre olarak String harici bir deger alirsa o degeri Stringe cevirip concat(Birlestirme) yapar
        concat meth String type harici bir type girilirse bu data type Stringe cevirmek gerekir.Concat String harici kabul etmez
         */


        //System.out.println("teamLead.concat(23) = " + teamLead.concat(23)); hata verir böyle.
        System.out.println("teamLead.concat(23) = " + teamLead.concat(23+"$"));//Abdurrahman23$
        System.out.println("teamLead.concat(100+\"\") = " + teamLead.concat(100+""));//Abdurrahman100
        System.out.println("teamLead.concat(String.valueOf(54)) = " + teamLead.concat(String.valueOf(true)));//Abdurrahmantrue



    }
}
