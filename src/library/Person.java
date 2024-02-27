package library;
public class Person {
    Book[] books;
    int id;
    String name;
    String surname;
    String role;
    int rentedDays;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Статус: " + role);

        if (books == null) {
            System.out.println("На данный момент у " + name + " " + surname + " нет книг");
        } else {
            for (Book book : books) {
                if (book != null) {
                    System.out.println("Книга на руках: " + book.title);
                }
            }
        }
    }
}