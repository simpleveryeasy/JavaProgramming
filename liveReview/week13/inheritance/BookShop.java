package week13.inheritance;

public class BookShop {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Intro to Java";
        book1.author = "Savitch";
        book1.type = "Programming";
        book1.price = 85.90;

        System.out.println("book1 = " + book1);

        AudioBook audioBook1 = new AudioBook("Selenium CookBook", "Automation", "Unmesh",
                44.99, 40, "Johnny");

        audioBook1.listen();


    }
}
