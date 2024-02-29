package j18_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder create etme.
        //1.yol
        StringBuilder sb1=new StringBuilder();
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
        StringBuilder sb2=new StringBuilder("Konya'da bamya yemegi");//initialize(ilk deger) anatmıs sb olustu.
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.length() = " + sb2.length());//21
        System.out.println("sb2.capacity() = " + sb2.capacity());//16+sb2.length()=37
        //initialize edilmiş sb capacity=16+ilkdeğer.length()
        //trimtosize() -> capacity deli length fazlası değerleri siler
        sb2.trimToSize();
        System.out.println("sb2.length() = " + sb2.length());//21
        System.out.println("trimToSize sonrasi capacity= " + sb2.capacity());//21

        //3.yol
        StringBuilder sb3=new StringBuilder(17);
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
        sb3.setCharAt(2,'$');
        System.out.println("sb3 = " + sb3);//15$a ba'İ ararımod

        //sb deki istenen index birden fazla char set etme;
        System.out.println("sb3.replace(1,7,\"*\") = " + sb3.replace(1, 7, "***"));//1***'İ ararımod

        // sb obj string variableye cevirme
        StringBuilder sb4=new StringBuilder("safvet bey gecmis olsun");
        System.out.println("sb4 = " + sb4);//safvet bey gecmis olsun
        System.out.println("sb4.toString().toUpperCase() = " + sb4.toString().toUpperCase());//SAFVET BEY GECMİS OLSUN

        //str variableyi sb variaableye cevirme
        String str="hayirli geceler";
        System.out.println("str = " + str);
        StringBuilder sb5=new StringBuilder(str);
        System.out.println("sb5 = " + sb5);

        String str2=new String(sb5);
        System.out.println(str2);



    }
}
