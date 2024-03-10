package j23_Encapsulation.task03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employees {//outher Class level

private String name;
private int salary;
private String dobirtday;

    public Employees() {
    }

    public Employees(String name, int salary, String dobirtday) {
        this.name = name;
        this.salary = salary;
        this.dobirtday = dobirtday;
    }

    public int ageCalculator(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Period.between(LocalDate.parse(dobirtday,dtf), LocalDate.now()).getYears();
    }
    public String yasKontrol(){
        if (ageCalculator()<18){
            return "come back when you are 18 years old";
        }else if (ageCalculator()>18){
            return "Welcome to our company "+name+" your salary is "+salary;
        }else return  "we can have inter with you after that you can have a "+ salary+" salary";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDobirtday() {
        return dobirtday;
    }

    public void setDobirtday(String dobirtday) {
        this.dobirtday = dobirtday;
    }

    @Override
    public String toString() {
        return yasKontrol();
    }


}//outher class sonu

class  Runner {//inner class level
    public static void main(String[] args) {
        Employees obj=new Employees("sema",20000,"01/10/1992");
        System.out.println("obj = " + obj);


    }
}//inner class sonu
