package Assignment4;

public class Book {

	String title;
	boolean borrowed; 
	
	/** Constructor that stores bookTitle.  */
	public Book(String bookTitle) {
		title = bookTitle;
		borrowed = false; // It wasn't borrowed at the start.  
	}
	
	public void borrowed() {
		borrowed = true; 
	}
	
	public void returned() {
		borrowed = false; 
	}
	
	public boolean isBorrowed() {
		return borrowed; 
	}
	
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] arguments) {
		// Small test of the Book class.  
		Book example = new Book("The Da Vinci Code");
		System.out.println("Title (should be The Da Vinci Code):  " + example.getTitle());
		System.out.println("Borrowed?  (should be false):  " + example.isBorrowed());
		example.borrowed();
		System.out.println("Borrowed?  (should be true):  " + example.isBorrowed()); 
		example.returned();
		System.out.println("Borrowed?  (should be false):  " + example.isBorrowed());
	}
	
}
