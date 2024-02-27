package j15_DataTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {
        // priod-> iki tarih arasındaki geçen tekrarlana datayı tutar..
        LocalDate bugun = LocalDate.now();
        LocalDate saimDT = LocalDate.of(1975, 02, 26);
        Period p1 = Period.between(bugun, saimDT);
        System.out.println("p1 = " + p1);//P-49Y
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths());//-588
        System.out.println("p1.getDays() = " + p1.getDays());//0
        System.out.println("p1.getYears() = " + p1.getYears());//-49

        System.out.println("****");
        System.out.println("bugun = " + bugun);
        Period period6Gun = Period.ofDays(6);
        System.out.println("bugun.minus(p1) = " + bugun.plus(p1));
        System.out.println("bugun.plus(period6Gun) = " + bugun.plus(period6Gun));

        // Task-> 02 ocak 2024 başlayan sdet kursu 11 aylık planlanırsa bitiş tarihini gun sayısını print eden code create ediniz.
        Period periodCw = Period.ofMonths(11);
        LocalDate kursStart = LocalDate.of(2024, 01, 02);


    }
}
