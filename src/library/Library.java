package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Library {
	
	static Scanner sc = new Scanner(System.in);
	
	static HashMap<Integer, Book> hm = new HashMap<>();
	static HashMap<Integer, Student> stu = new HashMap<>();
	static List<CheckIn> ck = new ArrayList<>();

	public static void newBook() {   // Create New Book
		
		System.out.println("Enter Book Id");
		int  id = sc.nextInt();
		if(hm.containsKey(id)) {
			System.out.println("Book Id already exists ");
			return;
		}
		System.out.println("Enter Book Name");
		String  name = sc.next();
		for(Map.Entry<Integer, Book> h : hm.entrySet()) {
			Book book = h.getValue();
			if(book.getBookName().equals(name))return;
		}
		System.out.println("Enter Book  Author Name");
		String  Authorname = sc.next();
		System.out.println("Enter Book Genre");
		String  genre = sc.next();
		System.out.println("Enter Quantity");
		int  qu = sc.nextInt();
		System.out.println("Enter Book price");
		int  price = sc.nextInt();
		
		Book book = new Book(id, name,Authorname, genre , qu, price); //Creating object for new Book
		
		hm.put(id, book);  
		
		System.out.println("New Book Added ......");
	}
	
	public static void Display() {
		
		System.out.println("Book Id    Book Name    Book Author   Book Genre   Quantity Availabe");
		for(Map.Entry<Integer, Book> h : hm.entrySet()) {
			Book book = h.getValue();
			System.out.println(h.getKey()+"       "+book.getBookName()+"    "+book.getBookAuthor()+"      "
			+book.getBookGenre()+"      "+book.getBookQuantity());
		}
	}
	
	public static void Search() {  //show All Book
		
		System.out.println("1. Search by Id");
		System.out.println("2. Search by Book Name");
		System.out.println("3. Search by Author");
		System.out.println("4. Search by Genre");
		
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("Enter Book Id");
			int id = sc.nextInt();
			
			if(hm.containsKey(id)) {
				Book book = hm.get(id);
				System.out.println("Book Id : "+book.getBookId()+"   Book Name : "+book.getBookName()+"   Available Quantity : " 
				+ book.getBookQuantity()+"   Author: " + book.getBookAuthor()+"  Genre : " + book.getBookGenre());
			}else {
				System.out.println("Not Found");
			}
		}
		else if(n==2) {
			
			System.out.println("Enter Book Name");
			String s = sc.next();
			
			for(Map.Entry<Integer, Book> h : hm.entrySet()) {
				Book book = h.getValue();
				if(book.getBookName().equals(s)) {
					System.out.println("Book Found");
					System.out.println("Book Id : "+h.getKey()+"   Book Name : "+book.getBookName()+"   Available Quantity : " 
							+ book.getBookQuantity()+"   Author: " + book.getBookAuthor()+"  Genre : " + book.getBookGenre());
					return;
				}
			} 
			System.out.println("Book Not Found");
		}
		else if(n==3) {
			
			System.out.println("Enter Book Author Name");
			String s = sc.next();
			int c=0;
			
			for(Map.Entry<Integer, Book> h : hm.entrySet()) {
				Book book = h.getValue();
				if(book.getBookAuthor().equals(s)) {

					System.out.println("Book Id : "+h.getKey()+"   Book Name : "+book.getBookName()+"   Available Quantity : " 
							+ book.getBookQuantity()+"   Author: " + book.getBookAuthor()+"  Genre : " + book.getBookGenre());
					c++;
				}
			}
			if(c==0) {
				System.out.println("Not Found");
			}
		}
		else if(n==4) {
			
			System.out.println("Enter Book Genre");
			String s = sc.next();
			int c = 0;
			
			for(Map.Entry<Integer, Book> h : hm.entrySet()) {
				Book book = h.getValue();
				if(book.getBookGenre().equals(s)) {
					System.out.println("Book Id : "+h.getKey()+"   Book Name : "+book.getBookName()+"   Available Quantity : " 
							+ book.getBookQuantity()+"   Author: " + book.getBookAuthor()+"  Genre : " + book.getBookGenre());
				}
			} 
			if(c==0) {
				System.out.println("Not Found");
			}
		}else {
			System.out.println("Invalid Intput");
		}
		
	}
	
	public static void changeStock() {
		System.out.println("Enter Book id");
		int id = sc.nextInt();
		System.out.println("Enter quantity");
		int q = sc.nextInt();
		
		Book book = hm.get(id);
		
		book.setBookQuantity(q);
		System.out.println("Updated....");
	}

	public static void RegisterStudent() {
		
		System.out.println("Enter Student Id");
		int  id = sc.nextInt();
		System.out.println("Enter Student Name");
		String  name = sc.next();
		System.out.println("Enter Dept");
		String  qu = sc.next();
		System.out.println("Enter Year");
		int  year = sc.nextInt();
		
		Student student = new Student(id, name, qu, year);
		
		stu.put(id, student);
		
		System.out.println("Student Registered Successfully..!!");
		
	}

	public static void ShowAllStudent() {
		System.out.println("Student Id    Student Name");
		for(Map.Entry<Integer, Student> h : stu.entrySet()) {
			Student student = h.getValue();
			System.out.println(h.getKey()+"           "+student.getStudentName());
		}
		
	}

	public static void checkout() {
		
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		int count=0;
		if(!stu.containsKey(id)) {
			System.out.println("Student Has Not Registered Yet");
			return;
		}
		for(CheckIn c: ck) {
			if(id==c.getStudentId()) {
				count++;
			}		
		}
		if(count<3) {
			
			System.out.println("Enter Book Id ");
			int BookId = sc.nextInt();
			
			
			
			if(hm.containsKey(BookId)) {
				
				Book book = hm.get(BookId);
				
				if(book.getBookQuantity()!=0) {
					
					System.out.println("Enter Checkout Time");
					String outTime = sc.next();
					
					CheckIn check = new CheckIn(id,BookId,outTime);
					ck.add(check);
					
					book.Checkoutbook();
					
				}else {
					System.out.println("Book Not Availabe");
				}
				
			}
			else {
				System.out.println("Book not Found");
			}
			
			
		}
		else {
			System.out.println("Cannot Register More Than 3 Books at once");
		}
		
	}

	public static void checkIn() {
		
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		
		for(CheckIn c: ck) {
			if(c.getStudentId()==id) {
				System.out.println("Enter Book Id");
				int BookId = sc.nextInt();
				if(c.getBookId()==BookId) {
					System.out.println("Enter Checkin Time");
					String inTime = sc.next();
					c.setCheckin(inTime);
					Book book = hm.get(BookId);
					book.CheckInbook();
					ck.remove(c);
					return;
				}
			}
		}
		System.out.println("No Record Found");		
	}

	public static void BorrowedList() {
		for(CheckIn c:ck) {
			Book book = hm.get(c.getBookId());
			Student stud = stu.get(c.getStudentId());
			System.out.println(c.getStudentId()+"     "+stud.getStudentName()+"     "+c.getBookId()+"    "
			+book.getBookName()+"    "+c.getCheckout());
		}
		
	}
}
