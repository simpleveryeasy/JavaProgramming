package week13.inheritance;

public class Ebook extends Book{

    int size;
    int pages;

    public void read(){
        System.out.println("Reading the book from my tablet");
        System.out.println("title" + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);


     }
}
