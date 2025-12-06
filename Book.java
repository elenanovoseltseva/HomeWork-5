public class Book {
    public String title; //название книги
    public int releaseYear; //год выпуска
    public int pages; //количество страниц

    public Author author; //автор;

    public Book(String title, int releaseYear, int pages, Author author) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;

        //this.author = new Author(name, surname, rating);
        //System.out.println(this.title + " " + this.releaseYear + " " + this.pages + " " + this.author.name);
    }

    public boolean isBig() {
        return (pages > 500);
    }

    public int estimatePrice() {
        int factor = (int) Math.floor(Math.sqrt(author.rating));
        factor = 3 * pages * factor;
        return Math.max(factor, 250);
    }

    public boolean matches(String word) {
        //System.out.println(author.name);
        return (title.contains(word) || author.surname.contains(word) || author.name.contains(word));
    }
}
