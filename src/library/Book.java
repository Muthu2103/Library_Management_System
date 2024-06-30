package library;

public class Book {
	
	int BookId;
	String BookName;
	String BookAuthor;
	String BookGenre;
	int BookQuantity;
	int BookPrice;
	
	
	public Book(int bookId, String bookName, String bookAuthor, String bookGenre, int bookQuantity, int bookPrice) {

		BookId = bookId;
		BookName = bookName;
		BookAuthor = bookAuthor;
		BookGenre = bookGenre;
		BookQuantity = bookQuantity;
		BookPrice = bookPrice;

	}


	public int getBookId() {
		return BookId;
	}


	public String getBookName() {
		return BookName;
	}


	public String getBookAuthor() {
		return BookAuthor;
	}


	public String getBookGenre() {
		return BookGenre;
	}


	public int getBookQuantity() {
		return BookQuantity;
	}


	public int getBookPrice() {
		return BookPrice;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}


	public void setBookGenre(String bookGenre) {
		BookGenre = bookGenre;
	}


	public void setBookQuantity(int bookQuantity) {
		BookQuantity = bookQuantity;
	}


	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	
	public void Checkoutbook() {
		BookQuantity--;
	}
	public void CheckInbook() {
		BookQuantity++;
	}

		
}
	
