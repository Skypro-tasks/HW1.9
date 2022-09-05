import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear){

        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }
    public String getBookName(){
        return bookName;
    }
    public Author getAuthor(){
        return author;
    }
    public int getPublishingYear(){
        return publishingYear;
    }

    public void setPublishingYear(int publicationYear){
        this.publishingYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book: " + bookName + ", " + author.toString() + ", " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}

