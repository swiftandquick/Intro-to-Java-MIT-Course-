package Assignment4;

import java.util.*; // Including List and ArrayList.  

/** Each Library object is compose of Book object(s).  */
public class Library {

	private String address; 
	/** An array list of book objects.  */
	private List<Book> books; 
	
	Library(String rAddress) {
		address = rAddress; 
		books = new ArrayList<Book>();
	}
	
	public void printAddress() {
		System.out.println(address);
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm."); 
	}
	
	/** Add the book to the books array list.  */
	public void addBook(Book rBook) {
		books.add(rBook);
	}
	
	/**
	 * Note that book is the current book, and books is the array list. Check if the
	 * books array list contains the book with that title using for loop.  If the 
	 * book of the same title can be find in the books array list, then check whether 
	 * if the book is borrowed.  If the "borrowed" status is false, then I can borrow 
	 * the book.  If there is no book of same title can be find in the books array 
	 * list, then I will print out of message saying that the book is not in catalog.  
	 */
	public void borrowBook(String rTitle) {
		for (Book book : books) {
			if(rTitle.equals(book.getTitle())) {
				if (book.isBorrowed()) {
					System.out.println("Sorry, this book is already borrowed."); 
					return; // Breaks out of method.  
				}
				else {
					book.borrowed();
					System.out.println("You successfully borrowed " + book.getTitle() + ".");					
					return; // Breaks out of method.  
				}
			}
		}
		System.out.println("Sorry, this book is not in our catalog.");
	}
	
	/** 
	 * Same as borrowBook method, except here I check whether there is a book of same 
	 * title is in the books array list.  If it is, then 
	 */
	public void returnBook(String rTitle) {
		for(Book book : books) {
			if (rTitle.equals(book.getTitle())) {
				book.returned();
				System.out.println("You successfully returned " + book.getTitle() + ".");
			}
		}
	}
	
	/**
	 * Print each book that is currently in the books array list. Check whether the
	 * library is empty first.
	 */
	public void printAvailableBooks() {
		if (books.size() == 0) {
			System.out.println("No book in the catalog");
		}
		else {
			for (Book book : books) {
				System.out.println(book.getTitle());
			}
		}
	}
		
	public static void main(String[] args) {
		
		/** Create two libraries.  */
		Library firstLibrary = new Library("10 Main St."); 
		Library secondLibrary = new Library("228 Liberty St.");
		
		/** Add four books to the first library.  */
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince")); 
		firstLibrary.addBook(new Book("A Tale of Two Cities")); 
		firstLibrary.addBook(new Book("The Lord of the Rings")); 
		
		/** Print opening hours and the addresses.  */
		System.out.println("Library hours:  "); 
		printOpeningHours(); 
		System.out.println(); 
		
		System.out.println("Library addresses:  "); 
		firstLibrary.printAddress(); 
		secondLibrary.printAddress(); 
		System.out.println(); 
		
		/** Try to borrow The Lord of the Rings from both libraries.  */
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");		
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();
		
		/** Print the titles of all available books from both libraries.  */
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:"); 
		secondLibrary.printAvailableBooks();
		System.out.println(); 
		
		/** Return The Lord of the Rings to the first library.  */
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		
		/** Print the titles of the available books from the first library.  */
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		
	}
	
}
