package library;

public class Book {
    int id;
    String title;
    String author;
    String condition;
    int daysBorrowed;

    void updateCondition(Book book) {
        if (daysBorrowed <= 5 ) {
            condition = "Отличном";
        } else if (daysBorrowed <= 10) {
            condition = "Хорошем";
        } else if (daysBorrowed <= 30) {
            condition = "Удовлетворительном";
        } else {
            condition = "Плохом";
        }
    }
}
