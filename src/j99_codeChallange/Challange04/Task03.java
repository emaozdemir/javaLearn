package j99_codeChallange.Challange04;

public class Task03 {

    // Task-> asagidaki fiyatlarin toplamini print eden code create ediniz.
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {
        String  str1= "$13.99";
        String str2= "$10.55";

        //1.yol
       /* double ystr1= Double.parseDouble(str1.replace("$", ""));
        double ystr2= Double.parseDouble(str2.replace("$", ""));
        System.out.println("(ystr1+ystr2) = " + (ystr1 + ystr2));


       //2.yol
        double yeniStr1 = Double.parseDouble(str1.replaceAll("[$]", ""));
        double yeniStr2 = Double.parseDouble(str2.replaceAll("[$]", ""));
        System.out.println(yeniStr1+yeniStr2);
        */
        //3.yol
        System.out.println("str1 = " + str1);//$13.99
        System.out.println("str2 = " + str2);//$10.55
        str1 = str1.replaceFirst("\\D", "");//String data type str1 variable numeric haric character hiçlk ile replace edildi
        str2 = str2.replaceFirst("\\D", "");//String data type str2 variable numeric haric character hiçlk ile replace edildi
        System.out.println("str1 = " + str1);//13.99
        System.out.println("str2 = " + str2);//10.55
        System.out.println("str1+str2 = " + str1 + str2);//24.54->13.9910.55
        double str1indoubleHali = Double.parseDouble(str1);//String data type str1 double olarak atandı
        double str2indoubleHali = Double.parseDouble(str2);//String data type str2 double olarak atandı
        System.out.println("str1indoubleHali = " + str1indoubleHali);//13.99
        System.out.println("str2indoubleHali = " + str2indoubleHali);//10.55
        System.out.println("toplam : " + (str1indoubleHali + str2indoubleHali));//24.54


    }

}
