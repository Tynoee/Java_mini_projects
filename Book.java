public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public static void main(String[] args) {
        Book book = new Book("The Mayor of Casterbridge", "Thomas Hardy", 1886);
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Book author: " + book.getAuthor());
        System.out.println("Publication year: " + book.getPublicationYear());
        System.out.println("Is available? " + book.isAvailable());

        book.setAvailable(false);
        System.out.println("Is available? " + book.isAvailable());
    }
}
