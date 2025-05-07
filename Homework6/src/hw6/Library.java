package hw6;

import java.util.ArrayList;

/**
 * Manages a collection of Book objects using an ArrayList.
 * Provides methods to add, remove, display, search, check out, and return books.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    /**
     * Adds a new book to the library if the ISBN is unique.
     *
     * @param book The Book object to add
     */
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("❌🙅‍♂️ Book with this ISBN already exists. 🫢🫣");
                return;
            }
        }
        books.add(book);
        System.out.println("✅ 🎉 Book added successfully.💪");
    }

    /**
     * Removes a book from the library by its ISBN.
     *
     * @param isbn The ISBN of the book to remove
     */
    public void removeBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                books.remove(b);
                System.out.println("🗑 Book removed.🚮");
                return;
            }
        }
        System.out.println(" ❌ ❌  Book not found.🫢🫣");
    }

    /**
     * Displays all books currently in the library.
     */
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("❌📚❌ No books in the library.👻 ");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    /**
     * Searches for books by title.
     *
     * @param title The title to search for
     */
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("❌🔍 No books found with that title.🫢🫣   ");
    }

    /**
     * Searches for books by author.
     *
     * @param author The author name to search for
     */
    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("🔍 ❌ No books found by that author. 🫢 🫣 ");
    }

    /**
     * Checks out a book by its ISBN if it's available.
     *
     * @param isbn The ISBN of the book to check out
     */
    public void checkOutBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (!b.isAvailable()) {
                    System.out.println("⛔ ❌ Book already checked out. 🫢 🫣");
                } else {
                    b.setAvailable(false);
                    System.out.println("📕 Book checked out.💪 🎉");
                }
                return;
            }
        }
        System.out.println("❌ Book not found. 🫢 🫣 ");
    }

    /**
     * Returns a book by its ISBN if it's currently checked out.
     *
     * @param isbn The ISBN of the book to return
     */
    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (b.isAvailable()) {
                    System.out.println("❌ 🙅‍♂️ Book is already available. 🫢 🫣 ");
                } else {
                    b.setAvailable(true);
                    System.out.println("📗 ✅ Book returned. 🎉 💪");
                }
                return;
            }
        }
        System.out.println("❌ 🚫 ❌Book not found. 🫢 🫣");
    }
}
