package library;

public class CheckIn {

	int StudentId;
	int BookId;

	String Checkin;
	String Checkout;
	
	public CheckIn(int studentId, int bookId, String checkout) {

		StudentId = studentId;
		BookId = bookId;
		Checkout = checkout;
	}

	public int getStudentId() {
		return StudentId;
	}

	public int getBookId() {
		return BookId;
	}


	public String getCheckin() {
		return Checkin;
	}

	public String getCheckout() {
		return Checkout;
	}


	public void setCheckin(String checkin) {
		Checkin = checkin;
	}

	public void setCheckout(String checkout) {
		Checkout = checkout;
	}
	
	
	
	
	
}
