package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();

        Book book2 = new Book("Hello Java", "Seo");

        Book book3 = new Book("JPA", "Kim", 700);

        Book[] books = {book1, book2, book3};
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
