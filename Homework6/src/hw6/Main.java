package hw6;
import java.util.Scanner;

/**
 * Main class providing a menu-driven interface for the Library Management System.
 * Users can add, remove, search, display, check out, and return books.
 */
public class Main {
    /**
     * Entry point of the program. Displays a menu and handles user interaction.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📘 LIBRARY MENU 📘");
            System.out.println("1.➕ Add Book");
            System.out.println("2.➖ Remove Book");
            System.out.println("3.📚 Display All Books");
            System.out.println("4.🔎🔤 Search by Title");
            System.out.println("5.🔍✍️ Search by Author");
            System.out.println("6.🤳 Check Out Book → 🏡");
            System.out.println("7.⮐ 📖 Return Book");
            System.out.println("8.🏁 Exit");

            while (!sc.hasNextInt()) {
                System.out.print("⚠ Please enter a valid number: ");
                sc.next();
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("🔤🤓 Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("✍️🤓Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("📚🤓 Enter ISBN: ");
                    String isbn = sc.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    isbn = sc.nextLine();
                    library.removeBook(isbn);
                    break;
                case 3:
                    library.displayAllBooks();
                    break;
                case 4:
                    System.out.print("🔤🤓 Enter title to search: ");
                    title = sc.nextLine();
                    library.searchByTitle(title);
                    break;
                case 5:
                    System.out.print(" ✍️ 🤓️ Enter author to search: ");
                    author = sc.nextLine();
                    library.searchByAuthor(author);
                    break;
                case 6:
                    System.out.print("📚 🤓  Enter ISBN to check out: ");
                    isbn = sc.nextLine();
                    library.checkOutBook(isbn);
                    break;
                case 7:
                    System.out.print("📚 🤓   Enter ISBN to return: ");
                    isbn = sc.nextLine();
                    library.returnBook(isbn);
                    break;
                case 8:
                    System.out.println("👋🏁 Exiting Library System. Goodbye!🏁👋");
                    break;
                default:
                    System.out.println("🚫❌❌❌ Invalid option. Try again.🫢🫢🫣");
            }

        } while (choice != 8);

        sc.close();
    }
}
