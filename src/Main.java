public class Main {
    public static void main(String[] args) {
        Author kathySierra = new Author("Kathy", "Sierra");
        Book firstBook = new Book("Head First Java", kathySierra, 2003);

        Author bruceEckel = new Author("Bruce", "Eckel");
        Book secondBook = new Book("Thinking in Java", bruceEckel, 1998);

        Book thirdBook = new Book("Thinking in Java", bruceEckel, 2008);;

        secondBook.setPublishingYear(2008);

        System.out.println(firstBook);

        System.out.println(firstBook.equals(secondBook));
        System.out.println(secondBook.equals(thirdBook));

        System.out.println(firstBook.hashCode() == secondBook.hashCode());
        System.out.println(secondBook.hashCode() == thirdBook.hashCode());
    }
}
