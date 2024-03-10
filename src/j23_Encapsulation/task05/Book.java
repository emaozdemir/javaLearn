package j23_Encapsulation.task05;

import java.util.Scanner;

public class Book {//outher Class level
    private String bookName;
    private String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return
                "Book name is " + bookName +
                        " and Author is " + authorName;
    }
}//outher class sonu

class BookRunner {//inner Class level

    public static void main(String[] args) {
//        Book obj=new Book("Serenad","Zülfü Livaneli");
//        System.out.println("obj = " + obj);

        Scanner scan = new Scanner(System.in);
        System.out.println("okudugunuz kitabi giriniz: ");
        String kitap = scan.nextLine();
        System.out.println("okudugunuz kitabin yazari kimdir? ");
        String kitapYazari = scan.nextLine();
        Book obj = new Book(kitap,kitapYazari);
        System.out.println("obj = " + obj);
//        obj.setAuthorName(kitapYazari);
//        System.out.println("obj = " + obj);


    }
}//inner class sonu
































