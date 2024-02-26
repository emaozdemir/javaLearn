package j15_DataTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)
        LocalDate bugun=LocalDate.now();
        //trick -> LocalDate variable için new keyword kullanilmaz.->CTE
        System.out.println("bugun = " + bugun);//bugun = 2024-02-26
        System.out.println("bugun.getYear() = " + bugun.getYear());//2024
        System.out.println("bugun.getMonth() = " + bugun.getMonth());//FEBRUARY
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());//26
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());//57
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());//MONDAY
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());//2

        System.out.println("****");
        LocalDate tarih1=LocalDate.of(1974,07,22);
        LocalDate tarih2=LocalDate.of(1985, Month.MARCH,12);
        //TANİMLANAN TARİHİN 1 date önceesi minus()-> 1 date sonrasinda ise plus() meth kullanilir.
        System.out.println("tarih1 = " + tarih1);
        System.out.println(tarih1.minusYears(34).plusMonths(34).plusDays(34));
        System.out.println("tarih1 = " + tarih1);

    }
}
