package j20_StaticKeyword.Task03;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int maxCredit;
    private List<Lesson> dersleri;

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
        this.dersleri = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        if (toplamKredisi() + lesson.getCredit() <= maxCredit) {
            dersleri.add(lesson);
            System.out.println(lesson.getName() + " dersi başarıyla eklendi.");
        } else {
            System.out.println(lesson.getName() + " dersi eklenemedi. Kredi sınırı aşıldı.");
        }
    }
    public int toplamKredisi() {
        int totalCredit = 0;
        for (Lesson lesson : dersleri) {
            totalCredit += lesson.getCredit();
        }
        return totalCredit;
    }
    public void printAvailableLessons() {
        System.out.println("Alabileceğiniz dersler:");
        for (Lesson lesson : dersleri) {
            System.out.println("- " + lesson.getName() + " (" + lesson.getCredit() + " kredi)");
        }
        System.out.println("Toplam kredi: " + toplamKredisi() + "/" + maxCredit);
    }
}