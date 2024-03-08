package j20_StaticKeyword.Task03;

public class Runner {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    public static void main(String[] args) {
        Student ogrenci = new Student("Ali", 10);

        Lesson ders1 = new Lesson("Matematik", 5);
        Lesson ders2 = new Lesson("Fizik", 4);
        Lesson ders3 = new Lesson("Kimya", 3);

        ogrenci.addLesson(ders1);
        ogrenci.addLesson(ders2);
        ogrenci.addLesson(ders3);

        ogrenci.printAvailableLessons();
    }



}


