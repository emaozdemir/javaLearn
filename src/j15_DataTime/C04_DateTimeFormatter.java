package j15_DataTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime bugun=LocalDateTime.now();//sistemde mevcut tarih ve saat datalari alindi.
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd * MMM * YY");//tarih print edecek format sekli
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("HH $ mm $ ss");//zaman print edecek format sekli
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh : mm : ss");//zaman print edecek format sekli
        System.out.println("dtf1.format(bugun) = " + dtf1.format(bugun));
        System.out.println("dtf2.format(bugun) = " + dtf2.format(bugun));
        System.out.println("dtf3.format(bugun) = " + dtf3.format(bugun));

    }
}
