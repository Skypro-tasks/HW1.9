public class Main {
    public static void main(String[] args) {
        Author kathySierra = new Author("Kathy", "Sierra");
        Book firstBook = new Book("Head First Java", kathySierra, 2003);

        Author bruceEckel = new Author("Bruce", "Eckel");
        Book secondBook = new Book("Thinking in Java", bruceEckel, 1998);

        secondBook.setPublishingYear(2008);
    }
}
