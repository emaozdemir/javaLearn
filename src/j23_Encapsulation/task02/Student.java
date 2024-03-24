package j23_Encapsulation.task02;

import java.util.Scanner;

public class Student {//outher Class level
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student name is " + name + "\nHe-she is " + age + " years old";
    }

}//outher Class sonu

class StudentRunner {//inner class level

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("adinizi giriniz : ");
        String ad = input.nextLine();
        System.out.println("yasinizi giriniz : ");
        int yas = input.nextInt();
        Student ogrc1 = new Student(ad, yas);
        //  System.out.println("Student name is "+ogrc1.getName()+"\nHe-She is "+ogrc1.getAge()+" years old");
        System.out.println("ogrc1 = " + ogrc1);//cincix code
        Student ogrc2 = new Student("vedat bey", 23);
        System.out.println("ogrc2 = " + ogrc2);


    }
}//inner class sonu
