/*Define a custom exception class BookNotAvailableException that extends Exception.
•	Create a class Library with:
•	An instance variable availableBooks (integer).
•	A method issueBook(int count) that:
1.	If count <= availableBooks, reduce the number of books and display “Book issued successfully”.
2.	Otherwise, throw BookNotAvailableException with the message “Requested books not available”.

In the main() method:
•	Initialize the library with 3 available books.
•	Try issuing 2 books (valid).
•	Then try issuing 2 more books (should throw the custom exception).*/

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    // Constructor
    Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    // Method to issue books
    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class Practical37 {
    public static void main(String[] args) {
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");
        Library lib = new Library(3);

        try {
            // First issue request
            lib.issueBook(2);

            // Second issue request
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
