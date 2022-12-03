package by.nastya.springboot_book.models;

public class Book {
    private int id;
    private String author;
    private String nameOfBook;
    private String genre;

    public Book(){

    }

    public Book(int id, String author, String nameOfBook, String genre) {
        this.id = id;
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
