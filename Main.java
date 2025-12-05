public class Main {
    public static void main(String[] args) {

        Author auh1 = new Author("Иван", "Петров", 1);
        Author auh2 = new Author("Сергей", "Смирнов", 3);

        Book book1 = new Book("Новая книга", 1999, 1087, auh1);
        Book book2 = new Book("Старая книга", 1899, 1598, auh2);


        System.out.println("Книга: " + book1.title +
                "\nбольшая: " + book1.isBig() +
                "\nсодержит слово: " + book1.matches("Иван") +
                "\nоценочная стоимость: " + book1.estimatePrice());
    }
}