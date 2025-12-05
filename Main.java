public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Новая книга", 1999, 107, "Иван", "Петров", 1);
        Book book2 = new Book("Старая книга", 1899, 1598, "Сергей", "Смирнов", 3);


        System.out.println("Книга: " + book1.title +
               "\nбольшая: " + book1.isBig() +
                "\nсодержит слово: " + book1.matches("Иван") +
               "\nоценочная стоимость: " + book1.estimatePrice());
    }
}