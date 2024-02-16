package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLopp {

    public static void main(String[] args) {
        /*
      Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
      net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
       */


        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.
        System.out.println("for ile");
        for (int i=3; i<=20; i++){
            System.out.println(i+ " ");
        }


        System.out.println("while ile");
        int i=3;//while loopun baslangıs değeri tanımlandı
        while (i<=20){//i 20 den kücük esit oldukca devam edecek
            System.out.println(i+ " ");
            i++;//while loop sartı için değişim komutu tanımlandı.
        }



        // task02-> 7 kere javaCAN print eden code create ediniz
        //1.yol
        int num=7;
        while (num>=1){
            System.out.println("javaCAN");
            num--;
        }
        System.out.println("");
        //2.yol
        int a=1;
        while (a<=7){
            System.out.println(a + " javaCAN ");
            a++;
        }
        System.out.println("");
        //3.yol
        for (int c=1; c<=7; c++){
            System.out.println("javaCAN");
        }

        // task03->2 basamaklı tek sayıları print eden code create ediniz.
        System.out.println("task3");
        int j=11;
        while (j<100){
            System.out.print(j+" ");
            j+=2;
        }

        // task04->girilen ifadeyi tersten  print eden code create ediniz
        System.out.println("task04");
        Scanner scan = new Scanner(System.in);
      /*  System.out.println("bir metin giriniz");
        String str = scan.nextLine();
        int harfSayisi=str.length();
        while (harfSayisi>0){
            System.out.print(str.charAt(harfSayisi-1));
            harfSayisi--;
        }

        */

        // task05->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz
        System.out.println("task5");
        System.out.println("pozitif bir tam sayı giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;
        int start=1;
        if (sayi>=0){
            while (start<=sayi){
                toplam+=start;
                start++;
            }
        }else System.out.println("lütfen sadece pozitif giriniz");

        System.out.println("toplam = "+ toplam );

        // task06->girilen tamsayının faktöriyelini  print eden code create ediniz
        System.out.println("task06");
        Scanner scn = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int tamsayi=scn.nextInt();
        int factoriyel =1;
        while (tamsayi>1){
            factoriyel*=tamsayi;
            tamsayi--;
        }
        System.out.println("factoriyel = "+ factoriyel);











    }
}
