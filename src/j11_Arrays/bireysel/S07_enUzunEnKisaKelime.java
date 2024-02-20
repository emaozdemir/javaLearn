package j11_Arrays.bireysel;

public class S07_enUzunEnKisaKelime {
    public static void main(String[] args) {
        //verilen arraydeki en uzun en kisa kelimeleri yazdiran bir method olusturun.
        String[] isimler = {"ali", "ahmet", "sema", "can", "alattin"};
        enUzunEnKisaKelime(isimler);

    }

    public static void enUzunEnKisaKelime(String[] str) {
        String[] isimler = {"ali", "ahmet", "sema", "can", "alattin"};

        String enUzunKelime = str[0];
        String enKisaKelime= str[0];

        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > enUzunKelime.length()) {
                enUzunKelime = str[i];
            }
            if (str[i].length() < enKisaKelime.length()) {
                enKisaKelime = str[i];
            }
        }
        System.out.println("en uzun kelime "+ enUzunKelime);
        System.out.println("en kısa kelime "+enKisaKelime);


    }

}
