import java.util.Arrays;

public class Lab02 {

    public static void main(String[] args) {
        Library lb1 = new Library(); //create a new library (object)
        
        // Initially, no books have been added.
        System.out.println("Total books ever added: " + Library.getTotalBooksAdded());
        
        lb1.addNewBook("Book1");
        lb1.addNewBook("Book2");
        lb1.addNewBook("Book3");
        
        // After adding three books.
        System.out.println("Total books ever added: " + Library.getTotalBooksAdded());
        lb1.getBooks();
        
        // Remove a book and then check the library
        if(lb1.removeBook("Book1")) {
            System.out.println("Book1 was removed.");
        } else {
            System.out.println("Book1 not found.");
        }
        
        lb1.getBooks();
        
        // Add another book to trigger resizing.
        lb1.addNewBook("Book4");
        System.out.println("Total books ever added: " + Library.getTotalBooksAdded());
        lb1.getBooks();
    }
}

class Library {
    // Static field to track the total number of books ever added across all instances.
    private static int totalBooksAdded = 0; 

    // Instance fields.
    private String[] Books;
    private int numberOfBooks; // tracks how many books are currently in the array

    // Default constructor: initializes the library with a capacity for 3 books.
    public Library() {
        this.Books = new String[3];
        this.numberOfBooks = 0;
    }

    // Static method to retrieve the total number of books ever added.
    public static int getTotalBooksAdded() {
        return totalBooksAdded;
    }

    // Adds a new book to the library, resizing the array if needed.
    public void addNewBook(String BookName) {
        // Check if the current array is full
        if (numberOfBooks == Books.length) {
            // Resize: create a new array with double the capacity.
            String[] BooksCopy = new String[Books.length * 2];
            for (int i = 0; i < Books.length; i++) {
                BooksCopy[i] = Books[i];
            }
            Books = BooksCopy;
            System.out.println("Library capacity increased to " + Books.length + ".");
        }
        
        // Add the new book at the next available position.
        Books[numberOfBooks] = BookName;
        numberOfBooks++;
        totalBooksAdded++;
        System.out.println("Book \"" + BookName + "\" successfully added.");
    }

    // Removes the first occurrence of the specified book by title.
    public boolean removeBook(String bookName) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (Books[i].equals(bookName)) {
                // Shift subsequent books to the left.
                for (int j = i; j < numberOfBooks - 1; j++) {
                    Books[j] = Books[j + 1];
                }
                // Set the now-unused last slot to null.
                Books[numberOfBooks - 1] = null;
                numberOfBooks--;
                return true;
            }
        }
        return false;
    }

    // Prints the list of current books in the library.
    public void getBooks() {
        // Only display the books that have been added (ignoring nulls).
        String[] currentBooks = Arrays.copyOfRange(Books, 0, numberOfBooks);
        System.out.println("Current Books: " + Arrays.toString(currentBooks));
    }
}
