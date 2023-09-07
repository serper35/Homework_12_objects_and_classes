import java.util.Objects;

public class Book {
    private final String title;

    private final Author author;
    private int yearOfPublication;

    public Book(Author author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }


    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Author - " + author + ". Title - " + title + ". Year of publication - " + yearOfPublication + ".";
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return author.equals(b2.author) && title.equals(b2.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
