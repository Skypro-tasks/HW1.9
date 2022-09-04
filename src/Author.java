public class Author {
    String authorName;
    String authorSurname;

    Author(String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getAuthorSurname(){
        return authorSurname;
    }
}
