package library;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Person student = new Person();
        Person teacher = new Person();
        Person visitor = new Person();

        book.title = "Над пропастью во ржи";
        book.author = "Селинджер";

        book1.title = "1984";
        book1.author = "Оруэлл";

        book2.title = "Кошпендилер";
        book2.author = "Есенберлин";


        book3.title = "Сага о Форсайтах";
        book3.author = "Голсуорси";



        student.id = 123456;
        student.name = "Иван";
        student.surname = "Иванов";
        student.role = "Студент";

        teacher.id = 345678;
        teacher.name = "Петр";
        teacher.surname = "Петров";
        teacher.role = "Преподаватель";

        visitor.id = 12345667;
        visitor.name = "Алихан";
        visitor.surname = "Бокейханов";
        visitor.role = "Посетитель";



        library.addBook(book);
        System.out.println();
        library.lendBook(student, "Над пропастью во ржи");
        System.out.println();
        library.acceptBook(student, book);


        library.addBook(book3);
        System.out.println();
        System.out.println();
        library.lendBook(teacher, "Сага о Форсайтах");
        System.out.println();
        library.acceptBook(teacher, book);

        System.out.println();
        library.addBook(book2);
        library.lendBook(visitor, "Кошпендилер");
        System.out.println();
        library.acceptBook(visitor, book);
    }
}
