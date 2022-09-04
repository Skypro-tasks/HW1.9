public class Book {
    String bookName;
    Author author;
    int publishingYear;

    Book(String bookName, Author author, int publishingYear){

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
}

