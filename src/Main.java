public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр", "Пушкин");
        Author author1 = new Author("Лев", "Толстой");
        Book book = new Book("Капитанская дочка",author,1836);
        Book book1 = new Book("Война и мир",author1,1863);
        book1.setYearBook(2024);
        System.out.println("Название книги: " + book.getNameBook() + " Автор: " + author.getName()+ " " + author.getSurname()+" Год публикации: "+ book.getYearBook());
        System.out.println("Название книги: " + book1.getNameBook() + " Автор: " + author1.getName()+ " " + author1.getSurname()+" Год публикации: "+ book1.getYearBook());
    }
}