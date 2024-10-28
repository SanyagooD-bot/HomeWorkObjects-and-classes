public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearBook;

    public Book(String nameBook,Author authorBook, int yearBook) {
        this.nameBook= nameBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public Author getAuthorBook() {
        return this.authorBook;
    }
    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
