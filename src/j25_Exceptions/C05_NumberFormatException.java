package j25_Exceptions;

public class C05_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> numerik formetta olmayan bir value parseInt() meth call edilirse oluşan RTE
        String str1="1234567";
        System.out.println("str1 = " + str1);//1234567
        System.out.println("str1 = " + (str1+28));//123456728 concat yapar
        int sayi=Integer.parseInt(str1);
        System.out.println("sayi = " + sayi);//1234567
        System.out.println("sayi = " + (sayi+28));//1234595
        String id="12345l678";
//        int invalidId=Integer.parseInt(id);//RTE->NumberFormatException
//        System.out.println("invalidId = " + invalidId);
        int invalidId;
        try {
            invalidId=Integer.parseInt(id);//RTE->NumberFormatException -> catch block run
            System.out.println("bu mesajı okuyorsan try sorunsuz calıstı");
        }catch (NumberFormatException e){
            id="123451678";
            invalidId=Integer.parseInt(id);

            System.out.println("gercek id=  "+invalidId);
            System.out.println("bu mesajı okuyorsan try exc fırlattır catch block run oldu");
        }
        System.out.println("bu mesajı okuyorsan app sorunsuz calıstı");
    }
}
