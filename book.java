public class book {
    // Attributes
    String title;
    String author;
    int year_of_publication;

    // Constructor to initialize book details
    book(String title, String author, int year_of_publication) {
        this.title = title;
        this.author = author;
        this.year_of_publication = year_of_publication;
    }

    // Method to display book details
    void display() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author name: " + author);
        System.out.println("Year of publication: " + year_of_publication);
    }

    // Main method
    public static void main(String[] args) {
        // Creating c1
        book c1 = new book("Harry Potter 1", "J.K. Rowling", 2007);
        c1.display();

        // Creating c2
        book c2 = new book("Harry Potter 2", "J.K. Rowling", 2008);
        c2.display();
    }
}
