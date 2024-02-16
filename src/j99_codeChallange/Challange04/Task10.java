package j99_codeChallange.Challange04;

public class Task10 {
    // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
    //1-replace() methodu char kabul eder ama replaceAll kabul etmez
    //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
    //(Regular Expressions)
    //   \\s butun boslukları istediğimiz seye ceviririz
    //   \\S bosluk disindaki tum karakterler
    //   \\w harfler ve rakamlar (a z A Z, 0 9)
    //   \\W harfler ve rakamlar disindaki tum karakterler
    //   \\d rakamlar 0 9
    //   \\D rakamlar disindaki tum karakterler


    // Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde print eden code create ediniz.

    public static void main(String[] args) {
        // 1.yol
        String metin ="   Java ogrenmek123 Cok guzel@      ";
        System.out.println( metin.trim().replace("C", "c").replaceAll("[^a-zA-Z ]", ""));
        // 2.yol
        String str = "   Java ogrenmek123 Cok guzel@      ";
        System.out.println("str = " + str);//    Java ogrenmek123 Cok guzel@
        str= str.replaceAll("\\d", "")
                .replace("C", "c")
                .replace("@", "")
                .trim();
        System.out.println("str = " + str);//Java ogrenmek cok guzel










        // Başlangıçtaki metni ekrana yazdır
        System.out.println("Başlangıçtaki Metin: " + metin);

        // Metni trim() metodunu kullanarak boşluklardan temizle
        metin = metin.trim();
        System.out.println("Trim Sonrası: " + metin);

        // Metni küçük harfe çevir ve "C" harfini "c" ile değiştir
        metin = metin.replace("C", "c");
        System.out.println("Replace Sonrası: " + metin);

        // Metindeki sayıları ve özel karakterleri temizle
        metin = metin.replaceAll("[^a-zA-Z ]", "");
        System.out.println("Temizlenmiş Metin: " + metin);

        // Elde edilen metni ekrana yazdır
        System.out.println("Sonuç: " + metin);




    }

}
