package library;

public class Library {
    Book[] books = new Book[3];
    int maxRentDays = 5;
    int penaltyPerDay = 5000;

    void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Книга " + book.title + " успешно добавлена в библиотеку.");
                return;
            }
        }
        System.out.println("Невозможно добавить еще книгу, библиотека заполнена.");

    }

    void deleteBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i] = null;
                System.out.println("Книга " + book + " успешно удалена.");
                return;
            }
        }
        System.out.println("Книги  " + book + " нет в библиотеке + \".\"");

    }

    void lendBook(Person person, String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].title.equals(bookName)) {
                if (person.books[i] == null && person.role.equals("student")) {
                    person.books[i] = books[i];
                    books[i] = null;
                    System.out.println(person.name + " взял книгу " + bookName + ".");
                    return;

                } else {
                    System.out.println("У " + person.name + "уже есть книга" + bookName + ".");
                    return;
                }
            }

        }

    }

    void acceptBook(Person person, Book book) {
        for (int i = 0; i < person.books.length; i++) {
            if (person.books[i] != null && person.books[i].title.equals(book.title)) {
                System.out.println("Книга " + book.title + " есть у " + person.name + ".");
                return;
            }
            if (person.books[i] == null) {
                System.out.println("У " + person.name + " нет книги " + book.title + "!");
                return;
            }

        }
    }

    void rentedDaysCheck(Person person) {
        if (person.role.equals("student") || person.role.equals("teacher")) {
            return;
        }
        if (person.rentedDays > maxRentDays) {
            int daysOverdue = person.rentedDays - maxRentDays;
            System.out.println(person.name + " получил штраф в размере " + penaltyPerDay * daysOverdue + ".");
        }

    }
}






