package coll;

public class BookLibrary {
	String bookname;
	String BookAuthor;
	int cost;
	public BookLibrary(String bookname, String bookAuthor, int cost) {
		super();
		this.bookname = bookname;
		BookAuthor = bookAuthor;
		this.cost = cost;
	}
	public BookLibrary(){
		bookname=getBookname();
		BookAuthor= getBookAuthor();
		cost=getCost();
	}
	
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String toString()
	{
		return "Bookname : "+bookname+" AuthourName :"+BookAuthor+" cost :"+cost;
	}
}