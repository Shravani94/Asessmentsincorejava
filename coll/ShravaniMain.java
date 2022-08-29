package coll;
import java.util.*;



import java.util.ArrayList;
import java.util.List;

public class ShravaniMain {
	Scanner sc=new Scanner(System.in);
	List<BookLibrary> list=new ArrayList<BookLibrary>();
	List<BookLibrary> cse=new ArrayList<BookLibrary>();
	List<BookLibrary> ece=new ArrayList<BookLibrary>();
	List<BookLibrary> eee=new ArrayList<BookLibrary>();
	BookLibrary b1=new BookLibrary("c++","balaguru",120);
	BookLibrary b2=new BookLibrary("java","james",120);
	BookLibrary b3=new BookLibrary("machines","charavarthi",204);
	BookLibrary b4=new BookLibrary("circuits","thamson",150);
	BookLibrary b5=new BookLibrary("signals","ashok",170);
	BookLibrary b6=new BookLibrary("digitals","saipriya",220);
	
	
	public void createBooklist(BookLibrary booklibrary) {
		System.out.println(" adding enter 1 for cse/2 for ece/3 for eee ");
		int num=sc.nextInt();
		cse.add(b1);
		cse.add(b2);
		eee.add(b3);
		eee.add(b4);
		ece.add(b5);
		ece.add(b6);
		if(num==1) {
		cse.add(booklibrary);
		}
		else if(num==2) {
			ece.add(booklibrary);
		}
		else if(num==2) {
			eee.add(booklibrary);
		}
		else {
			System.out.println("enter valid data");
		}
	}
	//public List<BookLibrary> viewAllBooks(){
	public void viewAllBooks() {
		System.out.println("enter 1 for cse/2 for ece/3 for eee");
		int num=sc.nextInt();
		if(num==1) {
			for (BookLibrary i : cse)
				System.out.println(i);
		//return cse;
		}
		else if(num==2) {
			for (BookLibrary i : ece)
				System.out.println(i);
		}
		else if(num==2) {
			for (BookLibrary i : eee)
				System.out.println(i);
		}
		else {
			System.out.println("enter valid data");
		}
		//return null;
		
	}
	
}
