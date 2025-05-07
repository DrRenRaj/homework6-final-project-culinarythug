package hw6;


/**
 * Represents a book in the library system.
 * Each book has a title, author, ISBN, and availability status.
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    /**
     * Constructs a new Book with the given title, author, and ISBN.
     * The book is initially available.
     *
     * @param title  The title of the book
     * @param author The author of the book
     * @param isbn   The ISBN of the book
     */
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }

    /**
     * Sets the availability status of the book.
     *
     * @param available true if the book is available, false if checked out
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * Returns a formatted string representation of the book's details.
     *
     * @return A string with title, author, ISBN, and status
     */
    @Override
    public String toString() {
        return String.format(" 🔤 Title: %s | ✍️  Author: %s | 📚 ISBN: %s | 👀 Status: %s",
                title, author, isbn, (isAvailable ? "✅Available 🎉 " : "❌🚫  Checked Out  🫢 🫣  "));
    }
}
