package j18_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder create etme.
        //1.yol
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1);//hiçlik
        System.out.println("sb1.length() = " + sb1.length());//0
        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        sb1.append("tuba hanım ");//sb1 e value eklendi
        System.out.println("sb1 = " + sb1);//tuba hanım
        System.out.println("sb1.length() = " + sb1.length());//11
        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        sb1.append("bilgisayari costu");
        System.out.println("sb1 = " + sb1);//tuba hanım bilgisayari costu
        System.out.println("sb1.length() = " + sb1.length());//28
        System.out.println("sb1.capacity() = " + sb1.capacity());//34
        //capacity asiminda yenicapacity=eskicapacity*2+2 sekilde hesaplanir.
        sb1.append(" insallah kendine gelir");
        System.out.println("sb1.capacity() = " + sb1.capacity());//34*2+2=70

        //2.yol
        StringBuilder sb2 = new StringBuilder("Konya'da bamya yemegi");//initialize(ilk deger) anatmıs sb olustu.
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.length() = " + sb2.length());//21
        System.out.println("sb2.capacity() = " + sb2.capacity());//16+sb2.length()=37
        //initialize edilmiş sb capacity=16+ilkdeğer.length()
        //trimtosize() -> capacity deli length fazlası değerleri siler
        sb2.trimToSize();
        System.out.println("sb2.length() = " + sb2.length());//21
        System.out.println("trimToSize sonrasi capacity= " + sb2.capacity());//21

        //3.yol
        StringBuilder sb3 = new StringBuilder(17);
        System.out.println("sb3 = " + sb3);//hiclik
        System.out.println("sb3.length() = " + sb3.length());//0
        System.out.println("sb3.capacity() = " + sb3.capacity());//17
        sb3.append("155'İ ararım cincix code");
        System.out.println("sb3 = " + sb3);//155' ararım cincix code
        System.out.println("sb3.length() = " + sb3.length());//23
        System.out.println("sb3.capacity() = " + sb3.capacity());//17*2+2=36

        //sb'de istenen index karakteri alma
        System.out.println("sb3.charAt(17) = " + sb3.charAt(17));//x
        // System.out.println("sb3.charAt(99) = " + sb3.charAt(99));//StringIndexOutOfBoundsException CTE

        //sb'deki belli araliktaki karakterleri alma
        System.out.println("sb3.substring(11) = " + sb3.substring(11));//  cincix code
        System.out.println("sb3.subSequence(12,21) = " + sb3.subSequence(12, 21));//cincix co
        System.out.println("sb3.substring(12,21) = " + sb3.substring(12, 21));//cincix co
        //CharSequence sbdeneme= sb3.subSequence(12, 21);

        //sb deki istenen index chari silme;

        System.out.println("sb3.deleteCharAt(23) = " + sb3.deleteCharAt(23));//155'İ ararım cincix cod
        System.out.println("sb3 = " + sb3);//155'İ ararım cincix cod

        //sb de istenen aralikta index karakterleri silme;

        System.out.println("sb3.delete(12,21) = " + sb3.delete(12, 21));//155'İ ararımod

        //sb e istenen char ve charlari girdi yapmak yani insert..

        System.out.println("sb3.insert(3,sb2,7) = " + sb3.insert(3, sb2, 7, 11));//155a ba'İ ararımod (sonuna kadar istersek sb2.length() yaparim.

        //sb deki istenen index char i update (set) etme;
        sb3.setCharAt(2, '$');
        System.out.println("sb3 = " + sb3);//15$a ba'İ ararımod

        //sb deki istenen index birden fazla char set etme;
        System.out.println("sb3.replace(1,7,\"*\") = " + sb3.replace(1, 7, "***"));//1***'İ ararımod

        // sb obj string variableye cevirme
        StringBuilder sb4 = new StringBuilder("safvet bey gecmis olsun");
        System.out.println("sb4 = " + sb4);//safvet bey gecmis olsun
        System.out.println("sb4.toString().toUpperCase() = " + sb4.toString().toUpperCase());//SAFVET BEY GECMİS OLSUN

        //str variableyi sb variaableye cevirme
        String str = "hayirli geceler";
        System.out.println("str = " + str);
        StringBuilder sb5 = new StringBuilder(str);
        System.out.println("sb5 = " + sb5);

        String str2 = new String(sb5);
        System.out.println(str2);

             /*
      compareTo()->metodunu iki SB'i eşitliğini kontrol etmek için ilk characterden itibaren tum characterleri karşılaştırır.
      eşit characterler için herhangi bir return vermezken farklı characterler için ascii table göre kaç değer geri veya ileri oldg
      print eder
      Tum characterler eşit ise 0 return eder
      ahan da Trick-> SB ile String variable compare edilirse :CTE -> elma armut kıyası olmaz...
              */
        StringBuilder sb6=new StringBuilder("Bahanesi olanin basarisi olmaz");
        StringBuilder sb7=new StringBuilder("Bahanesi olanin basarisi olmaz");
        StringBuilder sb8=new StringBuilder("Bahanesi olanin Basarisi olmaz");
        System.out.println("sb6.length() = " + sb6.length());//30
        System.out.println("sb6.capacity() = " + sb6.capacity());//46
        String str1="bahanesi olanin basarisi olmaz";
        System.out.println("sb6.compareTo(sb7) = " + sb6.compareTo(sb7));//0
        System.out.println("sb6.compareTo(sb8) = " + sb6.compareTo(sb8));//32//Fark, 'B' harfinin büyük/küçük harf olmasında.
        // 'B' harfinin ASCII değeri 66, 'b' harfinin ASCII değeri ise 98. Bu yüzden fark, 98 - 66 = 32 olur. Yani, sb6, sb8'den 32 büyüktür.

      /*  (compareTo metodu, iki StringBuilder nesnesini leksikografik olarak karşılaştırır. Yani, karakter dizilerini alfabenin sırasına göre karşılaştırır.
                sb6 ve sb7 tam olarak aynı karakter dizisini içeriyor. Bu yüzden, sb6.compareTo(sb7) sıfır döndürür, yani bunların eşit olduğunu gösterir.
        sb6 ve sb8 ise bir karakterin büyük/küçük harf farkıyla ayrılıyor. Leksikografik sıraya göre, büyük harfler küçük harflerden önce gelir. Bu yüzden, "Bahanesi olanin basarisi olmaz" (sb6) "Bahanesi olanin Basarisi olmaz" (sb8)'dan "daha küçük" olarak kabul edilir. Bu metot, pozitif bir değer döndürür (burada 32), yani sb6, sb8'den büyüktür.
        Özel olarak neden 32 döndüğüne gelince:
        Fark, 'B' harfinin büyük/küçük harf olmasında. 'B' harfinin ASCII değeri 66, 'b' harfinin ASCII değeri ise 98. Bu yüzden fark, 98 - 66 = 32 olur. Yani, sb6, sb8'den 32 büyüktür.
        Küçük harf olarak str1'den oluşturulmuş bir StringBuilder ile sb6'yı karşılaştırdığınızda ise, karakter dizileri aynı olduğu için büyük/küçük harf farkı göz ardı edilir ve sonuç 0 döner, yani bunların eşit olduğunu gösterir.)
*/
        //System.out.println("sb6.compareTo(str1) = " + sb6.compareTo(str1));//CTE elma ve armut kıyaslanmaz
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
        //sb esitliği
        System.out.println("sb6.equals(sb7) = " + sb6.equals(sb7));
        System.out.println("(sb6==sb7) = " + (sb6 == sb7));
        System.out.println("sb6.equals(str1) = " + sb6.equals(str1));
       // System.out.println("(sb6 == str1) = " + (sb6 == str1));CTE
        //TRİCK-> SB de equals() meth ayni == gibi hem referans hemde value karsılastırması yapar true veya false return eder.

        //sb de karekterleri indexe göre ters cevirme yani tersten yazma:
        System.out.println("sb6 = " + sb6);//Bahanesi olanin basarisi olmaz
        System.out.println("sb6.reverse() = " + sb6.reverse());//zamlo isirasab ninalo isenahaB


    }
}
