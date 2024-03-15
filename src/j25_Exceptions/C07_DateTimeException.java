package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C07_DateTimeException {
    public static void main(String[] args) {
        //DateTimeException -> tarih zaman value'lerde oluşan RTE
        try{
            LocalDate date =LocalDate.of(2023,2,29);
            System.out.println("bu mesajı okuyorsan try sorunsuz calıstı catch calısmadı.");
        }catch (DateTimeException e){
            System.out.println(e.getMessage()+" try exc firlattı catch yakaladi");
        }
        System.out.println("bu mesajı okuyorsan app sorunsuz calıstı.");
    }
}
