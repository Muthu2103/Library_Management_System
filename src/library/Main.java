package library;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int key = 0;
		
		while(key!=10) {
			System.out.println("1. Search Book");
			System.out.println("2. Show all Book");	
			System.out.println("3. Add new Book");	
			System.out.println("4. change quatntity Book");
			System.out.println("5. Register a Student");
			System.out.println("6. Show all Students Registered");
			System.out.println("7. Check In");
			System.out.println("8. Check out");	
			System.out.println("9. Books Borrowed Lis");	
			System.out.println("10. Exit Application");
			
			key = sc.nextInt();
			switch (key) {
			case 1: {	
				Library.Search();
				break;
			}
			case 2: {
				Library.Display();
				break;
			}
			case 3: {
				Library.newBook();
				break;
			}
			case 4: {
				Library.changeStock();
				break;
			}
			case 5: {
				Library.RegisterStudent();
				break;
			}
			case 6: {
				Library.ShowAllStudent();
				break;
			}
			case 7: {
				Library.checkIn();
				break;
			}
			case 8: {
				Library.checkout();
				break;
			}
			case 9: {
				Library.BorrowedList();
				break;
			}
			case 10: {
				break;
			}
			default:
				System.out.println("Unexpected value: " + key);
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println();
		}

	}

}
