public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Romeo and Julietta", 250);
        Book book2 = new Book("Towers", 100);
        Book book3 = new Book("The Hobbit", 400);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public library", 1897, books);

        library.displayInfo();

    }
}
